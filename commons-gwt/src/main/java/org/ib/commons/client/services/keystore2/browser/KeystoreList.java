package org.ib.commons.client.services.keystore2.browser;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiConstructor;
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
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreList extends AbstractTree {

    public @UiConstructor KeystoreList(String width, String height) {
        super(width, height);
    }

    @Override
    protected ValueProvider<BaseDTO, String> getValueProvider() {
        return new ValueProvider<BaseDTO, String>() {

            @Override
            public String getValue(BaseDTO baseDTO) {
                if (baseDTO instanceof KeystoreDTO) {
                    return ((KeystoreDTO) baseDTO).getName();
                }
                return "unknown entry";
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
                if (sel != null && listSelectionHandler!=null) {
                    listSelectionHandler.view((KeystoreDTO) sel);
                }
            }
        });
        contextMenu.add(view);

        MenuItem asTarget = new MenuItem();
        asTarget.setText("As target");
        asTarget.addSelectionHandler(new SelectionHandler<Item>() {
            @Override
            public void onSelection(SelectionEvent<Item> itemSelectionEvent) {
                BaseDTO sel = tree.getSelectionModel().getSelectedItem();
                if (sel!=null && listSelectionHandler!=null) {
                    listSelectionHandler.asTarget((KeystoreDTO)sel);
                }
            }
        });
        contextMenu.add(asTarget);

        return contextMenu;
    }

    @Override
    public void refreshTree(BaseDTO baseDTO) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void refreshTree(List<BaseDTO> baseDTOList) {
        store.clear();

        if (baseDTOList!=null) {
            for (BaseDTO baseDTO : baseDTOList) {
                if (baseDTO instanceof KeystoreDTO) {
                    KeystoreDTO ksDTO = (KeystoreDTO)baseDTO;
                    store.add(ksDTO);
                }
            }
        }
    }

    // event handling

    public interface ListSelectionHandler {
        void view(KeystoreDTO ksDTO);
        void asTarget(KeystoreDTO ksDTO);
    }

    private ListSelectionHandler listSelectionHandler;

    public void setListSelectionHandler(ListSelectionHandler listSelectionHandler) {
        this.listSelectionHandler = listSelectionHandler;
    }

}
