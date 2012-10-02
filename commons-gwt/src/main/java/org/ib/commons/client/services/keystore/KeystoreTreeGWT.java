package org.ib.commons.client.services.keystore;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.client.backend.BackendServiceAsync;
import org.ib.commons.dto.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/5/12
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreTreeGWT extends Composite {

    private static final String PRIVATE_KEY = "private key";
    private static final String CERT_CHAIN = "cert chain";

    final BackendServiceAsync backendService = GWT.create(BackendService.class);

    private Tree keystoreTree;

    public KeystoreTreeGWT() {

        VerticalPanel vp = new VerticalPanel();

        Button btnRefresh = new Button("Refresh");
        btnRefresh.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                clearKeystoreList();
                refreshKeystoreList();
            }
        });
        vp.add(btnRefresh);

        clearKeystoreList();
        
        keystoreTree.addSelectionHandler(new SelectionHandler<TreeItem>() {
            @Override
            public void onSelection(SelectionEvent<TreeItem> event) {
                TreeItem selItem = event.getSelectedItem();

                Object userObject = selItem.getUserObject();

                if (userObject instanceof PrivateKeyDTO) {
                    treeClickHandler.click((PrivateKeyDTO)userObject, ((PrivateKeyDTO)userObject).getPrivKeyStr());
                }
                else if (userObject instanceof X509CertificateDTO) {
                    treeClickHandler.click((X509CertificateDTO)userObject, ((X509CertificateDTO)userObject).getCertStr());
                }
                else {
                    treeClickHandler.click((BaseDTO)userObject, null);
                }
            }
        });

//        refreshKeystoreList();

        vp.add(keystoreTree);

        ScrollPanel scroller = new ScrollPanel(keystoreTree);
		scroller.setStyleName("tcd-scroller");
		scroller.setSize("280px", "400px");
		vp.add(scroller);

        initWidget(vp);
    }

    private void clearKeystoreList() {
        if (keystoreTree==null)
			keystoreTree = new Tree();
		keystoreTree.clear();
    }

    private void refreshKeystoreList() {
        backendService.getKeystores(new AsyncCallback<List<BaseDTO>>() {
            @Override
            public void onFailure(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onSuccess(List<BaseDTO> keystoreDTOs) {
                clearKeystoreList();
                addKeystores(keystoreDTOs);
            }
        });
    }

    private void addKeystores(List<BaseDTO> keystoreDTOList) {
        System.out.println(keystoreDTOList.size());
        for (BaseDTO baseDTO : keystoreDTOList) {
            KeystoreDTO keystoreDTO = (KeystoreDTO)baseDTO;
            TreeItem ksItem = keystoreTree.addItem(keystoreDTO.getName());
            ksItem.setUserObject(baseDTO);

            if (keystoreDTO.getEntries()==null)
                continue;

            for (EntryDTO entryDTO : keystoreDTO.getEntries()) {

                if (entryDTO instanceof PrivateKeyEntryDTO) {
                    TreeItem entryItem = ksItem.addItem("PK (alias=" + entryDTO.getAlias() + ")");
                    entryItem.setUserObject(entryDTO);

                    PrivateKeyEntryDTO privateKeyEntryDTO = (PrivateKeyEntryDTO)entryDTO;

                    TreeItem privKeyItem = entryItem.addItem(PRIVATE_KEY);
                    privKeyItem.setUserObject(privateKeyEntryDTO.getPrivateKeyDTO());

                    TreeItem certChainItem = entryItem.addItem(CERT_CHAIN);
                    certChainItem.setUserObject(privateKeyEntryDTO.getCertificateChainDTO());

                    for (CertificateDTO certificateDTO : privateKeyEntryDTO.getCertificateChainDTO().getCertChain()) {

                        if (certificateDTO instanceof X509CertificateDTO) {
                            X509CertificateDTO x509CertificateDTO = (X509CertificateDTO) certificateDTO;
                            TreeItem certItem = certChainItem.addItem(x509CertificateDTO.getSerialNumber());
                            certItem.setUserObject(x509CertificateDTO);
                        }
                    }
                }
                else if (entryDTO instanceof TrustedCertificateEntryDTO) {
                    TreeItem entryItem = ksItem.addItem("TCE (alias=" + entryDTO.getAlias() + ")");
                    entryItem.setUserObject(entryDTO);

                    TrustedCertificateEntryDTO tceDTO = (TrustedCertificateEntryDTO) entryDTO;

                    if (tceDTO.getCertificateDTO() instanceof X509CertificateDTO) {
                        X509CertificateDTO x509CertificateDTO = (X509CertificateDTO) tceDTO.getCertificateDTO();
                        TreeItem certItem = entryItem.addItem(x509CertificateDTO.getSerialNumber());
                        certItem.setUserObject(x509CertificateDTO);
                    }
                }
            }
        }
    }

    // tree selection handler

    interface TreeClickHandler {
        void click(BaseDTO selDTO, String textToShow);
    }

    private TreeClickHandler treeClickHandler;

    public void setTreeClickHandler(TreeClickHandler treeClickHandler) {
        this.treeClickHandler = treeClickHandler;
    }
}
