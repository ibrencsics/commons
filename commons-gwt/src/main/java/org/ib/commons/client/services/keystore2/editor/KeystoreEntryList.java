package org.ib.commons.client.services.keystore2.editor;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.widget.core.client.menu.Item;
import com.sencha.gxt.widget.core.client.menu.Menu;
import com.sencha.gxt.widget.core.client.menu.MenuItem;
import org.ib.commons.client.services.keystore2.AbstractTree;
import org.ib.commons.dto.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/12/12
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreEntryList extends AbstractTree {

    private KeystoreDTO selKeystore;

    public @UiConstructor KeystoreEntryList(String width, String height) {
        super(width, height);
    }

    @Override
    protected ValueProvider<BaseDTO, String> getValueProvider() {
        return new ValueProvider<BaseDTO, String>() {

            @Override
            public String getValue(BaseDTO baseDTO) {
                if (baseDTO instanceof EntryDTO) {
                    return ((EntryDTO) baseDTO).getAlias();
                } else if (baseDTO instanceof PrivateKeyDTO) {
                    return "PK";
                } else if (baseDTO instanceof X509CertificateDTO) {
                    return "TCE";
                } else if (baseDTO instanceof CertificateChainDTO) {
                    return "TCC";
                }
                return "unknown entry"; //object.getName();
            }

            @Override
            public void setValue(BaseDTO object, String value) {
                System.out.println("asd");
            }

            @Override
            public String getPath() {
                return "name";
            }
        };
    }

    @Override
    protected Menu getContextMenu() {
        Menu contextMenu = new Menu();

        MenuItem view = new MenuItem();
        view.setText("View");
        view.addSelectionHandler(new SelectionHandler<Item>() {
            @Override
            public void onSelection(SelectionEvent<Item> itemSelectionEvent) {
                BaseDTO sel = tree.getSelectionModel().getSelectedItem();
                if (sel != null) {
                    if (sel instanceof PrivateKeyDTO) {
                        showPopup(((PrivateKeyDTO) sel).getPrivKeyStr());
                    }
                    else if (sel instanceof X509CertificateDTO) {
                        showPopup(((X509CertificateDTO)sel).getCertStr());
                    }
                }
            }
        });
        contextMenu.add(view);

        MenuItem asIssuer = new MenuItem();
        asIssuer.setText("As issuer");
        asIssuer.addSelectionHandler(new SelectionHandler<Item>() {
            @Override
            public void onSelection(SelectionEvent<Item> itemSelectionEvent) {
                BaseDTO sel = tree.getSelectionModel().getSelectedItem();
                if (sel != null) {
                    if (sel instanceof PrivateKeyEntryDTO) {
                        if (issuerHandler!=null) {
                            issuerHandler.asIssuer(selKeystore, (PrivateKeyEntryDTO)sel);
                        }
                    }
                }
            }
        });
        contextMenu.add(asIssuer);

        return contextMenu;
    }

    @Override
    public void refreshTree(BaseDTO baseDTO) {
        if (!(baseDTO instanceof KeystoreDTO)) return;
        KeystoreDTO ksDTO = (KeystoreDTO)baseDTO;

        store.clear();

        if (ksDTO.getEntries() != null) {
            for (EntryDTO entryDTO : ksDTO.getEntries()) {

                store.add(entryDTO);

                if (entryDTO instanceof PrivateKeyEntryDTO) {
                    PrivateKeyEntryDTO privateKeyEntryDTO = (PrivateKeyEntryDTO)entryDTO;

                    store.add(entryDTO, privateKeyEntryDTO.getPrivateKeyDTO());
                    store.add(entryDTO, privateKeyEntryDTO.getCertificateChainDTO());

                    for (CertificateDTO certDTO : privateKeyEntryDTO.getCertificateChainDTO().getCertChain()) {
                        if (certDTO instanceof X509CertificateDTO) {
                            store.add(privateKeyEntryDTO.getCertificateChainDTO(), (X509CertificateDTO)certDTO);
                        }
                    }
                }
                else if (entryDTO instanceof TrustedCertificateEntryDTO) {
                    TrustedCertificateEntryDTO tceDTO = (TrustedCertificateEntryDTO) entryDTO;

                    if (tceDTO.getCertificateDTO() instanceof X509CertificateDTO) {
                        X509CertificateDTO x509CertificateDTO = (X509CertificateDTO) tceDTO.getCertificateDTO();
                        store.add(entryDTO, x509CertificateDTO);
                    }
                }
            }
        }
    }

    @Override
    public void refreshTree(List<BaseDTO> baseDTOList) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


    private void showPopup(String str) {
        final PopupPanel popup = new PopupPanel();

        VerticalPanel vp = new VerticalPanel();

        TextArea ta = new TextArea();
        ta.setSize("800px", "600px");
        vp.add(ta);
        ta.setText(str);

        Button closeButton = new Button("Close");
        vp.add(closeButton);
        closeButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                popup.hide();
            }
        });

        popup.add(vp);

        popup.show();
    }

    void setSelKeystore(KeystoreDTO selKeystore) {
        this.selKeystore = selKeystore;
    }

    // event handling

    public interface IssuerHandler {
        void asIssuer(KeystoreDTO ksDTO, PrivateKeyEntryDTO pkEntryDTO);
//        void asTarget(KeystoreDTO ksDTO, PrivateKeyEntryDTO pkEntryDTO);
    }

    private IssuerHandler issuerHandler;

    public void setIssuerHandler(IssuerHandler asIssuerHandler) {
        this.issuerHandler = asIssuerHandler;
    }
}
