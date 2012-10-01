package org.ib.tools.signature;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.ib.commons.security.SignatureUtils;
import org.ib.commons.xml.DOMUtils;
import org.w3c.dom.Document;

import javax.swing.*;
import javax.xml.transform.TransformerException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/15/12
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class XmlSigPanel extends JPanel implements ActionListener {

    private static final String PREPARE_SIGN = "Prepare";
    private static final String SIGN = "Sign";

    private Document taDocContent;
    private Document original;
    private String taStrContent;
    private JTextArea ta;
    private JPanel toolPanel;

    private SignatureUtils su;

    public XmlSigPanel() {
        init();

        ta = new JTextArea(30,80);
        taDocContent = DOMUtils.getDocumentFromFile("app-profile-1.xml");
        fillTA();

        toolPanel = new JPanel();

        JButton prepSignButton = new JButton(PREPARE_SIGN);
		prepSignButton.setActionCommand(PREPARE_SIGN);
		prepSignButton.setToolTipText(PREPARE_SIGN);
		prepSignButton.addActionListener(this);
		toolPanel.add(prepSignButton);

        JButton signButton = new JButton(SIGN);
		signButton.setActionCommand(SIGN);
		signButton.setToolTipText(SIGN);
		signButton.addActionListener(this);
		toolPanel.add(signButton);

        setLayout(new BorderLayout());
        add(new JScrollPane(ta), BorderLayout.CENTER);
        add(toolPanel, BorderLayout.EAST);
    }

    private void fillTA() {
        taStrContent = DOMUtils.documentToString(taDocContent);
        ta.setText(taStrContent);
    }

    public void actionPerformed(ActionEvent e) {
        String ac = e.getActionCommand();

        if (ac.equals(SIGN)) {
            sign();
            fillTA();
        } else if (ac.equals(PREPARE_SIGN)) {
            prepareSign();
            fillTA();
        }
    }



    private void init() {
        su = new SignatureUtils();
        try {
            su.initDefaultKeystore();
        } catch (KeyStoreException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (CertificateException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchProviderException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private void prepareSign() {
        try {
            su.prepareSign(taDocContent, taDocContent.getDocumentElement(), "");
        } catch (XMLSecurityException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (KeyStoreException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private void sign() {
        try {
            su.sign(taDocContent, taDocContent.getDocumentElement());
        } catch (KeyStoreException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (XMLSecurityException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (TransformerException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}
