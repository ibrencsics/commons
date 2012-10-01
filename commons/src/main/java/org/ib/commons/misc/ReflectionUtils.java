package org.ib.commons.misc;

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/14/12
 * Time: 11:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReflectionUtils {

    public static Document serializeObject(Object source) throws Exception {

        return serializeHelper(
                source,
                new Document(new Element("serialized")),
                new IdentityHashMap());
    }

    private static Document serializeHelper(Object source, Document target, Map table) throws Exception {
        String id = Integer.toString(table.size());
        table.put(source, id);
        Class sourceclass = source.getClass();

        Element oElt = new Element("object");
        oElt.setAttribute("class", sourceclass.getName());
        oElt.setAttribute("id", id);
        target.getRootElement().addContent(oElt);

        if (!sourceclass.isArray()) {
            Field[] fields = Mopex.getInstanceVariables(sourceclass);
            for (int i = 0; i < fields.length; i++) {

                if (!Modifier.isPublic(fields[i].getModifiers()))
                    fields[i].setAccessible(true);

                Element fElt = new Element("field");
                fElt.setAttribute("name", fields[i].getName());
                Class declClass = fields[i].getDeclaringClass();
                fElt.setAttribute("declaringclass", declClass.getName());

                Class fieldtype = fields[i].getType();
                Object child = fields[i].get(source);

                if (Modifier.isTransient(fields[i].getModifiers())) {
                    child = null;
                }
                fElt.addContent(serializeVariable(fieldtype, child, target, table));

                oElt.addContent(fElt);
            }
        } else {
            Class componentType = sourceclass.getComponentType();

            int length = Array.getLength(source);
            oElt.setAttribute("length", Integer.toString(length));

            for (int i = 0; i < length; i++) {
                oElt.addContent(serializeVariable(componentType,
                        Array.get(source, i),
                        target,
                        table));
            }
        }
        return target;
    }

    private static Element serializeVariable(Class fieldtype, Object child, Document target, Map table) throws Exception {
        if (child == null) {
            return new Element("null");
        } else if (!fieldtype.isPrimitive()) {
            Element reference = new Element("reference");
            if (table.containsKey(child)) {
                reference.setText(table.get(child).toString());
            } else {
                reference.setText(Integer.toString(table.size()));
                serializeHelper(child, target, table);
            }
            return reference;
        } else {
            Element value = new Element("value");
            value.setText(child.toString());
            return value;
        }
    }



    public static Object deserializeObject(Document source) throws Exception {
        List objList = source.getRootElement().getChildren();

        Map table = new HashMap();

        createInstances(table, objList);

        assignFieldValues(table, objList);

        return table.get("0");
    }

    private static void createInstances(Map table, List objList)
            throws Exception {
        for (int i = 0; i < objList.size(); i++) {
            Element oElt = (Element) objList.get(i);
            Class cls = Class.forName(oElt.getAttributeValue("class"));
            Object instance = null;
            if (!cls.isArray()) {
                Constructor c = cls.getDeclaredConstructor(null);
                if (!Modifier.isPublic(c.getModifiers())) {
                    c.setAccessible(true);
                }
                instance = c.newInstance(null);
            } else {
                instance =
                        Array.newInstance(
                                cls.getComponentType(),
                                Integer.parseInt(oElt.getAttributeValue("length")));
            }
            table.put(oElt.getAttributeValue("id"), instance);
        }
    }

    private static void assignFieldValues(Map table, List objList)
            throws Exception {
        for (int i = 0; i < objList.size(); i++) {
            Element oElt = (Element) objList.get(i);
            Object instance = table.get(oElt.getAttributeValue("id"));
            List fElts = oElt.getChildren();
            if (!instance.getClass().isArray()) {
                for (int j = 0; j < fElts.size(); j++) {
                    Element fElt = (Element) fElts.get(j);
                    String className
                            = fElt.getAttributeValue("declaringclass");
                    Class fieldDC = Class.forName(className);
                    String fieldName = fElt.getAttributeValue("name");
                    Field f = fieldDC.getDeclaredField(fieldName);
                    if (!Modifier.isPublic(f.getModifiers())) {
                        f.setAccessible(true);
                    }

                    Element vElt = (Element) fElt.getChildren().get(0);
                    f.set(instance,
                            deserializeValue(vElt, f.getType(), table));
                }
            } else {
                Class comptype =
                        instance.getClass().getComponentType();
                for (int j = 0; j < fElts.size(); j++) {
                    Array.set(instance, j,
                            deserializeValue((Element) fElts.get(j),
                                    comptype, table));
                }
            }
        }
    }

    private static Object deserializeValue(Element vElt,
                                           Class fieldType,
                                           Map table)
            throws ClassNotFoundException {
        String valtype = vElt.getName();
        if (valtype.equals("null")) {
            return null;
        } else if (valtype.equals("reference")) {
            return table.get(vElt.getText());
        } else {
            if (fieldType.equals(boolean.class)) {
                if (vElt.getText().equals("true")) {
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            } else if (fieldType.equals(byte.class)) {
                return Byte.valueOf(vElt.getText());
            } else if (fieldType.equals(short.class)) {
                return Short.valueOf(vElt.getText());
            } else if (fieldType.equals(int.class)) {
                return Integer.valueOf(vElt.getText());
            } else if (fieldType.equals(long.class)) {
                return Long.valueOf(vElt.getText());
            } else if (fieldType.equals(float.class)) {
                return Float.valueOf(vElt.getText());
            } else if (fieldType.equals(double.class)) {
                return Double.valueOf(vElt.getText());
            } else if (fieldType.equals(char.class)) {
                return new Character(vElt.getText().charAt(0));
            } else {
                return vElt.getText();
            }
        }
    }
}