
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SDLifeCycleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SDLifeCycleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INSTALLED"/>
 *     &lt;enumeration value="SELECTABLE"/>
 *     &lt;enumeration value="PERSONALIZED"/>
 *     &lt;enumeration value="LOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SDLifeCycleType")
@XmlEnum
public enum SDLifeCycleType {

    INSTALLED,
    SELECTABLE,
    PERSONALIZED,
    LOCKED;

    public String value() {
        return name();
    }

    public static SDLifeCycleType fromValue(String v) {
        return valueOf(v);
    }

}
