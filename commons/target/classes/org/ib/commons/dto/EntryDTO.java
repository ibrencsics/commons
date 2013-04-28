package org.ib.commons.dto;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/5/12
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class EntryDTO extends BaseDTO {

    private String alias;
    private String password;

    public EntryDTO() {

    }

    public EntryDTO(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return alias + "#" + password;
    }
}
