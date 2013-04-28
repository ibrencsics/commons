package org.ib.commons.client.services.keystore2;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class KeystoreServiceLayout_MyUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.ib.commons.client.services.keystore2.KeystoreServiceLayout>, org.ib.commons.client.services.keystore2.KeystoreServiceLayout.MyUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.ib.commons.client.services.keystore2.KeystoreServiceLayout owner) {

    org.ib.commons.client.services.keystore2.KeystoreServiceLayout_MyUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.ib.commons.client.services.keystore2.KeystoreServiceLayout_MyUiBinderImpl_GenBundle) GWT.create(org.ib.commons.client.services.keystore2.KeystoreServiceLayout_MyUiBinderImpl_GenBundle.class);
    org.ib.commons.client.services.keystore2.KeystoreServiceLayout_MyUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.sencha.gxt.core.client.util.Margins leftMargins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
    com.sencha.gxt.core.client.util.Margins centerMargins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
    com.sencha.gxt.core.client.util.Margins rightMargins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
    com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData leftLayoutData = new com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData();
    com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData centerLayoutData = new com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData();
    com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData rightLayoutData = new com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData();
    org.ib.commons.client.services.keystore2.browser.KeystoreBrowser ksBrowser = (org.ib.commons.client.services.keystore2.browser.KeystoreBrowser) GWT.create(org.ib.commons.client.services.keystore2.browser.KeystoreBrowser.class);
    org.ib.commons.client.services.keystore2.editor.KeystoreEditor ksEditor = (org.ib.commons.client.services.keystore2.editor.KeystoreEditor) GWT.create(org.ib.commons.client.services.keystore2.editor.KeystoreEditor.class);
    org.ib.commons.client.services.keystore2.request.CertificateRequestService ksRequest = (org.ib.commons.client.services.keystore2.request.CertificateRequestService) GWT.create(org.ib.commons.client.services.keystore2.request.CertificateRequestService.class);
    org.ib.commons.client.services.keystore2.issuer.IssuerService ksIssuer = (org.ib.commons.client.services.keystore2.issuer.IssuerService) GWT.create(org.ib.commons.client.services.keystore2.issuer.IssuerService.class);
    com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer f_HorizontalLayoutContainer1 = (com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer) GWT.create(com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.class);

    leftMargins.setBottom(4);
    leftMargins.setLeft(4);
    leftMargins.setRight(4);
    leftMargins.setTop(4);
    centerMargins.setBottom(4);
    centerMargins.setLeft(4);
    centerMargins.setRight(4);
    centerMargins.setTop(8);
    rightMargins.setBottom(4);
    rightMargins.setLeft(4);
    rightMargins.setRight(4);
    rightMargins.setTop(4);
    leftLayoutData.setMargins(leftMargins);
    centerLayoutData.setMargins(centerMargins);
    rightLayoutData.setMargins(rightMargins);
    f_HorizontalLayoutContainer1.add(ksBrowser, leftLayoutData);
    f_HorizontalLayoutContainer1.add(ksEditor, centerLayoutData);
    f_HorizontalLayoutContainer1.add(ksRequest, rightLayoutData);
    f_HorizontalLayoutContainer1.add(ksIssuer, rightLayoutData);



    owner.ksBrowser = ksBrowser;
    owner.ksEditor = ksEditor;
    owner.ksIssuer = ksIssuer;
    owner.ksRequest = ksRequest;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HorizontalLayoutContainer1;
  }
}
