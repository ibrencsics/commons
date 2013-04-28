package org.ib.commons.client.services.keystore2.issuer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class IssuerService_MyUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.ib.commons.client.services.keystore2.issuer.IssuerService>, org.ib.commons.client.services.keystore2.issuer.IssuerService.MyUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<table> <tr> <td><span id='{0}'></span></td> <td><span id='{1}'></span></td> </tr> <tr> <td><span id='{2}'></span></td> <td><span id='{3}'></span></td> </tr> <tr> <td><span id='{4}'></span></td> <td><span id='{5}'></span></td> </tr> <tr> <td><span id='{6}'></span></td> <td><span id='{7}'></span></td> </tr> <tr> <td><span id='{8}'></span></td> <td><span id='{9}'></span></td> </tr> </table>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.ib.commons.client.services.keystore2.issuer.IssuerService owner) {

    org.ib.commons.client.services.keystore2.issuer.IssuerService_MyUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.ib.commons.client.services.keystore2.issuer.IssuerService_MyUiBinderImpl_GenBundle) GWT.create(org.ib.commons.client.services.keystore2.issuer.IssuerService_MyUiBinderImpl_GenBundle.class);
    org.ib.commons.client.services.keystore2.issuer.IssuerService_MyUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.sencha.gxt.core.client.util.Margins outerMargins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
    com.sencha.gxt.core.client.util.Margins centerMargins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData topData = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData middleData = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData bottomData = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbCertReq = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbIssuer = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbTarget = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbTargetAlias = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbTargetKeyPass = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel4 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1, domId2, domId3, domId4, domId5, domId6, domId7, domId8, domId9).asString());
    com.google.gwt.user.client.ui.Button btnIssueCert = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer f_VerticalLayoutContainer3 = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.class);
    com.sencha.gxt.widget.core.client.FramedPanel f_FramedPanel2 = (com.sencha.gxt.widget.core.client.FramedPanel) GWT.create(com.sencha.gxt.widget.core.client.FramedPanel.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer f_VerticalLayoutContainer1 = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.class);

    outerMargins.setBottom(4);
    outerMargins.setLeft(4);
    outerMargins.setRight(4);
    outerMargins.setTop(4);
    centerMargins.setBottom(0);
    centerMargins.setLeft(4);
    centerMargins.setRight(4);
    centerMargins.setTop(0);
    topData.setHeight(300);
    topData.setWidth(350);
    topData.setMargins(outerMargins);
    middleData.setHeight(35);
    middleData.setWidth(300);
    middleData.setMargins(centerMargins);
    bottomData.setHeight(200);
    bottomData.setWidth(300);
    bottomData.setMargins(outerMargins);
    f_Label5.setText("PKCS10 Cert Request");
    tbCertReq.setReadOnly(true);
    f_Label6.setText("Issuer");
    tbIssuer.setReadOnly(true);
    f_Label7.setText("Target");
    tbTarget.setReadOnly(true);
    f_Label8.setText("Target alias");
    f_Label9.setText("Target key password");
    f_VerticalLayoutContainer3.add(f_HTMLPanel4);
    btnIssueCert.setStyleName("button");
    btnIssueCert.setText("Issue");
    f_VerticalLayoutContainer3.add(btnIssueCert);
    f_FramedPanel2.add(f_VerticalLayoutContainer3);
    f_FramedPanel2.setHeadingText("Issue Certificate");
    f_FramedPanel2.setCollapsible(true);
    f_FramedPanel2.setExpanded(false);
    f_VerticalLayoutContainer1.add(f_FramedPanel2, topData);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel4.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    com.google.gwt.user.client.Element domId8Element = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    com.google.gwt.user.client.Element domId9Element = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    attachRecord0.detach();
    f_HTMLPanel4.addAndReplaceElement(f_Label5, domId0Element);
    f_HTMLPanel4.addAndReplaceElement(tbCertReq, domId1Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label6, domId2Element);
    f_HTMLPanel4.addAndReplaceElement(tbIssuer, domId3Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label7, domId4Element);
    f_HTMLPanel4.addAndReplaceElement(tbTarget, domId5Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label8, domId6Element);
    f_HTMLPanel4.addAndReplaceElement(tbTargetAlias, domId7Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label9, domId8Element);
    f_HTMLPanel4.addAndReplaceElement(tbTargetKeyPass, domId9Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.issue(event);
      }
    };
    btnIssueCert.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.btnIssueCert = btnIssueCert;
    owner.tbCertReq = tbCertReq;
    owner.tbIssuer = tbIssuer;
    owner.tbTarget = tbTarget;
    owner.tbTargetAlias = tbTargetAlias;
    owner.tbTargetKeyPass = tbTargetKeyPass;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_VerticalLayoutContainer1;
  }
}
