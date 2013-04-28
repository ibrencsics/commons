package com.sencha.gxt.theme.base.client.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BoxLayoutDefaultAppearance_BoxLayoutBaseResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutBaseResources {
  private static BoxLayoutDefaultAppearance_BoxLayoutBaseResources_default_InlineClientBundleGenerator _instance0 = new BoxLayoutDefaultAppearance_BoxLayoutBaseResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GBOGIYXDJP{overflow:" + ("hidden")  + ";}.GBOGIYXDKP{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";}")) : ((".GBOGIYXDJP{overflow:" + ("hidden")  + ";}.GBOGIYXDKP{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";}"));
      }
      public java.lang.String container(){
        return "GBOGIYXDJP";
      }
      public java.lang.String inner(){
        return "GBOGIYXDKP";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutBaseResources::style()();
    }
    return null;
  }-*/;
}
