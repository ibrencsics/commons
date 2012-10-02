package org.ib.commons.client.misc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.tree.Tree;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/3/12
 * Time: 11:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreTree extends Composite /*ResizeComposite implements IsWidget*/ {

    class KeyProvider implements ModelKeyProvider<String> {
        @Override
        public String getKey(String item) {
            return item;
        }
    }

    interface MyUiBinder extends UiBinder<Widget, KeystoreTree> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    Tree tree;

    @UiField(provided = true)
    TreeStore<String> store = new TreeStore<String>(new KeyProvider());

    public KeystoreTree() {

        store.add("apple");
        store.add("apple", "A");
        store.add("pear");

        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiFactory
    public ValueProvider<String, String> createValueProvider() {
        return new ValueProvider<String, String>() {

            @Override
            public String getValue(String object) {
                return object;
            }

            @Override
            public void setValue(String object, String value) {
            }

            @Override
            public String getPath() {
                return "name";
            }
        };
    }
}
