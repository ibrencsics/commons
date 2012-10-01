
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for securityLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="securityLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C_MAC_R_MAC_C_DECRYPTION"/>
 *     &lt;enumeration value="C_MAC_R_MAC"/>
 *     &lt;enumeration value="C_MAC"/>
 *     &lt;enumeration value="C_MAC_C_DECRYPTION"/>
 *     &lt;enumeration value="R_MAC"/>
 *     &lt;enumeration value="NO_SECURE_MESSAGING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "securityLevel")
@XmlEnum
public enum SecurityLevel {

    C_MAC_R_MAC_C_DECRYPTION,
    C_MAC_R_MAC,
    C_MAC,
    C_MAC_C_DECRYPTION,
    R_MAC,
    NO_SECURE_MESSAGING;

    public String value() {
        return name();
    }

    public static SecurityLevel fromValue(String v) {
        return valueOf(v);
    }

}
