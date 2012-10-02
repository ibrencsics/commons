package org.ib.commons.client;

import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.datepicker.client.DateBox;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/7/12
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Utils {

    public static String getTextBoxStringValue(TextBox tb) {
        return tb.getText();
    }

    public static String getListBoxStringValue(ListBox lb) {
        return lb.getItemText(lb.getSelectedIndex());
    }

    public static Date getDateBoxDate(DateBox db) {
        return db.getValue();
    }
}
