package org.ib.commons.misc;

import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.junit.Test;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/14/12
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReflectionUtilsTest {

//    @Test
    public void serializeTest() {

        Dummy dummy = new Dummy();
        dummy.str = "asd";

        try {

            Document ser = ReflectionUtils.serializeObject(dummy);

            XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
            String xmlString = outputter.outputString(ser);
            System.out.println(xmlString);


            Dummy dummy2 = (Dummy) ReflectionUtils.deserializeObject(ser);
            System.out.println(dummy2.str);

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static class Dummy {
        public Dummy() {super();}

        String str;
    }

    @Test
    public void proxyTest() {
        List list = new ArrayList();
        List proxyForList = (List) TracingIH.createProxy(list, new PrintWriter(System.out));
        proxyForList.add("asd");
        proxyForList.size();

        ListFactory lf = new ListFactory(ArrayList.class.getName(), true);
        List list2 = lf.newInstance();
        list2.add("123");
    }
}
