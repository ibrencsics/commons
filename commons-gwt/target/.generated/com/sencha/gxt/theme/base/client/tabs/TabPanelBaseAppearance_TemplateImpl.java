package com.sencha.gxt.theme.base.client.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class TabPanelBaseAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.TabPanelStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}"><div class="{2}"><ul class="{3} {4}"><li class="{5}"></li><div class="x-clear"></div></ul></div></div><div class="{6} {7}"></div></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tab_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabHeader_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripWrap_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStrip_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripTop_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabEdge_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabBody_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabBodyTop_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_Template_render_SafeHtml__TabPanelStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_Template_render_SafeHtml__TabPanelStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tab_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabHeader_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripWrap_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStrip_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripTop_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabEdge_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabBody_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabBodyTop_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
