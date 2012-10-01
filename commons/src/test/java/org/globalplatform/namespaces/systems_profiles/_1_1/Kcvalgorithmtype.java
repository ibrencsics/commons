
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kcvalgorithmtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kcvalgorithmtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EIGHTZEROS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "kcvalgorithmtype")
@XmlEnum
public enum Kcvalgorithmtype {

    EIGHTZEROS;

    public String value() {
        return name();
    }

    public static Kcvalgorithmtype fromValue(String v) {
        return valueOf(v);
    }

}
