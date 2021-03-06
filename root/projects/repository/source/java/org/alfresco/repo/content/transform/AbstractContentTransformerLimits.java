/*
 * Copyright (C) 2005-2012 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.repo.content.transform;

import java.util.Map;

import org.alfresco.repo.content.AbstractContentReader;
import org.alfresco.service.cmr.repository.ContentReader;
import org.alfresco.service.cmr.repository.ContentWriter;
import org.alfresco.service.cmr.repository.TransformationOptionLimits;
import org.alfresco.service.cmr.repository.TransformationOptions;
import org.springframework.beans.factory.BeanNameAware;

/**
 * Provides transformation limits for {@link org.alfresco.repo.content.transform.ContentTransformer}
 * implementations.
 * <p>
 * This class maintains the limits and provides methods that combine limits:
 * a) for the transformer as a whole
 * b) for specific combinations if source and target mimetypes
 * c) for the {@link TransformationOptions} provided for a specific transform.
 * 
 * @author Alan Davis
 */
public abstract class AbstractContentTransformerLimits extends ContentTransformerHelper implements ContentTransformer, BeanNameAware
{
    /** Transformer wide Time, KBytes and page limits */
    private TransformationOptionLimits limits = new TransformationOptionLimits();

    /**
     * Time, KBytes and page limits by source and target mimetype combination.
     * The first map's key is the source mimetype. The second map's key is the
     * target mimetype and the value are the limits. */
    private Map<String, Map<String, TransformationOptionLimits>> mimetypeLimits;
    
    /** Indicates if 'page' limits are supported. */
    private boolean pageLimitsSupported;
    
    /** For debug **/
    protected TransformerDebug transformerDebug;

    /** The bean name. Used in debug only. */
    private String beanName;

    /**
     * Indicates if 'page' limits are supported.
     * @return false by default.
     */
    protected boolean isPageLimitSupported(String sourceMimetype, String targetMimetype, TransformationOptions options)
    {
        return pageLimitsSupported;
    }
    
    /**
     * Indicates if 'page' limits are supported.
     */
    public void setPageLimitsSuported(boolean pageLimitsSupported)
    {
        this.pageLimitsSupported = pageLimitsSupported;
    }

    /**
     * Helper setter of the transformer debug. 
     * @param transformerDebug
     */
    public void setTransformerDebug(TransformerDebug transformerDebug)
    {
        this.transformerDebug = transformerDebug;
    }

    public boolean isTransformable(String sourceMimetype, String targetMimetype, TransformationOptions options)
    {
        throw new IllegalStateException("Method should no longer be called. Override isTransformableMimetype in subclass.");
    }
    
    /**
     * {@inheritDoc}<p>
     * 
     * Implementation calls the deprecated overloaded method without the sourceSize parameter
     * and then {@link #isTransformableSize(String, long, String, TransformationOptions)}.
     */
    @Override
    public boolean isTransformable(String sourceMimetype, long sourceSize, String targetMimetype, TransformationOptions options)
    {
        // To make TransformerDebug output clearer, check the mimetypes and then the sizes.
        // If not done, 'unavailable' transformers due to size might be reported even
        // though they cannot transform the source to the target mimetype.

        return
            isSupportedTransformation(sourceMimetype, targetMimetype, options) &&
            isTransformableMimetype(sourceMimetype, targetMimetype, options) &&
            isTransformableSize(sourceMimetype, sourceSize, targetMimetype, options);
    }

    /**
     * Indicates if this transformer is able to transform the given source mimetype 
     * to the target mimetype.
     */
    @Override
    public boolean isTransformableMimetype(String sourceMimetype, String targetMimetype, TransformationOptions options)
    {
        return isTransformable(sourceMimetype, targetMimetype, options);
    }

    /**
     * Indicates if this transformer is able to transform the given {@code sourceSize}.
     * The {@code maxSourceSizeKBytes} property may indicate that only small source files
     * may be transformed.
     * @param sourceSize size in bytes of the source. If negative, the source size is unknown.
     * @return {@code true} if the source is transformable.
     */
    @Override
    public boolean isTransformableSize(String sourceMimetype, long sourceSize, String targetMimetype, TransformationOptions options)
    {
        boolean sizeOkay = true;
        if (sourceSize >= 0)
        {
            // if maxSourceSizeKBytes == 0 this implies the transformation is disabled
            long maxSourceSizeKBytes = getMaxSourceSizeKBytes(sourceMimetype, targetMimetype, options);
            sizeOkay = maxSourceSizeKBytes < 0 || (maxSourceSizeKBytes > 0 && sourceSize <= maxSourceSizeKBytes*1024);
            if (!sizeOkay && transformerDebug.isEnabled())
            {
                transformerDebug.unavailableTransformer(this, maxSourceSizeKBytes);
            }
        }
        return sizeOkay;
    }

