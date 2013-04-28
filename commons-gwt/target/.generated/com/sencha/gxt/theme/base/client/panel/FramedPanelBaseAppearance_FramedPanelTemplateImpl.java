package com.sencha.gxt.theme.base.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class FramedPanelBaseAppearance_FramedPanelTemplateImpl implements com.sencha.gxt.theme.base.client.panel.FramedPanelBaseAppearance.FramedPanelTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance.ContentPanelStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div><div class="{1}"></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance_ContentPanelStyle_body_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance_ContentPanelStyle_footer_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.panel.FramedPanelBaseAppearance_FramedPanelTemplate_render_SafeHtml__ContentPanelStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.panel.FramedPanelBaseAppearance_FramedPanelTemplate_render_SafeHtml__ContentPanelStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance_ContentPanelStyle_body_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance_ContentPanelStyle_footer_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
