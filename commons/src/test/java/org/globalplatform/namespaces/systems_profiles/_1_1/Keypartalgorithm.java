
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keypartalgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="keypartalgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XOR"/>
 *     &lt;enumeration value="CONCATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "keypartalgorithm")
@XmlEnum
public enum Keypartalgorithm {

    XOR,
    CONCATE;

    public String value() {
        return name();
    }

    public static Keypartalgorithm fromValue(String v) {
        return valueOf(v);
    }

}
