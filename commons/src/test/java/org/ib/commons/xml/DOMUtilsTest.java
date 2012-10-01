package org.ib.commons.xml;

import org.ib.commons.io.IOUtils;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/8/12
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class DOMUtilsTest {

    @Test
    public void testEcho() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(IOUtils.getInputStreamFromResources("sample.xml"));

            DOMUtils domUtils = new DOMUtils();
            domUtils.printDOM(doc, new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true));

            System.out.println("transform back to string");
            System.out.println(DOMUtils.nodeToString(doc));

        } catch (ParserConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SAXException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
