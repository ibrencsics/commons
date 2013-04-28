package com.sencha.gxt.theme.blue.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources {
  private static BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator _instance0 = new BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator();
  private void menuParentInitializer() {
    menuParent = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "menuParent",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 12, 9, false, false
    );
  }
  private static class menuParentInitializer {
    static {
      _instance0.menuParentInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return menuParent;
    }
  }
  public com.google.gwt.resources.client.ImageResource menuParent() {
    return menuParentInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GBOGIYXDEVB{-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}a.GBOGIYXDEVB{cursor:" + ("pointer")  + ";display:" + ("block")  + ";line-height:" + ("16px")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("3px"+ " " +"27px"+ " " +"3px"+ " " +"21px")  + ";position:" + ("relative")  + ";text-decoration:" + ("none")  + ";white-space:") + (("nowrap")  + ";color:" + ("#222")  + ";}.GBOGIYXDHVB{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + ("1px")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";}.GBOGIYXDGVB{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:" + ("top")  + ";width:" + ("16px") ) + (";position:" + ("absolute")  + ";right:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";}.GBOGIYXDFVB{height:" + ((BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:") + (("auto")  + ";background-position:" + ("left")  + ";background-repeat:" + ("no-repeat")  + ";}")) : ((".GBOGIYXDEVB{-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}a.GBOGIYXDEVB{cursor:" + ("pointer")  + ";display:" + ("block")  + ";line-height:" + ("16px")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("3px"+ " " +"21px"+ " " +"3px"+ " " +"27px")  + ";position:" + ("relative")  + ";text-decoration:" + ("none")  + ";white-space:") + (("nowrap")  + ";color:" + ("#222")  + ";}.GBOGIYXDHVB{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + ("1px")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";}.GBOGIYXDGVB{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:" + ("top")  + ";width:" + ("16px") ) + (";position:" + ("absolute")  + ";left:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";}.GBOGIYXDFVB{height:" + ((BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (BlueMenuItemAppearance_BlueMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:") + (("auto")  + ";background-position:" + ("right")  + ";background-repeat:" + ("no-repeat")  + ";}"));
      }
      public java.lang.String menuItem(){
        return "GBOGIYXDEVB";
      }
      public java.lang.String menuItemArrow(){
        return "GBOGIYXDFVB";
      }
      public java.lang.String menuItemIcon(){
        return "GBOGIYXDGVB";
      }
      public java.lang.String menuListItem(){
        return "GBOGIYXDHVB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAJCAYAAAAGuM1UAAAAb0lEQVR42mOwaLr2n4EUYNtx979Ny2XiNWmXnvo/9fT//5bEagJp6Dv87X/X4T//HTtv/idKQ8iCl/+TVn38n77g6n+j0v3/CWoIWvDmf+iUc/+1CvcTZ4N798n/mnn7iPeDTsEB4kPJquocSfEAADQCQiRH/8LtAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource menuParent;
  private static com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      menuParent(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("menuParent", menuParent());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'menuParent': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources::menuParent()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources::style()();
    }
    return null;
  }-*/;
}
