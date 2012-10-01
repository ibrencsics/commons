package org.ib.commons.ws;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignature;
import org.globalplatform.namespaces.systems_profiles._1_1.ApplicationProfile;
import org.ib.commons.security.SignatureUtils;
import org.ib.commons.xml.DOMUtils;
import org.ib.commons.xml.JAXBUtils;
import org.ib.commons.xml.SOAPUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/14/12
 * Time: 12:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignatureTestAppmanProcessor {

    public DOMSource invoke(DOMSource request, String protocol) {
        DOMSource response = new DOMSource();

        try {
            SOAPMessage soapReq = SOAPUtils.createEmptySOAPMessage(protocol);
            soapReq.getSOAPPart().setContent(request);

//            soapReq.writeTo(System.out);

//            checkOverallSignature(soapReq);
            checkProfileSignature(soapReq);
//            jaxbTest(soapReq);

            response.setNode(SOAPUtils.createEmptySOAPMessage(protocol).getSOAPPart());

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return response;
    }

    private void checkOverallSignature(SOAPMessage soapReq) throws IOException, NoSuchAlgorithmException, KeyStoreException, CertificateException, UnrecoverableKeyException, XMLSecurityException, XPathExpressionException, NoSuchProviderException {
        SignatureUtils su = new SignatureUtils();
        su.initDefaultKeystore();
        su.verify(soapReq.getSOAPPart());
    }

    private void checkProfileSignature(SOAPMessage soapReq) throws IOException, NoSuchAlgorithmException, KeyStoreException, CertificateException, UnrecoverableKeyException, XPathExpressionException, ParserConfigurationException, XMLSecurityException, NoSuchProviderException, SAXException {
        SignatureUtils su = new SignatureUtils();
        su.initDefaultKeystore();

        Element profile = (Element) DOMUtils.getElementByXPath(soapReq.getSOAPPart(), "//gp:ApplicationProfile");
        String profileStr = DOMUtils.nodeToString(profile);

        Document profileDoc = DOMUtils.stringToDom(profileStr);

//        System.out.println(DOMUtils.nodeToString(profileDoc));
        su.verify(profileDoc);

        jaxbTest(profileDoc);
    }

    private void jaxbTest(SOAPMessage soapReq) throws SOAPException {
        Node body = soapReq.getSOAPPart().getEnvelope().getBody();

        for (int i=0; i<body.getChildNodes().getLength(); i++) {
            Node node = body.getChildNodes().item(i);
            if (node.getLocalName()!=null && node.getLocalName().equals("SignatureTest")) {
                for (int j=0; j<node.getChildNodes().getLength(); j++) {
                    Node innerNode = node.getChildNodes().item(j);
                    if (innerNode.getLocalName()!=null && innerNode.getLocalName().equals("ApplicationProfile")) {
                        JAXBUtils ju = new JAXBUtils("org.globalplatform.namespaces.systems_profiles._1_1");
                        ApplicationProfile ap = (ApplicationProfile) ju.nodeToJAXB(innerNode);
                        System.out.println("JAXB parsing successful: " + ap.getDescription());
                    }
                }
            }
        }
    }

    private void jaxbTest(Document document) {
        JAXBUtils ju = new JAXBUtils("org.globalplatform.namespaces.systems_profiles._1_1");
        ApplicationProfile ap = (ApplicationProfile) ju.nodeToJAXB(document);
        System.out.println("JAXB parsing successful: " + ap.getDescription());
    }
}
