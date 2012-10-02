package org.ib.commons.client.services.keystore2.request;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiConstructor;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.widget.core.client.menu.Item;
import com.sencha.gxt.widget.core.client.menu.Menu;
import com.sencha.gxt.widget.core.client.menu.MenuItem;
import org.ib.commons.client.services.keystore2.AbstractTree;
import org.ib.commons.dto.BaseDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.dto.PKCS10CertRequestDTO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/12/12
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class CertificateRequestList extends AbstractTree {

    public @UiConstructor
    CertificateRequestList(String width, String height) {
        super(width, height);
    }

    @Override
    protected ValueProvider<BaseDTO, String> getValueProvider() {
        return new ValueProvider<BaseDTO, String>() {
            @Override
            public String getValue(BaseDTO baseDTO) {
                if (baseDTO instanceof PKCS10CertRequestDTO) {
                    return ((PKCS10CertRequestDTO) baseDTO).getName();
                }
                return "unknown entry";
            }

            @Override
            public void setValue(BaseDTO baseDTO, String s) {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public String getPath() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }
        };
    }

    @Override
    protected Menu getContextMenu() {
        Menu contextMenu = new Menu();

        MenuItem toIssue = new MenuItem();
        toIssue.setText("To issue");
        toIssue.addSelectionHandler(new SelectionHandler<Item>() {
            @Override
            public void onSelection(SelectionEvent<Item> itemSelectionEvent) {
                BaseDTO sel = tree.getSelectionModel().getSelectedItem();
                if (sel!=null && listSelectionHandler!=null) {
                    listSelectionHandler.toIssue((PKCS10CertRequestDTO)sel);
                }
            }
        });
        contextMenu.add(toIssue);

        return contextMenu;
    }

    @Override
    public void refreshTree(BaseDTO baseDTO) {

    }

    @Override
    public void refreshTree(List<BaseDTO> baseDTOList) {
        store.clear();

        if (baseDTOList!=null) {
            for (BaseDTO baseDTO : baseDTOList) {
                if (baseDTO instanceof PKCS10CertRequestDTO) {
                    PKCS10CertRequestDTO pkcs10DTO = (PKCS10CertRequestDTO)baseDTO;
                    store.add(pkcs10DTO);
                }
            }
        }
    }

    // event handling

    public interface ListSelectionHandler {
        void toIssue(PKCS10CertRequestDTO pkcs10DTO);
    }

    private ListSelectionHandler listSelectionHandler;

    public void setListSelectionHandler(ListSelectionHandler listSelectionHandler) {
        this.listSelectionHandler = listSelectionHandler;
    }
}
