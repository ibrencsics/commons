package org.ib.commons.server;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.ib.commons.crypto.KeyStoreUtils;
import org.ib.commons.dto.EntryDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.dto.KeystoreDTO;
import org.ib.commons.shared.exception.CommonsGWTException;

import java.io.*;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/7/12
 * Time: 4:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesEditor {

    private static final String PROPS_SUFFIX = ".properties";
    private static final String PROP_KS_PASS = "keystorePass";
    private static final String PROP_KS_TYPE = "keystoreType";
    private static final String PROP_SEC_PROVIDER = "keystoreProvider";
    private static final String PROP_IGNORE_ENTRY_PASS = "ignoreEntryPassword";
    private static final String ALIASES = "aliases";

    public KeystoreProperties getConfig(File propsFile) throws CommonsGWTException {
        Configuration config=null;

        try {
            config = new PropertiesConfiguration(propsFile);

            String ksFileName = propsFile.getName().substring(0, propsFile.getName().indexOf(PROPS_SUFFIX));
            String ksPassword = StringUtils.isBlank(config.getString(PROP_KS_PASS)) ? null : config.getString(PROP_KS_PASS);
            String ksType = config.getString(PROP_KS_TYPE);
            String secProvider = StringUtils.isBlank(config.getString(PROP_SEC_PROVIDER)) ? null : config.getString(PROP_SEC_PROVIDER);

            KeystoreDTO keystoreDTO = new KeystoreDTO(ksFileName);
            keystoreDTO.setPassword(ksPassword);
            keystoreDTO.setType(ksType);
            keystoreDTO.setSecurityProvider(secProvider);

            KeystoreProperties ksp = new KeystoreProperties();
            ksp.setKeystoreDTO(keystoreDTO);

            String ignoreEntryPassword = config.getString(PROP_IGNORE_ENTRY_PASS);
            ksp.setIgnoreEntryPassword(StringUtils.isNotBlank(ignoreEntryPassword) && ignoreEntryPassword.equalsIgnoreCase("true"));

            List aliases = config.getList(ALIASES);
            for (Object aliasO : aliases) {
                String[] tokens = ((String)aliasO).split("#");
                String alias = tokens[0];
                String pass = tokens.length > 1 ? tokens[1] : null;

                ksp.addAlias(alias, pass);
            }

            return ksp;

        } catch (ConfigurationException e) {
            throw new CommonsGWTException("Error when reading the properties file", e);
        }
    }

    public void createPropsFile(String fileBase, KeystoreProperties ksp) throws CommonsGWTException {
        try {
            PropertiesConfiguration config = new PropertiesConfiguration();
            config.setProperty(PROP_KS_PASS, ksp.getKeystoreDTO().getPassword());
            config.setProperty(PROP_KS_TYPE, ksp.getKeystoreDTO().getType());
            config.setProperty(PROP_SEC_PROVIDER, ksp.getKeystoreDTO().getSecurityProvider());
            config.save(fileBase + PROPS_SUFFIX);
        } catch (Exception e) {
            throw new CommonsGWTException("Error when creating properties file", e);
        }
    }

    public void updatePropsFile(String fileBase, EntryDTO newEntry) throws CommonsGWTException {

        File propsFile = new File(fileBase + PROPS_SUFFIX);

        try {
            PropertiesConfiguration config = new PropertiesConfiguration(propsFile);
            config.addProperty(ALIASES, newEntry.toString());

            config.save();
        } catch (ConfigurationException e) {
            throw new CommonsGWTException("Error when updating properties file", e);
        }

    }


    public static class KeystoreProperties {
        private KeystoreDTO keystoreDTO;
        private Boolean ignoreEntryPassword;
        private Map<String,String> aliases;

        public KeystoreDTO getKeystoreDTO() {
            return keystoreDTO;
        }

        public void setKeystoreDTO(KeystoreDTO keystoreDTO) {
            this.keystoreDTO = keystoreDTO;
        }

        public Boolean isIgnoreEntryPassword() {
            return ignoreEntryPassword;
        }

        public void setIgnoreEntryPassword(Boolean ignoreEntryPassword) {
            this.ignoreEntryPassword = ignoreEntryPassword;
        }

        public Map<String, String> getAliases() {
            return aliases;
        }

        public void setAliases(Map<String, String> aliases) {
            this.aliases = aliases;
        }

        public void addAlias(String alias, String pass) {
            if (this.aliases==null) {
                this.aliases = new HashMap<String, String>();
            }
            this.aliases.put(alias, pass);
        }
    }
}
