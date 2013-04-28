package org.ib.commons.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainGUI_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.ib.commons.client.MainGUI>, org.ib.commons.client.MainGUI.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.ib.commons.client.MainGUI owner) {

    org.ib.commons.client.MainGUI_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.ib.commons.client.MainGUI_BinderImpl_GenBundle) GWT.create(org.ib.commons.client.MainGUI_BinderImpl_GenBundle.class);
    com.sencha.gxt.widget.core.client.TabItemConfig shortTextTabConfig = (com.sencha.gxt.widget.core.client.TabItemConfig) GWT.create(com.sencha.gxt.widget.core.client.TabItemConfig.class);
    com.sencha.gxt.widget.core.client.TabItemConfig longTextTabConfig2 = (com.sencha.gxt.widget.core.client.TabItemConfig) GWT.create(com.sencha.gxt.widget.core.client.TabItemConfig.class);
    com.sencha.gxt.widget.core.client.TabItemConfig keystoreTabConfig = (com.sencha.gxt.widget.core.client.TabItemConfig) GWT.create(com.sencha.gxt.widget.core.client.TabItemConfig.class);
    org.ib.commons.client.MainGUI_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    org.ib.commons.client.services.keystore2.KeystoreServiceLayout f_KeystoreServiceLayout1 = (org.ib.commons.client.services.keystore2.KeystoreServiceLayout) GWT.create(org.ib.commons.client.services.keystore2.KeystoreServiceLayout.class);
    com.sencha.gxt.widget.core.client.TabPanel folder = (com.sencha.gxt.widget.core.client.TabPanel) GWT.create(com.sencha.gxt.widget.core.client.TabPanel.class);

    shortTextTabConfig.setText("X.509");
    longTextTabConfig2.setText("XML Processor");
    keystoreTabConfig.setText("Keystore");
    folder.add(f_KeystoreServiceLayout1, keystoreTabConfig);



    owner.folder = folder;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return folder;
  }
}
