<@markup id="css" >
   <#-- CSS Dependencies -->
   <@link href="${url.context}/res/components/console/category-manager.css" group="console"/>
</@>

<@markup id="js">
   <#-- JavaScript Dependencies -->
   <@script src="${url.context}/res/components/console/consoletool.js" group="console"/>
   <@script src="${url.context}/res/components/console/category-manager.js" group="console"/>
</@>

<@markup id="widgets">
   <@createWidgets group="console"/>
</@>

<@markup id="html">
   <#assign el=args.htmlid?html>
   <@uniqueIdDiv>
      <div id="${el}-body" class="category-manager">
         <!-- List panel -->
         <div id="${el}-list">
            <div class="yui-u first">
               <div class="title">${msg("title.category-manager")}</div>
            </div>
            <div class="yui-u align-left">
               <div id="${el}-category-manager"></div>
            </div>
         </div>
      </div>
   </@>
</@>

