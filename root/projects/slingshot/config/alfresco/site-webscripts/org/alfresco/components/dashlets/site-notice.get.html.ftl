<@markup id="css" >
   <#-- CSS Dependencies -->
   <@link rel="stylesheet" type="text/css" href="${url.context}/res/components/dashlets/notice.css" group="dashlets" />
</@>

<@markup id="js">
   <#-- JavaScript Dependencies -->
   <@script type="text/javascript" src="${url.context}/res/modules/simple-dialog.js" group="dashlets"/>
   <@script type="text/javascript" src="${url.context}/res/modules/editors/tiny_mce.js" group="dashlets"/>
   <@script type="text/javascript" src="${url.context}/res/components/dashlets/notice.js" group="dashlets"/>
</@>

<@markup id="widgets">
   <@inlineScript group="dashlets">
      var editDashletEvent = new YAHOO.util.CustomEvent("onDashletConfigure");
   </@>
   <@createWidgets group="dashlets"/>
   <@inlineScript group="dashlets">
      editDashletEvent.subscribe(dashlet.onConfigClick, dashlet, true);
   </@>
</@>

<@markup id="html">
   <@uniqueIdDiv>
      <#assign el=args.htmlid?html>
      <div class="dashlet notice-dashlet">
         <div class="title" id="${el}-title"><#if args.title?? && args.title != "">${args.title?html}<#else>${msg("notice.defaultTitle")}</#if></div>
         <div class="body scrollableList"<#if args.height??> style="height: ${args.height}px;"</#if>>
            <div id="${el}-text" class="text-content">
               <#if args.text?? && args.text != "">${args.text}<#else><p>${msg("notice.defaultText")}</p></#if>
            </div>
         </div>
      </div>
   </@>
</@>

