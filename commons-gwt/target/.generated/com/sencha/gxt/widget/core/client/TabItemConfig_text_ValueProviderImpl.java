package com.sencha.gxt.widget.core.client;

public class TabItemConfig_text_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.widget.core.client.TabItemConfig, java.lang.String> {
  public static final TabItemConfig_text_ValueProviderImpl INSTANCE = new TabItemConfig_text_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.widget.core.client.TabItemConfig object) {
    return object.getText();
  }
  public void setValue(com.sencha.gxt.widget.core.client.TabItemConfig object, java.lang.String value) {
    object.setText(value);
  }
  public String getPath() {
    return "text";
  }
}
