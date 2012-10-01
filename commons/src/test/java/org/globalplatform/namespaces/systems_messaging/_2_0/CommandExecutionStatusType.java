
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommandExecutionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommandExecutionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXECUTED_SUCCESS"/>
 *     &lt;enumeration value="EXECUTED_WITHWARNING"/>
 *     &lt;enumeration value="EXECUTED_FAILED"/>
 *     &lt;enumeration value="NOTEXECUTED"/>
 *     &lt;enumeration value="DELIVEREDWITHNORESPONSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommandExecutionStatusType")
@XmlEnum
public enum CommandExecutionStatusType {

    EXECUTED_SUCCESS,
    EXECUTED_WITHWARNING,
    EXECUTED_FAILED,
    NOTEXECUTED,
    DELIVEREDWITHNORESPONSE;

    public String value() {
        return name();
    }

    public static CommandExecutionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
