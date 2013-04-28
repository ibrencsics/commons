package com.sencha.gxt.theme.base.client.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class TabPanelBaseAppearance_ItemTemplateImpl implements com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.ItemTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.TabPanelStyle style, com.sencha.gxt.widget.core.client.TabItemConfig config){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <li><a class="{0}"></a><a class="{1}"><em class="{2}"><span class="{3}"><span class="{4}">{5}</span></span></em></a></li>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripClose_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabRight_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabLeft_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripInner_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripText_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.widget.core.client.TabItemConfig_text_ValueProviderImpl.INSTANCE.getValue(config)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_ItemTemplate_render_SafeHtml__TabPanelStyle_style__TabItemConfig_config___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_ItemTemplate_render_SafeHtml__TabPanelStyle_style__TabItemConfig_config___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripClose_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabRight_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabLeft_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripInner_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance_TabPanelStyle_tabStripText_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.widget.core.client.TabItemConfig_text_ValueProviderImpl.INSTANCE.getValue(config));
    return outer;
  }
}
