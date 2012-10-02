package org.ib.commons.client.services.keystore2.browser;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/11/12
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.sencha.gxt.widget.core.client.Composite;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;
import org.ib.commons.dto.BaseDTO;
import org.ib.commons.dto.KeystoreDTO;

import java.util.List;

public class KeystoreBrowser extends Composite { //implements IsWidget {

    interface MyUiBinder extends UiBinder<Widget, KeystoreBrowser> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    KeystoreList ksList;

    @UiField
    TextBox tbKeystoreName;
    @UiField
    Button btnCreate;
    @UiField
    Button btnRefresh;
    @UiField
    ListBox lbKeystoreType;
    @UiField
    TextBox tbKeystorePass;
    @UiField
    ListBox lbSecurityProvider;

    final BackendServiceAsync backendService = GWT.create(BackendService.class);

    private List<BaseDTO> ksDTOList;

    public KeystoreBrowser() {

        initWidget(uiBinder.createAndBindUi(this));

        lbKeystoreType.addItem("JKS");
        lbKeystoreType.addItem("JCEKS");

        lbSecurityProvider.addItem("");
        lbSecurityProvider.addItem("BC");
    }

    private void refreshFromServer() {
        backendService.getKeystores(new AsyncCallback<List<BaseDTO>>() {
            @Override
            public void onFailure(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onSuccess(List<BaseDTO> baseDTOs) {
                ksDTOList = baseDTOs;
                refreshKSList();
            }
        });
    }

    private void refreshKSList() {
        ksList.refreshTree(ksDTOList);
    }

    public KeystoreList getKsList() {
        return ksList;
    }

    // event handling

    @UiHandler("btnRefresh")
    void refresh(ClickEvent event) {
        refreshFromServer();
    }

    @UiHandler("btnCreate")
    void click(ClickEvent event) {

        String ksName = tbKeystoreName.getText();
        String ksPass = tbKeystorePass.getText();
        String ksType = lbKeystoreType.getItemText(lbKeystoreType.getSelectedIndex());
        String selectedSecurityProvider = lbSecurityProvider.getItemText(lbSecurityProvider.getSelectedIndex());
        String secProvider = selectedSecurityProvider==null || selectedSecurityProvider.trim().equals("") ? selectedSecurityProvider : null;

        KeystoreDTO keystoreDTO = new KeystoreDTO();
        keystoreDTO.setName(ksName);
        keystoreDTO.setType(ksType);
        keystoreDTO.setPassword(ksPass);
        keystoreDTO.setSecurityProvider(secProvider);

        backendService.saveKeystore(keystoreDTO, new AsyncCallback<Void>() {
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
}
