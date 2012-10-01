
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tkalgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tkalgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CBC"/>
 *     &lt;enumeration value="ECB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tkalgorithm")
@XmlEnum
public enum Tkalgorithm {

    CBC,
    ECB;

    public String value() {
        return name();
    }

    public static Tkalgorithm fromValue(String v) {
        return valueOf(v);
    }

}
