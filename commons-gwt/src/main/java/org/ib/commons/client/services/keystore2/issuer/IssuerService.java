package org.ib.commons.client.services.keystore2.issuer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Composite;
import org.ib.commons.client.Utils;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;
import org.ib.commons.dto.EntryDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.dto.PKCS10CertRequestDTO;
import org.ib.commons.dto.PrivateKeyEntryDTO;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/21/12
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class IssuerService extends Composite {

    interface MyUiBinder extends UiBinder<Widget, IssuerService> {}

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    final BackendServiceAsync backendService = GWT.create(BackendService.class);

    @UiField
    Button btnIssueCert;
    @UiField
    TextBox tbCertReq;
    @UiField
    TextBox tbIssuer;
    @UiField
    TextBox tbTarget;
    @UiField
    TextBox tbTargetAlias;
    @UiField
    TextBox tbTargetKeyPass;

    private PKCS10CertRequestDTO pkcs10DTO;
    private KeystoreDTO issuerKsDTO;
    private PrivateKeyEntryDTO issuerPkEntryDTO;
    private KeystoreDTO targetKsDTO;

    public IssuerService() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void setCertReq(PKCS10CertRequestDTO pkcs10DTO) {
        this.pkcs10DTO = pkcs10DTO;
        tbCertReq.setText(pkcs10DTO.getName());
    }

    public void setIssuer(KeystoreDTO ksDTO, PrivateKeyEntryDTO pkEntryDTO) {
        this.issuerKsDTO = ksDTO;
        this.issuerPkEntryDTO = pkEntryDTO;
        tbIssuer.setText(ksDTO.getName() + "/" + pkEntryDTO.getAlias());
    }

    public void setTarget(KeystoreDTO ksDTO) {
        this.targetKsDTO = ksDTO;
        tbTarget.setText(ksDTO.getName());
    }

    @UiHandler("btnIssueCert")
    void issue(ClickEvent event) {
        if (this.pkcs10DTO!=null && this.issuerKsDTO!=null && this.issuerPkEntryDTO!=null && this.targetKsDTO!=null) {
            String targetAlias = Utils.getTextBoxStringValue(this.tbTargetAlias);
            String targetKeyPass = Utils.getTextBoxStringValue(this.tbTargetKeyPass);

            PrivateKeyEntryDTO targetEntry = new PrivateKeyEntryDTO();
            targetEntry.setAlias(targetAlias);
            targetEntry.setPassword(targetKeyPass);

            backendService.issueCertificate(
                    this.pkcs10DTO,
                    this.issuerKsDTO, this.issuerPkEntryDTO,
                    this.targetKsDTO, targetEntry,
                    new AsyncCallback<Void>() {
                        @Override
                        public void onFailure(Throwable throwable) {
                            throwable.printStackTrace();
                        }

                        @Override
                        public void onSuccess(Void aVoid) {
                            com.google.gwt.user.client.Window.alert("Issued");
                        }
                    }
            );
        }
    }
}
