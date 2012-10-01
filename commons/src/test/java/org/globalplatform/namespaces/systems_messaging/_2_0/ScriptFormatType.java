
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScriptFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScriptFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPACT"/>
 *     &lt;enumeration value="EXPANDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScriptFormatType")
@XmlEnum
public enum ScriptFormatType {

    COMPACT,
    EXPANDED;

    public String value() {
        return name();
    }

    public static ScriptFormatType fromValue(String v) {
        return valueOf(v);
    }

}