    /**
     * Returns the maximum source size (in KBytes) allowed given the supplied values.
     * @return 0 if the the transformation is disabled, -1 if there is no limit, otherwise the size in KBytes.
     */
    @Override
    public long getMaxSourceSizeKBytes(String sourceMimetype, String targetMimetype, TransformationOptions options)
    {
        long maxSourceSizeKBytes = -1;
        
        // The maxSourceSizeKbytes value is ignored if this transformer is able to use
        // page limits and the limits include a pageLimit. Normally used in the creation
        // of icons. Note the readLimitKBytes value is not checked as the combined limits
        // only have the max or limit KBytes value set (the smaller value is returned).
        TransformationOptionLimits limits = getLimits(sourceMimetype, targetMimetype, options);
        if (!isPageLimitSupported(sourceMimetype, targetMimetype, options) || limits.getPageLimit() <= 0)
        {
            maxSourceSizeKBytes = limits.getMaxSourceSizeKBytes();
        }
        
        return maxSourceSizeKBytes;
    }

    /**
     * Gets the timeout (ms) on the InputStream after which an IOExecption is thrown
     * to terminate very slow transformations or a subprocess is terminated (killed).
     * @return timeoutMs in milliseconds. If less than or equal to zero (the default)
     *         there is no timeout.
     */
    protected long getTimeoutMs()
    {
        return limits.getTimeoutMs();
    }

    /**
     * Sets a timeout (ms) on the InputStream after which an IOExecption is thrown
     * to terminate very slow transformations or to terminate (kill) a subprocess.
     * @param timeoutMs in milliseconds. If less than or equal to zero (the default)
     *                  there is no timeout.
     *                  If greater than zero the {@code readLimitTimeMs} must not be set.
     */
    public void setTimeoutMs(long timeoutMs)
    {
        limits.setTimeoutMs(timeoutMs);
    }

    /**
     * Gets the limit in terms of the amount of data read (by time) to limit transformations where
     * only the start of the content is needed. After this limit is reached the InputStream reports
     * end of file.
     * @return readLimitBytes if less than or equal to zero (the default) there is no limit.
     */
    protected long getReadLimitTimeMs()
    {
        return limits.getReadLimitTimeMs();
    }

    /**
     * Sets a limit in terms of the amount of data read (by time) to limit transformations where
     * only the start of the content is needed. After this limit is reached the InputStream reports
     * end of file.
     * @param readLimitBytes if less than or equal to zero (the default) there is no limit.
     *                       If greater than zero the {@code timeoutMs} must not be set.
     */
    public void setReadLimitTimeMs(long readLimitTimeMs)
    {
        limits.setReadLimitTimeMs(readLimitTimeMs);
    }

    /**
     * Gets the maximum source content size, to skip transformations where
     * the source is just too large to expect it to perform. If the source is larger
     * the transformer indicates it is not available.
     * @return maxSourceSizeKBytes if less than or equal to zero (the default) there is no limit.
     */
    protected long getMaxSourceSizeKBytes()
    {
        return limits.getMaxSourceSizeKBytes();
    }

    /**
     * Sets a maximum source content size, to skip transformations where
     * the source is just too large to expect it to perform. If the source is larger
     * the transformer indicates it is not available.
     * @param maxSourceSizeKBytes if less than or equal to zero (the default) there is no limit.
     *                       If greater than zero the {@code readLimitKBytes} must not be set.
     */
    public void setMaxSourceSizeKBytes(long maxSourceSizeKBytes)
    {
        limits.setMaxSourceSizeKBytes(maxSourceSizeKBytes);
    }

    /**
     * Gets the limit in terms of the about of data read to limit transformations where
     * only the start of the content is needed. After this limit is reached the InputStream reports
     * end of file.
     * @return readLimitKBytes if less than or equal to zero (the default) no limit should be applied.
     */
    protected long getReadLimitKBytes()
    {
        return limits.getReadLimitKBytes();
    }

    /**
     * Sets a limit in terms of the about of data read to limit transformations where
     * only the start of the content is needed. After this limit is reached the InputStream reports
     * end of file.
     * @param readLimitKBytes if less than or equal to zero (the default) there is no limit.
     *                       If greater than zero the {@code maxSourceSizeKBytes} must not be set.
     */
    public void setReadLimitKBytes(long readLimitKBytes)
    {
        limits.setReadLimitKBytes(readLimitKBytes);
    }

    /**
     * Get the maximum number of pages read before an exception is thrown.
     * @return If less than or equal to zero (the default) no limit should be applied.
     */
    protected int getMaxPages()
    {
        return limits.getMaxPages();
    }

