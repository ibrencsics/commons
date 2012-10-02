package org.ib.commons.client.services.keystore2;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/11/12
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import org.ib.commons.client.services.keystore2.browser.KeystoreBrowser;
import org.ib.commons.client.services.keystore2.browser.KeystoreList;
import org.ib.commons.client.services.keystore2.editor.KeystoreEditor;
import org.ib.commons.client.services.keystore2.editor.KeystoreEntryList;
import org.ib.commons.client.services.keystore2.issuer.IssuerService;
import org.ib.commons.client.services.keystore2.request.CertificateRequestList;
import org.ib.commons.client.services.keystore2.request.CertificateRequestService;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.dto.PKCS10CertRequestDTO;
import org.ib.commons.dto.PrivateKeyEntryDTO;

public class KeystoreServiceLayout implements IsWidget {

    interface MyUiBinder extends UiBinder<Widget, KeystoreServiceLayout> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    KeystoreBrowser ksBrowser;
    @UiField
    KeystoreEditor ksEditor;
    @UiField
    CertificateRequestService ksRequest;
    @UiField
    IssuerService ksIssuer;

    public Widget asWidget() {

        Widget widget = uiBinder.createAndBindUi(this);

        ksBrowser.getKsList().setListSelectionHandler(new KeystoreList.ListSelectionHandler() {
            @Override
            public void view(KeystoreDTO ksDTO) {
                ksEditor.refreshTree(ksDTO);
            }

            @Override
            public void asTarget(KeystoreDTO ksDTO) {
                ksIssuer.setTarget(ksDTO);
            }
        });

        ksEditor.getKsEntryList().setIssuerHandler(new KeystoreEntryList.IssuerHandler() {
            @Override
            public void asIssuer(KeystoreDTO ksDTO, PrivateKeyEntryDTO pkEntryDTO) {
                ksIssuer.setIssuer(ksDTO, pkEntryDTO);
            }
        });
        
        ksRequest.getCertReqList().setListSelectionHandler(new CertificateRequestList.ListSelectionHandler() {
            @Override
            public void toIssue(PKCS10CertRequestDTO pkcs10DTO) {
                ksIssuer.setCertReq(pkcs10DTO);
            }
        });

        return widget;
    }
}