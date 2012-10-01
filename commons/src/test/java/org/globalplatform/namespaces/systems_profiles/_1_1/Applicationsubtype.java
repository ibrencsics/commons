
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationsubtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="applicationsubtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="APP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "applicationsubtype")
@XmlEnum
public enum Applicationsubtype {

    CM,
    SD,
    APP;

    public String value() {
        return name();
    }

    public static Applicationsubtype fromValue(String v) {
        return valueOf(v);
    }

}
