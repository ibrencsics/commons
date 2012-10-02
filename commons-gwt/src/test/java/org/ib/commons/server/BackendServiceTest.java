package org.ib.commons.server;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.ib.commons.client.backend.BackendService;
import org.ib.commons.dto.*;
import org.ib.commons.io.IOUtils;
import org.ib.commons.dto.BaseDTO;
import org.ib.commons.shared.exception.CommonsGWTException;
import org.junit.Test;

import java.io.File;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/5/12
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class BackendServiceTest {

//    @Test
    public void getKeystoresTest() throws CommonsGWTException {
        BackendService bs = new BackendServiceImpl();

        List<BaseDTO> dtoList = bs.getKeystores();

        System.out.println(dtoList.size());

    }

    // http://commons.apache.org/configuration/howto_properties.html

//    @Test
    public void tempTest() throws Exception {
        File[] files = IOUtils.getFilesInDirectoryRelative("/temp/keystore");
        if (files != null) {
            for (File file : files) {
                if (!file.getName().endsWith(".properties")) {
//                    Properties props = new Properties();
//                    props.load(IOUtils.getInputStreamRelative("/temp/keystore/" + file.getName() + ".properties"));
//                    displayProps(props);

                    Configuration config = new PropertiesConfiguration(IOUtils.getFileRelative("/temp/keystore/" + file.getName() + ".properties"));
                    displayKeystoreConfig(config);
                }
            }
        }
    }

    private void displayProps(Properties myProps) {
        String key = "";
        String value = "";
        for (Map.Entry<Object, Object> propItem : myProps.entrySet()) {
            key = (String) propItem.getKey();
            value = (String) propItem.getValue();
            System.out.println(key + " : " + value);
        }
    }

    private void displayConfiguration(Configuration config) {
        Iterator<String> iter = config.getKeys();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println(key + " : " + config.getProperty(key));
        }
    }

    private void displayKeystoreConfig(Configuration config) {
        String ksPass = config.getString("keystorePass");

        List aliases = config.getList("aliases");
        for (Object alias : aliases) {
            String aliasStr = (String)alias;
            System.out.println(aliasStr);
        }
    }

//    @Test
    public void testPKCS10() throws CommonsGWTException {
        PKCS10CertRequestDTO pkcs10DTO = new PKCS10CertRequestDTO();
        pkcs10DTO.setName("wer.csr");
        pkcs10DTO.setSubjectDN("CN=sdf");
        pkcs10DTO.setSignatureAlgorithm("SHA256withRSA");

        BackendService bs = new BackendServiceImpl();

        bs.createPKCS10CertRequest(pkcs10DTO);
    }

    @Test
    public void issueCertificateTest() throws CommonsGWTException {

        BackendServiceImpl service = new BackendServiceImpl();

        // create the keystores

        KeystoreDTO issuerKsDTO = new KeystoreDTO();
        issuerKsDTO.setName("test_issuer.jks");
        issuerKsDTO.setPassword("testpass");
        issuerKsDTO.setType("JKS");

        KeystoreDTO targetKsDTO = new KeystoreDTO();
        targetKsDTO.setName("test_target.jks");
        targetKsDTO.setPassword("testpass");
        targetKsDTO.setType("JKS");

        service.saveKeystore(issuerKsDTO);
        service.saveKeystore(targetKsDTO);
        
        // create issuer root cert

        EntryDTO issuerPrivKeyEntry = new PrivateKeyEntryDTO();
        issuerPrivKeyEntry.setAlias("issuer");
        issuerPrivKeyEntry.setPassword("keypass");
        
        X509CertificateDTO issuerCert = new X509CertificateDTO();
        issuerCert.setSerialNumber("1");
        issuerCert.setSubjectDN("CN=rootca");
        issuerCert.setIssuerDN("CN=rootca");
        Date now = new Date();
        issuerCert.setNotBefore(now);
        issuerCert.setNotAfter(new Date(now.getTime() + 100000));
        issuerCert.setSignatureAlgorithm("SHA256WithRSAEncryption");

        service.createNewRoot(issuerKsDTO, issuerPrivKeyEntry, issuerCert);

        // create certificate request

        PKCS10CertRequestDTO pkcs10 = new PKCS10CertRequestDTO();
        pkcs10.setName("test_request.csr");
        pkcs10.setSubjectDN("CN=client");
        pkcs10.setSignatureAlgorithm("SHA256withRSA");

        service.createPKCS10CertRequest(pkcs10);

        // issue certificate

        EntryDTO subjectPrivKeyEntry = new PrivateKeyEntryDTO();
        subjectPrivKeyEntry.setAlias("subject");
        subjectPrivKeyEntry.setPassword("keypass");

        service.issueCertificate(pkcs10, issuerKsDTO, (PrivateKeyEntryDTO)issuerPrivKeyEntry, targetKsDTO, (PrivateKeyEntryDTO)subjectPrivKeyEntry);
    }
}
