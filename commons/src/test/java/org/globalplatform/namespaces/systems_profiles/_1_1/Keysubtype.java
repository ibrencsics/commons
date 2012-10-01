
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keysubtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="keysubtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DES"/>
 *     &lt;enumeration value="RSA"/>
 *     &lt;enumeration value="RSACRT"/>
 *     &lt;enumeration value="EC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "keysubtype")
@XmlEnum
public enum Keysubtype {

    DES,
    RSA,
    RSACRT,
    EC;

    public String value() {
        return name();
    }

    public static Keysubtype fromValue(String v) {
        return valueOf(v);
    }

}
