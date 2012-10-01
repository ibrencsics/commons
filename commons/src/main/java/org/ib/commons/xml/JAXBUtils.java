package org.ib.commons.xml;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.bind.util.ValidationEventCollector;
import javax.xml.namespace.QName;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/10/12
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class JAXBUtils {

    private String packageName;
    private JAXBContext jaxbContext;

    public JAXBUtils(String packageName) {
        this.packageName = packageName;
    }

    private JAXBContext getJaxbContext() {
        if (this.jaxbContext==null) {
            try {
                this.jaxbContext = JAXBContext.newInstance(this.packageName);
            } catch (JAXBException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return this.jaxbContext;
    }

    public Object nodeToJAXB(Node node) {
        JAXBContext jc = getJaxbContext();
        Unmarshaller u = null;
        try {
            u = jc.createUnmarshaller();
            Object o = u.unmarshal(node);
            return o;
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }

    // test the following methods

    // TODO: test
    public <T> T unmarshal(Class<T> docClass, InputStream inputStream) throws JAXBException {
        String packageName = docClass.getPackage().getName();
        JAXBContext jc = JAXBContext.newInstance(packageName);
        Unmarshaller u = jc.createUnmarshaller();
        JAXBElement<T> doc = (JAXBElement<T>) u.unmarshal(inputStream);
        return doc.getValue();
    }

    // TODO: test
    public void unmarshalAndValidate(File schemaFile, String packagePath) {
        Schema mySchema;
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        ValidationEventCollector vec = null;

        try {
            mySchema = sf.newSchema(schemaFile);

            JAXBContext jc = JAXBContext.newInstance( packagePath );
            Unmarshaller u = jc.createUnmarshaller();
            u.setSchema( mySchema );

            vec = new ValidationEventCollector();
            u.setEventHandler( vec );
//            u.setEventHandler( new TestValidationEventHandler() );

            // in case of validation error, an UnmarshalException is thrown

        } catch (SAXException saxe) {
            // ...(error handling)
            mySchema = null;
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            if (vec != null && vec.hasEvents()) {
                for (ValidationEvent ve : vec.getEvents()) {
                    String msg = ve.getMessage();
                    ValidationEventLocator vel = ve.getLocator();
                    int line = vel.getLineNumber();
                    int column = vel.getColumnNumber();
                    System.err.println(/*origin + */": " + line + "." + column + ": " + msg);
                }
            }
        }
    }

    class TestValidationEventHandler implements ValidationEventHandler {

        public boolean handleEvent(ValidationEvent event) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public <T> JAXBElement<T> wrap(String ns, String tag, T o) {
        QName qtag = new QName(ns, tag);
        Class<?> clazz = o.getClass();
//        @SuppressWarnings("unchecked")
        JAXBElement<T> jbe = new JAXBElement(qtag, clazz, o);
        return jbe;
    }
}
