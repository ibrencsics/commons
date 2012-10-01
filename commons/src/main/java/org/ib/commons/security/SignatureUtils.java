package org.ib.commons.security;

import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.XMLUtils;
import org.ib.commons.crypto.KeyStoreUtils;
import org.ib.commons.xml.DOMUtils;
import org.w3c.dom.Document;

import java.io.*;
import java.net.MalformedURLException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import org.apache.xml.security.signature.XMLSignature;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 4/26/12
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignatureUtils {
    private String privateKeyAlias = "test";
    private String privateKeyPass = "xmlsecurity";
    private String certificateAlias = "test";

    private KeyStore ks;
    private PrivateKey privateKey;

    public void initDefaultKeystore() throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException, NoSuchProviderException {
        org.apache.xml.security.Init.init();

        ks = KeyStoreUtils.getKeyStoreFromResources("crypto/keystore.jks", "xmlsecurity", "JKS", null);

        privateKey = (PrivateKey) ks.getKey(privateKeyAlias, privateKeyPass.toCharArray());
    }

    public Node sign(Document document, String sigPlaceHolderXPath) throws XPathExpressionException, TransformerException, IOException, XMLSecurityException, KeyStoreException {
        Node sigPlaceHolder = DOMUtils.getElementByXPath(document, sigPlaceHolderXPath);
        return sign(document, sigPlaceHolder, "").getDocument();
    }

    public XMLSignature sign(Document document, Node sigPlaceHolder) throws IOException, XMLSecurityException, KeyStoreException, TransformerException, FileNotFoundException {
        return sign(document, sigPlaceHolder, "");
    }

    public XMLSignature sign(Document document, Node sigPlaceHolder, String referenceURI) throws IOException, XMLSecurityException, KeyStoreException, TransformerException, FileNotFoundException {

        XMLSignature sig = new XMLSignature(document, "http://xml-security", XMLSignature.ALGO_ID_SIGNATURE_DSA);

        sigPlaceHolder.appendChild(sig.getElement());

        Transforms transforms = new Transforms(document);

        transforms.addTransform(Transforms.TRANSFORM_ENVELOPED_SIGNATURE);
        transforms.addTransform(Transforms.TRANSFORM_C14N_WITH_COMMENTS);
        sig.addDocument(referenceURI, transforms, Constants.ALGO_ID_DIGEST_SHA1);

        X509Certificate cert = (X509Certificate) ks.getCertificate(certificateAlias);

        sig.addKeyInfo(cert);
        sig.addKeyInfo(cert.getPublicKey());
        sig.sign(privateKey);

        return sig;
    }

    public XMLSignature sign(Document document, Element sigPlaceHolder, KeyStore store, String privKeyAlias, String privKeyPass, String certAlias) throws Exception {
        XMLSignature sig = new XMLSignature(document, "", XMLSignature.ALGO_ID_SIGNATURE_DSA); //"http://xml-security"

//        document.getDocumentElement().appendChild(sig.getElement());
        sigPlaceHolder.appendChild(sig.getElement());

        Transforms transforms = new Transforms(document);
        transforms.addTransform(Transforms.TRANSFORM_ENVELOPED_SIGNATURE);
        transforms.addTransform(Transforms.TRANSFORM_C14N_WITH_COMMENTS);
        sig.addDocument("", transforms, Constants.ALGO_ID_DIGEST_SHA1);

        X509Certificate cert = (X509Certificate) store.getCertificate(certAlias);
        sig.addKeyInfo(cert);
        sig.addKeyInfo(cert.getPublicKey());

        sig.sign((PrivateKey) store.getKey(privKeyAlias, privKeyPass.toCharArray()));

        return sig;
    }

    public XMLSignature prepareSign(Document document, Node sigPlaceHolder, String referenceURI) throws XMLSecurityException, KeyStoreException {

        XMLSignature sig = new XMLSignature(document, "http://xml-security", XMLSignature.ALGO_ID_SIGNATURE_DSA);

        sigPlaceHolder.appendChild(sig.getElement());

        Transforms transforms = new Transforms(document);

        transforms.addTransform(Transforms.TRANSFORM_ENVELOPED_SIGNATURE);
        transforms.addTransform(Transforms.TRANSFORM_C14N_WITH_COMMENTS);
        sig.addDocument(referenceURI, transforms, Constants.ALGO_ID_DIGEST_SHA1);

        X509Certificate cert = (X509Certificate) ks.getCertificate(certificateAlias);

        sig.addKeyInfo(cert);
        sig.addKeyInfo(cert.getPublicKey());

        return sig;
    }



    public Boolean verify(String document) throws IOException, SAXException, ParserConfigurationException, XMLSecurityException, XPathExpressionException {
        return verify(DOMUtils.stringToDom(document));
    }

    public Boolean verify(Node document) throws XPathExpressionException, MalformedURLException, XMLSecurityException {
        Boolean ret = false;

        Element sigElement = (Element) DOMUtils.getElementByXPath(document, "//ds:Signature");

        XMLSignature signature = new XMLSignature(sigElement, ""); // http://xml-security

        KeyInfo ki = signature.getKeyInfo();

        if (ki != null) {
            if (!ki.containsX509Data()) {
                System.out.println("Could find a X509Data element in the KeyInfo");
            }

            X509Certificate cert = signature.getKeyInfo().getX509Certificate();

            if (cert != null) {
                ret = signature.checkSignatureValue(cert);
                System.out.println("\nThe XML signature is " + (ret ? "valid (good)"  : "invalid !!!!! (bad)"));
            } else {
                System.out.println("Did not find a Certificate");

                PublicKey pk = signature.getKeyInfo().getPublicKey();

                if (pk != null) {
                    ret = signature.checkSignatureValue(cert);
                    System.out.println("\nThe XML signature is " + (ret ? "valid (good)"  : "invalid !!!!! (bad)"));
                } else {
                    System.out.println("Did not find a public key, so I can't check the signature");
                }
            }
        } else {
            System.out.println("Did not find a KeyInfo");
        }

        return ret;
    }

    public XMLSignature getXMLSignature(Node node) throws XMLSecurityException, XPathExpressionException {
        Element sigElement = (Element) DOMUtils.getElementByXPath(node, "//ds:Signature");
        return new XMLSignature(sigElement, "");
    }


    public static String canonicalize(Document document) {
        org.apache.xml.security.Init.init();

        try {
            Canonicalizer c14n = Canonicalizer.getInstance("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
            byte outputBytes[] = c14n.canonicalizeSubtree(document);
            return new String(outputBytes);
        } catch (InvalidCanonicalizerException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (CanonicalizationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "-";
    }
}
