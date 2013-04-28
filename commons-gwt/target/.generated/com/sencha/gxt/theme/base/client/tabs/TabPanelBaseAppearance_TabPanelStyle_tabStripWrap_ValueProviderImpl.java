package com.sencha.gxt.theme.base.client.tabs;

public class TabPanelBaseAppearance_TabPanelStyle_tabStripWrap_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.TabPanelStyle, java.lang.String> {
  public static final TabPanelBaseAppearance_TabPanelStyle_tabStripWrap_ValueProviderImpl INSTANCE = new TabPanelBaseAppearance_TabPanelStyle_tabStripWrap_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.TabPanelStyle object) {
    return object.tabStripWrap();
  }
  public void setValue(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.TabPanelStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "tabStripWrap";
  }
}
