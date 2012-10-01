
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DIAD_ContextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DIAD_ContextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MessageQueue"/>
 *     &lt;enumeration value="WebService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAD_ContextType")
@XmlEnum
public enum DIADContextType {

    @XmlEnumValue("MessageQueue")
    MESSAGE_QUEUE("MessageQueue"),
    @XmlEnumValue("WebService")
    WEB_SERVICE("WebService");
    private final String value;

    DIADContextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIADContextType fromValue(String v) {
        for (DIADContextType c: DIADContextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
