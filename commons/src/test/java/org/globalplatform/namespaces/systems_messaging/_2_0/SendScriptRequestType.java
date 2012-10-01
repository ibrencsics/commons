
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Requests for the sending of a set of APDUs to a Secure Element, in the context of the management of a particular instance of mobile-NFC service through a particular Mobile Subscription. The call to this function SHALL be done in the context of an already declared conversation.
 * 
 * 
 * <p>Java class for SendScriptRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendScriptRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="CommandAPDU" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}APDUType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendScriptRequestType", propOrder = {
    "conversationID",
    "commandAPDU"
})
public class SendScriptRequestType
    extends BasicRequestType
{

    @XmlElement(name = "ConversationID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger conversationID;
    @XmlElement(name = "CommandAPDU", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected List<byte[]> commandAPDU;

    /**
     * Gets the value of the conversationID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConversationID(BigInteger value) {
        this.conversationID = value;
    }

    /**
     * Gets the value of the commandAPDU property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commandAPDU property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommandAPDU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<byte[]> getCommandAPDU() {
        if (commandAPDU == null) {
            commandAPDU = new ArrayList<byte[]>();
        }
        return this.commandAPDU;
    }

}
