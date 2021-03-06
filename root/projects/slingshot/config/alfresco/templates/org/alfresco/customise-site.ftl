<#include "include/alfresco-template.ftl" />
<@templateHeader/>

<@templateBody>
   <@markup id="alf-hd">
   <div id="alf-hd">
      <@region id="header" scope="global" />
      <@region id="title" scope="template" />
      <@region id="navigation" scope="template" />
      <h1 class="sub-title"><#if page.titleId??>${msg(page.titleId)!page.title}<#else>${page.title}</#if></h1>
   </div>
   </@>
   <#if access>
      <@markup id="bd">
      <div id="bd">
         <@region id="customise-pages" scope="template" />
      </div>
      </@>
   </#if>
</@>

<@templateFooter>
   <@markup id="alf-ft">
   <div id="alf-ft">
      <@region id="footer" scope="global" />
   </div>
   </@>
</@>
