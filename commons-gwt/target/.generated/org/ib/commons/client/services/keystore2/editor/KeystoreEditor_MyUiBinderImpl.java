package org.ib.commons.client.services.keystore2.editor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class KeystoreEditor_MyUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.ib.commons.client.services.keystore2.editor.KeystoreEditor>, org.ib.commons.client.services.keystore2.editor.KeystoreEditor.MyUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<table> <tr> <td><span id='{0}'></span></td> <td><span id='{1}'></span></td> </tr> <tr> <td><span id='{2}'></span></td> <td><span id='{3}'></span></td> </tr> <tr> <td><span id='{4}'></span></td> <td><span id='{5}'></span></td> </tr> <tr> <td><span id='{6}'></span></td> <td><span id='{7}'></span></td> </tr> <tr> <td><span id='{8}'></span></td> <td><span id='{9}'></span></td> </tr> <tr> <td><span id='{10}'></span></td> <td><span id='{11}'></span></td> </tr> <tr> <td><span id='{12}'></span></td> <td><span id='{13}'></span></td> </tr> <tr> <td><span id='{14}'></span></td> <td><span id='{15}'></span></td> </tr> </table>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.ib.commons.client.services.keystore2.editor.KeystoreEditor owner) {

    org.ib.commons.client.services.keystore2.editor.KeystoreEditor_MyUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.ib.commons.client.services.keystore2.editor.KeystoreEditor_MyUiBinderImpl_GenBundle) GWT.create(org.ib.commons.client.services.keystore2.editor.KeystoreEditor_MyUiBinderImpl_GenBundle.class);
    org.ib.commons.client.services.keystore2.editor.KeystoreEditor_MyUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.sencha.gxt.core.client.util.Margins outerMargins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
    com.sencha.gxt.core.client.util.Margins centerMargins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData topData = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData middleData = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData bottomData = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbAlias = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbKeyPass = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbSerial = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbIssuerDN = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.datepicker.client.DateBox dbNotBefore = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.datepicker.client.DateBox dbNotAfter = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
    java.lang.String domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label11 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox tbSubjectDN = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label12 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId15 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ListBox lbSignAlg = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel4 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1, domId2, domId3, domId4, domId5, domId6, domId7, domId8, domId9, domId10, domId11, domId12, domId13, domId14, domId15).asString());
    com.google.gwt.user.client.ui.Button btnCreate = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer f_VerticalLayoutContainer3 = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.class);
    com.sencha.gxt.widget.core.client.FramedPanel f_FramedPanel2 = (com.sencha.gxt.widget.core.client.FramedPanel) GWT.create(com.sencha.gxt.widget.core.client.FramedPanel.class);
    org.ib.commons.client.services.keystore2.editor.KeystoreEntryList ksEntryList = new org.ib.commons.client.services.keystore2.editor.KeystoreEntryList("300px", "400px");
    com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer f_VerticalLayoutContainer1 = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.class);

    outerMargins.setBottom(4);
    outerMargins.setLeft(4);
    outerMargins.setRight(4);
    outerMargins.setTop(4);
    centerMargins.setBottom(0);
    centerMargins.setLeft(4);
    centerMargins.setRight(4);
    centerMargins.setTop(0);
    topData.setHeight(1);
    topData.setWidth(400);
    topData.setMargins(outerMargins);
    middleData.setHeight(-200);
    middleData.setWidth(300);
    middleData.setMargins(centerMargins);
    bottomData.setHeight(200);
    bottomData.setWidth(300);
    bottomData.setMargins(outerMargins);
    f_Label5.setText("Alias");
    f_Label6.setText("KeyPass");
    f_Label7.setText("Serial Number");
    f_Label8.setText("Issuer DN");
    f_Label9.setText("Not Before");
    f_Label10.setText("Not After");
    f_Label11.setText("Subject DN");
    f_Label12.setText("Signature Algorithm");
    f_VerticalLayoutContainer3.add(f_HTMLPanel4);
    btnCreate.setStyleName("button");
    btnCreate.setText("Create");
    f_VerticalLayoutContainer3.add(btnCreate);
    f_FramedPanel2.add(f_VerticalLayoutContainer3);
    f_FramedPanel2.setHeadingText("New Root Entry");
    f_FramedPanel2.setCollapsible(true);
    f_FramedPanel2.setExpanded(false);
    f_VerticalLayoutContainer1.add(f_FramedPanel2, topData);
    f_VerticalLayoutContainer1.add(ksEntryList, bottomData);

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
    com.google.gwt.user.client.Element domId10Element = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    com.google.gwt.user.client.Element domId11Element = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    com.google.gwt.user.client.Element domId12Element = com.google.gwt.dom.client.Document.get().getElementById(domId12).cast();
    com.google.gwt.user.client.Element domId13Element = com.google.gwt.dom.client.Document.get().getElementById(domId13).cast();
    com.google.gwt.user.client.Element domId14Element = com.google.gwt.dom.client.Document.get().getElementById(domId14).cast();
    com.google.gwt.user.client.Element domId15Element = com.google.gwt.dom.client.Document.get().getElementById(domId15).cast();
    attachRecord0.detach();
    f_HTMLPanel4.addAndReplaceElement(f_Label5, domId0Element);
    f_HTMLPanel4.addAndReplaceElement(tbAlias, domId1Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label6, domId2Element);
    f_HTMLPanel4.addAndReplaceElement(tbKeyPass, domId3Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label7, domId4Element);
    f_HTMLPanel4.addAndReplaceElement(tbSerial, domId5Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label8, domId6Element);
    f_HTMLPanel4.addAndReplaceElement(tbIssuerDN, domId7Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label9, domId8Element);
    f_HTMLPanel4.addAndReplaceElement(dbNotBefore, domId9Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label10, domId10Element);
    f_HTMLPanel4.addAndReplaceElement(dbNotAfter, domId11Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label11, domId12Element);
    f_HTMLPanel4.addAndReplaceElement(tbSubjectDN, domId13Element);
    f_HTMLPanel4.addAndReplaceElement(f_Label12, domId14Element);
    f_HTMLPanel4.addAndReplaceElement(lbSignAlg, domId15Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.createCert(event);
      }
    };
    btnCreate.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.btnCreate = btnCreate;
    owner.dbNotAfter = dbNotAfter;
    owner.dbNotBefore = dbNotBefore;
    owner.ksEntryList = ksEntryList;
    owner.lbSignAlg = lbSignAlg;
    owner.tbAlias = tbAlias;
    owner.tbIssuerDN = tbIssuerDN;
    owner.tbKeyPass = tbKeyPass;
    owner.tbSerial = tbSerial;
    owner.tbSubjectDN = tbSubjectDN;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_VerticalLayoutContainer1;
  }
}
