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

import java.io.File;
import java.net.URLConnection;

import org.alfresco.repo.content.MimetypeMap;
import org.alfresco.service.cmr.repository.ContentReader;
import org.alfresco.service.cmr.repository.ContentWriter;
import org.alfresco.service.cmr.repository.TransformationOptions;
import org.alfresco.util.TempFileProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.htmlparser.Parser;
import org.htmlparser.beans.StringBean;
import org.htmlparser.util.ParserException;

/**
 * @see http://htmlparser.sourceforge.net/
 * @see org.htmlparser.beans.StringBean
 * 
 * Tika Note - could be convered to use the Tika HTML parser,
 *  but we'd potentially need a custom text handler to replicate
 *  the current settings around links and non-breaking spaces.
 * 
 * @author Derek Hulley
 */
public class HtmlParserContentTransformer extends AbstractContentTransformer2
{
    @SuppressWarnings("unused")
    private static final Log logger = LogFactory.getLog(HtmlParserContentTransformer.class);
    
    /**
     * Only support HTML to TEXT.
     */
    @Override
    public boolean isTransformableMimetype(String sourceMimetype, String targetMimetype, TransformationOptions options)
    {
        if (!MimetypeMap.MIMETYPE_HTML.equals(sourceMimetype) ||
            !MimetypeMap.MIMETYPE_TEXT_PLAIN.equals(targetMimetype))
        {
            // only support HTML -> TEXT
            return false;
        }
        else
        {
            return true;
        }
    }

    public void transformInternal(ContentReader reader, ContentWriter writer,  TransformationOptions options)
            throws Exception
    {
        // We can only work from a file
        File htmlFile = TempFileProvider.createTempFile("HtmlParserContentTransformer_", ".html");
        reader.getContent(htmlFile);
        
        // Fetch the encoding of the HTML, if it's set in Alfresco
        String encoding = reader.getEncoding();
        
        // Create the extractor
        EncodingAwareStringBean extractor = new EncodingAwareStringBean();
        extractor.setCollapse(false);
        extractor.setLinks(false);
        extractor.setReplaceNonBreakingSpaces(false);
        extractor.setURL(htmlFile, encoding);        
        // get the text
        String text = extractor.getStrings();
        // write it to the writer
        writer.putContent(text);
        
        // Tidy up
        htmlFile.delete();
    }
    
    /**
     * A version of {@link StringBean} which allows control of the
     *  encoding in the underlying HTML Parser.
     * Unfortunately, StringBean doesn't allow easy over-riding of
     *  this, so we have to duplicate some code to control this.
     * This allows us to correctly handle HTML files where the encoding
     *  is specified against the content property (rather than in the 
     *  HTML Head Meta), see ALF-10466 for details.
     */
    class EncodingAwareStringBean extends StringBean
    {
        private static final long serialVersionUID = -9033414360428669553L;

        /**
         * Sets the File to extract strings from, and the encoding
         *  it's in (if known to Alfresco)
         *   
         * @param file The File that text should be fetched from.
         * @param encoding The encoding of the input
         */
        public void setURL(File file, String encoding)
        {
            String previousURL = getURL();
            String newURL = file.getAbsolutePath();
            
            if ( (previousURL == null) || (!newURL.equals(previousURL)) )
            {
                try
                {
                    URLConnection conn = getConnection();

                    if (null == mParser)
                    {
                        mParser = new Parser(newURL);
                    }
                    else
                    {
                        mParser.setURL(newURL);
                    }
                    
                    if (encoding != null)
                    {
                        mParser.setEncoding(encoding);
                    }
                    
                    mPropertySupport.firePropertyChange(PROP_URL_PROPERTY, previousURL, getURL());
                    mPropertySupport.firePropertyChange(PROP_CONNECTION_PROPERTY, conn, mParser.getConnection());
                    setStrings();
                }
                catch (ParserException pe)
                {
                    updateStrings(pe.toString());
                }
            }
        }
    }
}
