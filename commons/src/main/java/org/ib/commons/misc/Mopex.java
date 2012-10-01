package org.ib.commons.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/14/12
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mopex {

    public static Field[] getInstanceVariables(Class cls) {
        List accum = new LinkedList();
        while (cls != null) {
            Field[] fields = cls.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                if (!Modifier.isStatic(fields[i].getModifiers())) {
                    accum.add(fields[i]);
                }
            }
            cls = cls.getSuperclass();
        }
        Field[] retvalue = new Field[accum.size()];
        return (Field[]) accum.toArray(retvalue);
    }

}
