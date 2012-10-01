package org.ib.commons.security;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignature;
import org.ib.commons.crypto.KeyStoreUtils;
import org.ib.commons.io.IOUtils;
import org.ib.commons.xml.DOMUtils;
import org.ib.commons.xml.SOAPUtils;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.cert.CertificateException;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/9/12
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class SignatureUtilsTest {

//    @Test
    public void signTest() {
        try {
            SOAPMessage soapMessage = SOAPUtils.getSOAPMessageFromResources("soap-app-profile-1.xml", SOAPConstants.SOAP_1_1_PROTOCOL);

            NodeList revisions = soapMessage.getSOAPPart().getDocumentElement().getElementsByTagNameNS("http://namespaces.globalplatform.org/systems-profiles/1.1.1", "Revision");
            Node sigPlaceHolder = revisions.item(0); // DOMUtils.getElementByXPath(soapMessage.getSOAPPart(), "//processOrder:sig")

            SignatureUtils su = new SignatureUtils();
            su.initDefaultKeystore();

            XMLSignature sig;
            sig = su.sign(soapMessage.getSOAPPart(), sigPlaceHolder);

//            System.out.println(DOMUtils.nodeToString(sig.getElement()));
//            System.out.println(DOMUtils.nodeToString(sig.getDocument()));

            su.verify(soapMessage.getSOAPPart());
//            System.out.println(DOMUtils.nodeToString(sig.getDocument()));

        } catch (SOAPException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (CertificateException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (KeyStoreException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (XMLSecurityException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (TransformerException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (XPathExpressionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchProviderException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private Node getSigElement(Document document) throws XPathExpressionException {
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xpath = xpf.newXPath();
        xpath.setNamespaceContext(new DSNamespaceContext());

        String expression = "//processOrder:sig";
        Element sigElement = (Element) xpath.evaluate(expression, document, XPathConstants.NODE);

        return sigElement;
    }

    @Test
    public void signTest2() throws Exception {
        InputStream is = IOUtils.getInputStreamRelative("/commons/samples/data/keystore.jks");
        KeyStore ks = KeyStoreUtils.getKeyStoreFromInputStream(is, "xmlsecurity", "JKS", null);

        SignatureUtils su = new SignatureUtils();
        su.initDefaultKeystore();

        Document document = DOMUtils.getDocumentFromFile("sample.xml");

//        is.close();
//        is = IOUtils.getInputStreamFromResources("sample.xml");
//        ResponseWrapper resp = HashUtils.digest(org.apache.commons.io.IOUtils.toByteArray(is), new HashUtils.DigestContext(HashUtils.ALG_SHA1, HashUtils.PROVIDER_BC));
//        System.out.println(Base64.encode(resp.data));

        XMLSignature sig = su.sign(document, null, ks, "test", "xmlsecurity", "test");

//        System.out.println(DOMUtils.nodeToString(sig.getElement()));
//        System.out.println(DOMUtils.nodeToString(sig.getDocument()));

        XPathFactory xpf = XPathFactory.newInstance();
        XPath xpath = xpf.newXPath();
        xpath.setNamespaceContext(new DSNamespaceContext());

        String expression = "//revision";
        Element sigElement = (Element) xpath.evaluate(expression, document, XPathConstants.NODE);

        sigElement.appendChild(sig.getElement());

        System.out.println(DOMUtils.nodeToString(document));

        su.verify(document);
    }
}
