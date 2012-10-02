package org.ib.commons.client.services.keystore2;

import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.menu.Menu;
import com.sencha.gxt.widget.core.client.tree.Tree;
import org.ib.commons.dto.BaseDTO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/12/12
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractTree implements IsWidget {

    protected String width;
    protected String height;

    protected TreeStore<BaseDTO> store;
    protected Tree<BaseDTO, String> tree;

    public @UiConstructor AbstractTree(String width, String height) {
        this.width = width;
        this.height = height;
    }

    class KeyProvider implements ModelKeyProvider<BaseDTO> {
        @Override
        public String getKey(BaseDTO item) {
            return item.toString();
        }
    }

    @Override
    public Widget asWidget() {

        store = new TreeStore<BaseDTO>(new KeyProvider());
        tree = new Tree<BaseDTO, String>(store, getValueProvider());
        tree.setContextMenu(getContextMenu());

        ScrollPanel scrollPanel = new ScrollPanel(tree);
        scrollPanel.setWidth(width);
        scrollPanel.setHeight(height);
        scrollPanel.addStyleName("border");
        return new ScrollPanel(scrollPanel);
    }

    protected abstract ValueProvider<BaseDTO,String> getValueProvider();
    protected abstract Menu getContextMenu();

    public abstract void refreshTree(BaseDTO baseDTO);
    public abstract void refreshTree(List<BaseDTO> baseDTOList);
}
