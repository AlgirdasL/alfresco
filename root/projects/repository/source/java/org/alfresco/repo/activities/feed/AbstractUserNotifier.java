package org.alfresco.repo.activities.feed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.alfresco.model.ContentModel;
import org.alfresco.repo.domain.activities.ActivityFeedEntity;
import org.alfresco.service.cmr.activities.ActivityService;
import org.alfresco.service.cmr.admin.RepoAdminService;
import org.alfresco.service.cmr.repository.NodeRef;
import org.alfresco.service.cmr.repository.NodeService;
import org.alfresco.service.cmr.repository.TemplateService;
import org.alfresco.service.cmr.site.SiteInfo;
import org.alfresco.service.cmr.site.SiteService;
import org.alfresco.service.namespace.NamespaceException;
import org.alfresco.service.namespace.NamespaceService;
import org.alfresco.service.namespace.QName;
import org.alfresco.util.ModelUtil;
import org.alfresco.util.Pair;
import org.alfresco.util.PropertyCheck;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;

/**
 * 
 * @since 4.0
 *
 */
public abstract class AbstractUserNotifier implements UserNotifier
{
    protected static Log logger = LogFactory.getLog(FeedNotifier.class);

    protected ActivityService activityService;
    protected NamespaceService namespaceService;
    protected RepoAdminService repoAdminService;
    protected NodeService nodeService;
    protected SiteService siteService;

	public void setActivityService(ActivityService activityService)
	{
		this.activityService = activityService;
	}

	public void setNamespaceService(NamespaceService namespaceService)
	{
		this.namespaceService = namespaceService;
	}

	public void setRepoAdminService(RepoAdminService repoAdminService)
	{
		this.repoAdminService = repoAdminService;
	}

	public void setNodeService(NodeService nodeService)
	{
		this.nodeService = nodeService;
	}

	public void setSiteService(SiteService siteService)
	{
		this.siteService = siteService;
	}

	/**
     * Perform basic checks to ensure that the necessary dependencies were injected.
     */
    protected void checkProperties()
    {
        PropertyCheck.mandatory(this, "activityService", activityService);
        PropertyCheck.mandatory(this, "nodeService", nodeService);
        PropertyCheck.mandatory(this, "namespaceService", namespaceService);
        PropertyCheck.mandatory(this, "siteService", siteService);
    }

	protected abstract boolean skipUser(NodeRef personNodeRef);
	protected abstract Long getFeedId(NodeRef personNodeRef);
	protected abstract void notifyUser(NodeRef personNodeRef, String subjectText, Map<String, Object> model, NodeRef templateNodeRef);
	
    private void addSiteName(String siteId, Map<String, String> siteNames)
    {
        if (siteId == null)
        {
            return;
        }
        
        String siteName = siteNames.get(siteId);
        if (siteName == null)
        {
            SiteInfo site = siteService.getSite(siteId);
            if (site == null)
            {
                return;
            }
            
            String siteTitle = site.getTitle();
            if (siteTitle != null && siteTitle.length() > 0)
            {
                siteName = siteTitle;
            }
            else
            {
                siteName = siteId;
            }
            
            siteNames.put(siteId, siteName);
        }
    }
    
	public Pair<Integer, Long> notifyUser(final NodeRef personNodeRef, String subjectText, Map<String, String> siteNames,
			String shareUrl, int repeatIntervalMins, NodeRef templateNodeRef)
	{
		Map<QName, Serializable> personProps = nodeService.getProperties(personNodeRef);

		String feedUserId = (String)personProps.get(ContentModel.PROP_USERNAME);

		if (skipUser(personNodeRef))
		{
			// skip
			return null;
		}

		// where did we get up to ?
		Long feedDBID = getFeedId(personNodeRef);

		// own + others (note: template can be changed to filter out user's own activities if needed)
		List<ActivityFeedEntity> feedEntries = activityService.getUserFeedEntries(feedUserId, FeedTaskProcessor.FEED_FORMAT_JSON, null, false, false, null, null, feedDBID);
		
		if (feedEntries.size() > 0)
		{
			long userMaxFeedId = -1L;

			Map<String, Object> model = new HashMap<String, Object>();
			List<Map<String, Object>> activityFeedModels = new ArrayList<Map<String, Object>>();

			for (ActivityFeedEntity feedEntry : feedEntries)
			{
				Map<String, Object> map = null;
				try
				{
					map = feedEntry.getModel();
					activityFeedModels.add(map);

					String siteId = feedEntry.getSiteNetwork();
					addSiteName(siteId, siteNames);

					long feedId = feedEntry.getId();
					if (feedId > userMaxFeedId)
					{
						userMaxFeedId = feedId;
					}
				}
				catch (JSONException je)
				{
					// skip this feed entry
					logger.warn("Skip feed entry for user ("+feedUserId+"): " + je.getMessage());
					continue;
				}
			}

			if (activityFeedModels.size() > 0)
			{
				model.put("activities", activityFeedModels);
				model.put("siteTitles", siteNames);
				model.put("repeatIntervalMins", repeatIntervalMins);
				model.put("feedItemsMax", activityService.getMaxFeedItems());
				model.put("feedItemsCount", activityFeedModels.size());

				// add Share info to model
				model.put(TemplateService.KEY_PRODUCT_NAME, ModelUtil.getProductName(repoAdminService));

				Map<String, Serializable> personPrefixProps = new HashMap<String, Serializable>(personProps.size());
				for (QName propQName : personProps.keySet())
				{
					try
					{
						String propPrefix = propQName.toPrefixString(namespaceService);
						personPrefixProps.put(propPrefix, personProps.get(propQName));
					}
					catch (NamespaceException ne)
					{
						// ignore properties that do not have a registered namespace
						logger.warn("Ignoring property '" + propQName + "' as it's namespace is not registered");
					}
				}

				model.put("personProps", personPrefixProps);

				// send
				notifyUser(personNodeRef, subjectText, model, templateNodeRef);

				return new Pair<Integer, Long>(activityFeedModels.size(), userMaxFeedId);
			}
		}

		return null;
	}
}