    /**
     * Set the number of pages read from the source before an exception is thrown.
     * 
     * @param maxPages the number of pages to be read from the source. If less than or equal to zero
     *        (the default) no limit is applied.
     */
    public void setMaxPages(int maxPages)
    {
        limits.setMaxPages(maxPages);
    }

    /**
     * Get the page limit before returning EOF.
     * @return If less than or equal to zero (the default) no limit should be applied.
     */
    protected int getPageLimit()
    {
        return limits.getPageLimit();
    }

    /**
     * Set the number of pages read from the source before returning EOF.
     * 
     * @param pageLimit the number of pages to be read from the source. If less 
     *        than or equal to zero (the default) no limit is applied.
     */
    public void setPageLimit(int pageLimit)
    {
        limits.setPageLimit(pageLimit);
    }

    /**
     * Returns max and limit values for time, size and pages in a single operation. 
     */
    protected TransformationOptionLimits getLimits()
    {
        return limits; 
    }

    /**
     * Sets max and limit values for time, size and pages in a single operation. 
     */
    public void setLimits(TransformationOptionLimits limits)
    {
        this.limits = limits; 
    }

    /**
     * Gets the max and limit values for time, size and pages per source and target mimetype
     * combination.
     */
    protected Map<String, Map<String, TransformationOptionLimits>> getMimetypeLimits()
    {
        return mimetypeLimits;
    }

    /**
     * Sets the max and limit values for time, size and pages per source and target mimetype
     * combination.
     */
    public void setMimetypeLimits(Map<String, Map<String, TransformationOptionLimits>> mimetypeLimits)
    {
        this.mimetypeLimits = mimetypeLimits;
    }

    /**
     * Returns max and limit values for time, size and pages for a specified source and
     * target mimetypes, combined with this Transformer's general limits and optionally
     * the supplied transformation option's limits.
     */
    protected TransformationOptionLimits getLimits(ContentReader reader, ContentWriter writer,
            TransformationOptions options)
    {
        return (reader == null || writer == null)
            ? limits.combine(options.getLimits())
            : getLimits(reader.getMimetype(), writer.getMimetype(), options);
    }

    /**
     * Returns max and limit values for time, size and pages for a specified source and
     * target mimetypes, combined with this Transformer's general limits and optionally
     * the supplied transformation option's limits.
     */
    protected TransformationOptionLimits getLimits(String sourceMimetype, String targetMimetype,
            TransformationOptions options)
    {
        // Get the limits for the source and target mimetypes
        TransformationOptionLimits mimetypeLimits = null;
        if (this.mimetypeLimits != null)
        {
            boolean anySource = false;
            Map<String, TransformationOptionLimits> targetLimits =
                this.mimetypeLimits.get(sourceMimetype);
            if (targetLimits == null)
            {
                targetLimits = this.mimetypeLimits.get("*");
                anySource = true;
            }
            if (targetLimits != null)
            {
                mimetypeLimits = targetLimits.get(targetMimetype);
                if (mimetypeLimits == null)
                {
                    mimetypeLimits = targetLimits.get("*");
                    
                    // Allow for the case where have specific source and target mimetype limits
                    // and general source limits (avoid having to repeat the general values in
                    // each specific source definition)
                    if (mimetypeLimits == null && !anySource)
                    {
                        targetLimits = this.mimetypeLimits.get("*");
                        if (targetLimits != null)
                        {
                            mimetypeLimits = targetLimits.get(targetMimetype);
                            if (mimetypeLimits == null)
                            {
                                mimetypeLimits = targetLimits.get("*");
                            }
                        }
                    }
                }
            }
        }
    
        TransformationOptionLimits combined = (mimetypeLimits == null) ? limits : limits.combine(mimetypeLimits);
        return (options == null) ? combined : combined.combine(options.getLimits());
    }

    /**
     * Sets the Spring bean name - only for use in debug.
     */
    @Override
    public void setBeanName(String beanName)
    {
        this.beanName = beanName;
    }

    /**
     * Returns the Spring bean name - only for use in debug.
     */
    public String getBeanName()
    {
        return beanName;
    }

    /**
     * Pass on any limits to the reader. Will only do so if the reader is an
     * {@link AbstractContentReader}.
     * @param reader passed to {@link #transform(ContentReader, ContentWriter, TransformationOptions).
     * @param writer passed to {@link #transform(ContentReader, ContentWriter, TransformationOptions).
     * @param options passed to {@link #transform(ContentReader, ContentWriter, TransformationOptions).
     */
    protected void setReaderLimits(ContentReader reader, ContentWriter writer,
            TransformationOptions options)
    {
        if (reader instanceof AbstractContentReader)
        {
            AbstractContentReader abstractContentReader = (AbstractContentReader)reader;
            TransformationOptionLimits limits = getLimits(reader, writer, options);
            abstractContentReader.setLimits(limits);
            abstractContentReader.setTransformerDebug(transformerDebug);
        }
    }
}