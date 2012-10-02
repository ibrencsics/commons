package org.ib.commons.shared.exception;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/7/12
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */

public class CommonsGWTException extends Exception {
    // used to localize error messages
    private String key = "general.exception";
    private String[] params = null;

    private CommonsGWTException() {
    }

    ;

    public CommonsGWTException(String msg) {
        super(msg);
    }

    public CommonsGWTException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public CommonsGWTException(String msg, String key) {
        super(msg);
        this.key = key;
    }

    public CommonsGWTException(String msg, String key, String... params) {
        this(msg, key);
        this.params = params;
    }

    public CommonsGWTException(String msg, String key, Throwable cause) {
        super(msg, cause);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public Boolean hasKey() {
        return !"org.ib.commons.gwt.exception".equals(key);
    }

    public String[] getParams() {
        return params;
    }
}
