package org.ib.commons.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/4/12
 * Time: 12:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeystoreDTO extends BaseDTO implements Serializable {

    private String name;
    private String password;
    private String type;
    private String securityProvider;

    private List<EntryDTO> entries;

    public KeystoreDTO() {

    }

    public KeystoreDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSecurityProvider() {
        return securityProvider;
    }

    public void setSecurityProvider(String securityProvider) {
        this.securityProvider = securityProvider;
    }

    public List<EntryDTO> getEntries() {
        return entries;
    }

    public void setEntries(List<EntryDTO> entries) {
        this.entries = entries;
    }

    public void addEntry(EntryDTO entry) {
        if (this.entries==null) {
            this.entries = new ArrayList<EntryDTO>();
        }
        this.entries.add(entry);
    }
}