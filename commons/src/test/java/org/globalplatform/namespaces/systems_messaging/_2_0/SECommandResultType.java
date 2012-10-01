
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Provide the individual result of the on-card execution of a corresponding SE command.
 * Sequence of result follows the sequence of SE Command provided in the function input data.
 * 
 * <p>Java class for SECommandResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECommandResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommandExecutionStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CommandExecutionStatusType"/>
 *         &lt;element name="CommandStatusCodeData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CommandStatusCodeDataType" minOccurs="0"/>
 *         &lt;element name="SECommandResponse" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandResponseType" minOccurs="0"/>
 *         &lt;element name="ResponseAPDU" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}APDUResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECommandResultType", propOrder = {
    "commandExecutionStatus",
    "commandStatusCodeData",
    "seCommandResponse",
    "responseAPDU"
})
public class SECommandResultType {

    @XmlElement(name = "CommandExecutionStatus", required = true)
    protected CommandExecutionStatusType commandExecutionStatus;
    @XmlElement(name = "CommandStatusCodeData")
    protected CommandStatusCodeDataType commandStatusCodeData;
    @XmlElement(name = "SECommandResponse")
    protected SECommandResponseType seCommandResponse;
    @XmlElement(name = "ResponseAPDU", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] responseAPDU;

    /**
     * Gets the value of the commandExecutionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CommandExecutionStatusType }
     *     
     */
    public CommandExecutionStatusType getCommandExecutionStatus() {
        return commandExecutionStatus;
    }

    /**
     * Sets the value of the commandExecutionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandExecutionStatusType }
     *     
     */
    public void setCommandExecutionStatus(CommandExecutionStatusType value) {
        this.commandExecutionStatus = value;
    }

    /**
     * Gets the value of the commandStatusCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link CommandStatusCodeDataType }
     *     
     */
    public CommandStatusCodeDataType getCommandStatusCodeData() {
        return commandStatusCodeData;
    }

    /**
     * Sets the value of the commandStatusCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandStatusCodeDataType }
     *     
     */
    public void setCommandStatusCodeData(CommandStatusCodeDataType value) {
        this.commandStatusCodeData = value;
    }

    /**
     * Gets the value of the seCommandResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SECommandResponseType }
     *     
     */
    public SECommandResponseType getSECommandResponse() {
        return seCommandResponse;
    }

    /**
     * Sets the value of the seCommandResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECommandResponseType }
     *     
     */
    public void setSECommandResponse(SECommandResponseType value) {
        this.seCommandResponse = value;
    }

    /**
     * Gets the value of the responseAPDU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getResponseAPDU() {
        return responseAPDU;
    }

    /**
     * Sets the value of the responseAPDU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseAPDU(byte[] value) {
        this.responseAPDU = value;
    }

}
