
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the BeginConversationRequest message, in case or successful processing of the function
 * 
 * <p>Java class for BeginConversationResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeginConversationResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="UsedBearer" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BearerType"/>
 *         &lt;element name="APDUScriptSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="NumberOfAPDUs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ScriptFormat" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ScriptFormatType"/>
 *         &lt;element name="APDUResponseScriptSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TimeToLive" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeginConversationResponseDataType", propOrder = {
    "conversationID",
    "usedBearer",
    "apduScriptSize",
    "numberOfAPDUs",
    "scriptFormat",
    "apduResponseScriptSize",
    "timeToLive"
})
public class BeginConversationResponseDataType {

    @XmlElement(name = "ConversationID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger conversationID;
    @XmlElement(name = "UsedBearer", required = true)
    protected BigInteger usedBearer;
    @XmlElement(name = "APDUScriptSize", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger apduScriptSize;
    @XmlElement(name = "NumberOfAPDUs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfAPDUs;
    @XmlElement(name = "ScriptFormat", required = true)
    protected ScriptFormatType scriptFormat;
    @XmlElement(name = "APDUResponseScriptSize")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger apduResponseScriptSize;
    @XmlElement(name = "TimeToLive")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger timeToLive;

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
     * Gets the value of the usedBearer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedBearer() {
        return usedBearer;
    }

    /**
     * Sets the value of the usedBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedBearer(BigInteger value) {
        this.usedBearer = value;
    }

    /**
     * Gets the value of the apduScriptSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAPDUScriptSize() {
        return apduScriptSize;
    }

    /**
     * Sets the value of the apduScriptSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAPDUScriptSize(BigInteger value) {
        this.apduScriptSize = value;
    }

    /**
     * Gets the value of the numberOfAPDUs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAPDUs() {
        return numberOfAPDUs;
    }

    /**
     * Sets the value of the numberOfAPDUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAPDUs(BigInteger value) {
        this.numberOfAPDUs = value;
    }

    /**
     * Gets the value of the scriptFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ScriptFormatType }
     *     
     */
    public ScriptFormatType getScriptFormat() {
        return scriptFormat;
    }

    /**
     * Sets the value of the scriptFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptFormatType }
     *     
     */
    public void setScriptFormat(ScriptFormatType value) {
        this.scriptFormat = value;
    }

    /**
     * Gets the value of the apduResponseScriptSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAPDUResponseScriptSize() {
        return apduResponseScriptSize;
    }

    /**
     * Sets the value of the apduResponseScriptSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAPDUResponseScriptSize(BigInteger value) {
        this.apduResponseScriptSize = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeToLive(BigInteger value) {
        this.timeToLive = value;
    }

}
