package org.ib.commons.misc;

import java.io.PrintWriter;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/16/12
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */

public class ListFactory {

    private Class clazz;
    private boolean traceIsOn = false;

    public ListFactory(String className, boolean trace) {
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e); // or whatever is appropriate
        }
        traceIsOn = trace;
    }

    public List newInstance() {
        try {
            List d = (List) clazz.newInstance();

            if (traceIsOn) {
                d = (List) TracingIH.createProxy(d, new PrintWriter(System.out));
            }

            return d;
        } catch (InstantiationException e) {
            throw new RuntimeException(e); // or whatever is appropriate
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e); // or whatever is appropriate
        }
    }
}
