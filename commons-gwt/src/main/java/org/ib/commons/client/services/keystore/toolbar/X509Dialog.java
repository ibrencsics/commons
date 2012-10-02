package org.ib.commons.client.services.keystore.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.datepicker.client.DateBox;
import org.ib.commons.client.Utils;
import org.ib.commons.dto.EntryDTO;
import org.ib.commons.dto.X509CertificateDTO;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/27/12
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class X509Dialog extends Composite {

    interface Binder extends UiBinder<Widget, X509Dialog> {}

    private static final Binder binder = GWT.create(Binder.class);

    @UiField
    TextBox tbSerial;
    @UiField
    TextBox tbSubjectDN;
    @UiField
    Button btnCreate;
    @UiField
    TextBox tbIssuerDN;
    @UiField
    DateBox dbNotBefore;
    @UiField
    DateBox dbNotAfter;
    @UiField
    ListBox lbSignAlg;
    @UiField
    TextBox tbKeyPass;
    @UiField
    TextBox tbAlias;

    public X509Dialog() {
        initWidget(binder.createAndBindUi(this));

        lbSignAlg.addItem("SHA256WithRSAEncryption");
    }

    @UiHandler("btnCreate")
    void createCert(ClickEvent event) {
        if (x509ClickHandler!=null) {

            X509CertificateDTO x509DTO = new X509CertificateDTO();
            x509DTO.setSerialNumber(Utils.getTextBoxStringValue(tbSerial));
            x509DTO.setSubjectDN(Utils.getTextBoxStringValue(tbSubjectDN));
            x509DTO.setIssuerDN(Utils.getTextBoxStringValue(tbIssuerDN));
            x509DTO.setSignatureAlgorithm(Utils.getListBoxStringValue(lbSignAlg));
            x509DTO.setNotBefore(Utils.getDateBoxDate(dbNotBefore));
            x509DTO.setNotAfter(Utils.getDateBoxDate(dbNotAfter));

            EntryDTO entryDTO = new EntryDTO();
            entryDTO.setAlias(Utils.getTextBoxStringValue(tbAlias));
            entryDTO.setPassword(Utils.getTextBoxStringValue(tbKeyPass));

            x509ClickHandler.click(entryDTO, x509DTO);
        }

    }

    // cert creation handler

    interface X509ClickHandler {
        void click(EntryDTO entryDTO, X509CertificateDTO x509DTO);
    }

    private X509ClickHandler x509ClickHandler;

    public void setX509ClickHandler(X509ClickHandler x509ClickHandler) {
        this.x509ClickHandler = x509ClickHandler;
    }
}
