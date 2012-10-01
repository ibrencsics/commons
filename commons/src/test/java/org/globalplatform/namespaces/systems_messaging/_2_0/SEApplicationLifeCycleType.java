
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SEApplicationLifeCycleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SEApplicationLifeCycleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INSTALLED"/>
 *     &lt;enumeration value="SELECTABLE"/>
 *     &lt;enumeration value="APPLICATION_SPECIFIC"/>
 *     &lt;enumeration value="LOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SEApplicationLifeCycleType")
@XmlEnum
public enum SEApplicationLifeCycleType {

    INSTALLED,
    SELECTABLE,
    APPLICATION_SPECIFIC,
    LOCKED;

    public String value() {
        return name();
    }

    public static SEApplicationLifeCycleType fromValue(String v) {
        return valueOf(v);
    }

}
