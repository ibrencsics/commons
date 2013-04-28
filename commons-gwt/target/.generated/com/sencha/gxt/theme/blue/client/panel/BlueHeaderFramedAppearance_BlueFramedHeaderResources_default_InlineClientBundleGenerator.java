package com.sencha.gxt.theme.blue.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.panel.BlueHeaderFramedAppearance.BlueFramedHeaderResources {
  private static BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator _instance0 = new BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator();
  private void headerBackgroundInitializer() {
    headerBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "headerBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 300, false, false
    );
  }
  private static class headerBackgroundInitializer {
    static {
      _instance0.headerBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return headerBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource headerBackground() {
    return headerBackgroundInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.panel.BlueHeaderFramedAppearance.BlueHeaderFramedStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GBOGIYXDCYB{padding:" + ("4px"+ " " +"5px"+ " " +"2px"+ " " +"3px")  + ";position:" + ("relative")  + ";}.GBOGIYXDFYB{float:" + ("right")  + ";}.GBOGIYXDEYB .GBOGIYXDFYB{width:" + ("18px")  + ";}.GBOGIYXDEYB .GBOGIYXDGYB{right:" + ("20px")  + ";}.GBOGIYXDGYB{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GBOGIYXDDYB{float:" + ("left")  + ";}.GBOGIYXDCYB{height:") + (((BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";color:" + ("#15428b")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#99bbe8")  + ";height:" + ("auto")  + ";line-height:" + ("15px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#99bbe8") ) + (";border-top:" + ("none")  + ";border-right:" + ("none")  + ";border-left:" + ("none")  + ";border-bottom:" + ("none")  + ";padding-right:" + ("0")  + ";}")) : ((".GBOGIYXDCYB{padding:" + ("4px"+ " " +"3px"+ " " +"2px"+ " " +"5px")  + ";position:" + ("relative")  + ";}.GBOGIYXDFYB{float:" + ("left")  + ";}.GBOGIYXDEYB .GBOGIYXDFYB{width:" + ("18px")  + ";}.GBOGIYXDEYB .GBOGIYXDGYB{left:" + ("20px")  + ";}.GBOGIYXDGYB{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GBOGIYXDDYB{float:" + ("right")  + ";}.GBOGIYXDCYB{height:") + (((BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (BlueHeaderFramedAppearance_BlueFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";color:" + ("#15428b")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#99bbe8")  + ";height:" + ("auto")  + ";line-height:" + ("15px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#99bbe8") ) + (";border-top:" + ("none")  + ";border-left:" + ("none")  + ";border-right:" + ("none")  + ";border-bottom:" + ("none")  + ";padding-left:" + ("0")  + ";}"));
      }
      public java.lang.String header(){
        return "GBOGIYXDCYB";
      }
      public java.lang.String headerBar(){
        return "GBOGIYXDDYB";
      }
      public java.lang.String headerHasIcon(){
        return "GBOGIYXDEYB";
      }
      public java.lang.String headerIcon(){
        return "GBOGIYXDFYB";
      }
      public java.lang.String headerText(){
        return "GBOGIYXDGYB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.panel.BlueHeaderFramedAppearance.BlueHeaderFramedStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.panel.BlueHeaderFramedAppearance.BlueHeaderFramedStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhAQAsAcQAAAAAAP///5m76ISgxKvH7LjP7rrQ7rzS77/U8MHV8MLW8Mja8tTi9L3T78TY8cbZ8cnb8svd883e89Dg9M/f89Lh9NXk9djm9tfl9drn9vP3+////wAAAAAAAAAAAAAAACH5BAEAABsALAAAAAABACwBAAUyoKBl2YVZTDVRElEYR4MkivMsUCTtfO//wKBwSCwaj0hfYMlsOp/QqHRKrVqv2Kx1EAIAOw==";
  private static com.google.gwt.resources.client.ImageResource headerBackground;
  private static com.sencha.gxt.theme.blue.client.panel.BlueHeaderFramedAppearance.BlueHeaderFramedStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      headerBackground(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("headerBackground", headerBackground());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'headerBackground': return this.@com.sencha.gxt.theme.blue.client.panel.BlueHeaderFramedAppearance.BlueFramedHeaderResources::headerBackground()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.panel.BlueHeaderFramedAppearance.BlueFramedHeaderResources::style()();
    }
    return null;
  }-*/;
}
