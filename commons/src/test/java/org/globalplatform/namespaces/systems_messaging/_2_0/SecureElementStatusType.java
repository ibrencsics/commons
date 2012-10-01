
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureElementStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecureElementStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="ACTIVATED"/>
 *     &lt;enumeration value="TERMINATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecureElementStatusType")
@XmlEnum
public enum SecureElementStatusType {

    SUSPENDED,
    ACTIVATED,
    TERMINATED;

    public String value() {
        return name();
    }

    public static SecureElementStatusType fromValue(String v) {
        return valueOf(v);
    }

}
