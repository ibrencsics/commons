
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="profileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="CP_CHANGES"/>
 *     &lt;enumeration value="KP"/>
 *     &lt;enumeration value="KEY_EXCHANGE"/>
 *     &lt;enumeration value="LFP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "profileType")
@XmlEnum
public enum ProfileType {

    AP,
    CP,
    CP_CHANGES,
    KP,
    KEY_EXCHANGE,
    LFP;

    public String value() {
        return name();
    }

    public static ProfileType fromValue(String v) {
        return valueOf(v);
    }

}
