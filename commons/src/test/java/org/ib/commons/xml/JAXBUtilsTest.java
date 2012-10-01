package org.ib.commons.xml;

import org.ib.commons.testdata.Root;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;


/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/29/12
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class JAXBUtilsTest {

    @Test
    public void marshallCDataTest() throws Exception {
        Document document = DOMUtils.getDocumentFromFile("xml/cdata.xml");
//        System.out.println(DOMUtils.nodeToString(document));

//        Root o = new Root();
//        o.setCdatatag("<blabla>&");

        JAXBContext jc = JAXBContext.newInstance("org.ib.commons.testdata");
        Unmarshaller u = jc.createUnmarshaller();
        Object o = u.unmarshal(document);

        Marshaller m = jc.createMarshaller();

        XMLOutputFactory xof = XMLOutputFactory.newInstance();
        XMLStreamWriter streamWriter = xof.createXMLStreamWriter( System.out );
        CDataXMLStreamWriter cdataStreamWriter = new CDataXMLStreamWriter( streamWriter );

        m.marshal( o, cdataStreamWriter );
        cdataStreamWriter.flush();
        cdataStreamWriter.close();

    }

}
