
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ELFLifeCycleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ELFLifeCycleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOADED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ELFLifeCycleType")
@XmlEnum
public enum ELFLifeCycleType {

    LOADED;

    public String value() {
        return name();
    }

    public static ELFLifeCycleType fromValue(String v) {
        return valueOf(v);
    }

}
