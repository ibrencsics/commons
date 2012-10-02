package org.ib.commons.client.misc;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/26/12
 * Time: 12:03 AM
 * To change this template use File | Settings | File Templates.
 */
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
//import com.sencha.gxt.explorer.client.model.Example.Detail;


public class BasicTabUiBinderExample implements IsWidget, EntryPoint {

  interface MyUiBinder extends UiBinder<Widget, BasicTabUiBinderExample> {
  }

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  @UiField(provided = true)
  String txt = "dummy";

  public Widget asWidget() {
    return uiBinder.createAndBindUi(this);
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

//  @UiHandler(value = {"folder", "panel"})
//  @UiHandler(value = {"panel"})
//    void onSelection(SelectionEvent<Widget> event) {
//    TabPanel panel = (TabPanel) event.getSource();
//    Widget w = event.getSelectedItem();
//    TabItemConfig config = panel.getConfig(w);
//    Info.display("Message", "'" + config.getText() + "' Selected");
//  }
}