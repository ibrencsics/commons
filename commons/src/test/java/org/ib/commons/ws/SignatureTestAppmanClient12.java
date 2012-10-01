package org.ib.commons.ws;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.ib.commons.security.SignatureUtils;
import org.ib.commons.xml.DOMUtils;
import org.ib.commons.xml.SOAPUtils;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.transform.TransformerException;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.net.URL;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/14/12
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignatureTestAppmanClient12 {

    public static final String WSDLFile = "http://localhost:8080/sigtest/services/appman12?wsdl";

    @Test
    public void testClient() throws Exception {
        URL wsdlURL = new URL(WSDLFile);

        QName domProvider = new QName("http://globalplatform.org/appman", "AppmanService");
        QName portName = new QName("http://globalplatform.org/appman", "AppmanEndPoint");

        Service service = Service.create(wsdlURL, domProvider);

//        SOAPMessage soapMessage = SOAPUtils.getSOAPMessageFromResources("soap12-app-profile-1.xml", SOAPConstants.SOAP_1_2_PROTOCOL);

        SOAPMessage soapMessage = createSOAPMessage();

//        sign(soapMessage);

//        SOAPMessage soapMessage = createSignedMessage();

        Dispatch<SOAPMessage> dispSOAPMsg = service.createDispatch(portName, SOAPMessage.class, Service.Mode.MESSAGE);
        SOAPMessage soapResp = dispSOAPMsg.invoke(soapMessage);
    }

    private void sign(SOAPMessage soapMessage) throws IOException, NoSuchAlgorithmException, KeyStoreException, CertificateException, UnrecoverableKeyException, TransformerException, XMLSecurityException, NoSuchProviderException {
        NodeList revisions = soapMessage.getSOAPPart().getDocumentElement().getElementsByTagNameNS("http://namespaces.globalplatform.org/systems-profiles/1.1.1", "Revision");
        Node sigPlaceHolder = revisions.item(0);

        SignatureUtils su = new SignatureUtils();
        su.initDefaultKeystore();

        su.sign(soapMessage.getSOAPPart(), sigPlaceHolder);
    }

    private SOAPMessage createSOAPMessage() throws SOAPException, IOException {
        SOAPMessage soapMessage = SOAPUtils.createEmptySOAPMessage(SOAPConstants.SOAP_1_2_PROTOCOL);

        SOAPBody body = soapMessage.getSOAPBody();
//        body.addNamespaceDeclaration("gp", "http://namespaces.globalplatform.org/systems-profiles/1.1.1");

        SOAPElement signatureTestElement = body.addChildElement("SignatureTest", "gp", "http://namespaces.globalplatform.org/systems-profiles/1.1.1");

        NodeList nodes = DOMUtils.getDocumentFromFile("app-profile-1-signed.xml").getChildNodes();
        for (int i=0; i<nodes.getLength(); i++) {
            DOMUtils.copyNodeToDocument(soapMessage.getSOAPPart(), signatureTestElement, nodes.item(i));
        }

        soapMessage.writeTo(System.out);

        return soapMessage;
    }

    private SOAPMessage createSignedMessage() throws IOException, SOAPException, NoSuchAlgorithmException, KeyStoreException, CertificateException, UnrecoverableKeyException, TransformerException, XMLSecurityException, XPathExpressionException, NoSuchProviderException {
        SOAPMessage soapMessage = SOAPUtils.createEmptySOAPMessage(SOAPConstants.SOAP_1_2_PROTOCOL);

        SOAPBody body = soapMessage.getSOAPBody();
        body.addNamespaceDeclaration("gp", "http://namespaces.globalplatform.org/systems-profiles/1.1.1");

        SOAPElement signatureTestElement = body.addChildElement("SignatureTest", "gp", "http://namespaces.globalplatform.org/systems-profiles/1.1.1");

        // get profile

        Document profile = DOMUtils.getDocumentFromFile("app-profile-1.xml");

        // sign

        NodeList revisions = profile.getElementsByTagNameNS("http://namespaces.globalplatform.org/systems-profiles/1.1.1", "Revision");
        Node sigPlaceHolder = revisions.item(0);

        SignatureUtils su = new SignatureUtils();
        su.initDefaultKeystore();

//        su.sign(soapMessage.getSOAPPart(), sigPlaceHolder, "/env:Envelope/env:Body/gp:SignatureTest/gp:ApplicationProfile");
        su.sign(profile, sigPlaceHolder, "");

        su.verify(profile);

        // add profile

        DOMUtils.copyNodeToDocument(soapMessage.getSOAPPart(), signatureTestElement, profile.getFirstChild());

        // test

//        System.out.println(DOMUtils.nodeToString(profile));
        soapMessage.writeTo(System.out);

        return soapMessage;
    }
}
