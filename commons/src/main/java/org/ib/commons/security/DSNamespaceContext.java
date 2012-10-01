package org.ib.commons.security;

import javax.xml.namespace.NamespaceContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 4/27/12
 * Time: 1:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class DSNamespaceContext implements NamespaceContext {

    private Map<String, String> namespaceMap =
        new HashMap<String, String>();

    public DSNamespaceContext() {
        namespaceMap.put("ds", "http://www.w3.org/2000/09/xmldsig#");
        namespaceMap.put("processOrder", "http://order.demo/");
        namespaceMap.put("gp", "http://namespaces.globalplatform.org/systems-profiles/1.1.1");
    }

    public DSNamespaceContext(Map<String, String> namespaces) {
        this();
        namespaceMap.putAll(namespaces);
    }

    public String getNamespaceURI(String arg0) {
        return namespaceMap.get(arg0);
    }

    public void putPrefix(String prefix, String namespace) {
        namespaceMap.put(prefix, namespace);
    }

    public String getPrefix(String arg0) {
        for (String key : namespaceMap.keySet()) {
            String value = namespaceMap.get(key);
            if (value.equals(arg0)) {
                return key;
            }
        }
        return null;
    }

    public Iterator<String> getPrefixes(String arg0) {
        return namespaceMap.keySet().iterator();
    }
}
