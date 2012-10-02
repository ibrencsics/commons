package org.ib.commons.client.services.keystore2.editor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.datepicker.client.DateBox;
import org.ib.commons.client.Utils;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;
import org.ib.commons.dto.EntryDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.dto.X509CertificateDTO;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/11/12
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreEditor implements IsWidget {

    interface MyUiBinder extends UiBinder<Widget, KeystoreEditor> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    private final BackendServiceAsync backendService = GWT.create(BackendService.class);

    @UiField
    KeystoreEntryList ksEntryList;

    @UiField
    TextBox tbSubjectDN;
    @UiField
    Button btnCreate;
    @UiField
    TextBox tbAlias;
    @UiField
    TextBox tbKeyPass;
    @UiField
    TextBox tbSerial;
    @UiField
    TextBox tbIssuerDN;
    @UiField
    DateBox dbNotBefore;
    @UiField
    DateBox dbNotAfter;
    @UiField
    ListBox lbSignAlg;

    private KeystoreDTO selKeystore;

    public Widget asWidget() {
        Widget widget = uiBinder.createAndBindUi(this);
        lbSignAlg.addItem("SHA256WithRSAEncryption");
        return widget;
    }

    public void refreshTree(KeystoreDTO ksDTO) {
        this.selKeystore = ksDTO;
        ksEntryList.setSelKeystore(ksDTO);
        ksEntryList.refreshTree(ksDTO);
    }

    @UiHandler("btnCreate")
    void createCert(ClickEvent event) {

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

        backendService.createNewRoot(selKeystore, entryDTO, x509DTO, new AsyncCallback<Void>() {
            @Override
            public void onFailure(Throwable throwable) {
                Window.alert(throwable.getMessage());
                throwable.printStackTrace();
            }

            @Override
            public void onSuccess(Void aVoid) {
                Window.alert("OK");
            }
        });
    }

    public KeystoreEntryList getKsEntryList() {
        return ksEntryList;
    }
}
