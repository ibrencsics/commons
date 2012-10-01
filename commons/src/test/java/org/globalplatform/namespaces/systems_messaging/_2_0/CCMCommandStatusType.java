
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The status of execution of the Card Content Management commands.
 * 
 * <p>Java class for CCMCommandStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCMCommandStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommandExecutionStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CommandExecutionStatusType"/>
 *         &lt;element name="Receipt" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="ConfirmationData" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCMCommandStatusType", propOrder = {
    "commandExecutionStatus",
    "receipt",
    "confirmationData"
})
public class CCMCommandStatusType {

    @XmlElement(name = "CommandExecutionStatus", required = true)
    protected CommandExecutionStatusType commandExecutionStatus;
    @XmlElement(name = "Receipt", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] receipt;
    @XmlElement(name = "ConfirmationData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] confirmationData;

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
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceipt(byte[] value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the confirmationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getConfirmationData() {
        return confirmationData;
    }

    /**
     * Sets the value of the confirmationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationData(byte[] value) {
        this.confirmationData = value;
    }

}
