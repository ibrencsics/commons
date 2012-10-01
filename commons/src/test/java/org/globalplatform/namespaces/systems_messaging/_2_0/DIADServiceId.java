
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DIAD_ServiceId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_ServiceId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GP_ServiceId" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceIdentifierType"/>
 *         &lt;element name="GP_ServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ServiceQualifierType"/>
 *         &lt;element name="AID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AIDType"/>
 *         &lt;element name="CardProfileUID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}uniqueID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIAD_ServiceId", propOrder = {
    "gpServiceId",
    "gpServiceQualifier",
    "aid",
    "cardProfileUID"
})
public class DIADServiceId {

    @XmlElement(name = "GP_ServiceId", required = true)
    protected ServiceIdentifierType gpServiceId;
    @XmlElement(name = "GP_ServiceQualifier", required = true)
    protected ServiceQualifierType gpServiceQualifier;
    @XmlElement(name = "AID", required = true)
    protected String aid;
    @XmlElement(name = "CardProfileUID", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] cardProfileUID;

    /**
     * Gets the value of the gpServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public ServiceIdentifierType getGPServiceId() {
        return gpServiceId;
    }

    /**
     * Sets the value of the gpServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public void setGPServiceId(ServiceIdentifierType value) {
        this.gpServiceId = value;
    }

    /**
     * Gets the value of the gpServiceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQualifierType }
     *     
     */
    public ServiceQualifierType getGPServiceQualifier() {
        return gpServiceQualifier;
    }

    /**
     * Sets the value of the gpServiceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQualifierType }
     *     
     */
    public void setGPServiceQualifier(ServiceQualifierType value) {
        this.gpServiceQualifier = value;
    }

    /**
     * Gets the value of the aid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAID() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAID(String value) {
        this.aid = value;
    }

    /**
     * Gets the value of the cardProfileUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCardProfileUID() {
        return cardProfileUID;
    }

    /**
     * Sets the value of the cardProfileUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProfileUID(byte[] value) {
        this.cardProfileUID = value;
    }

}
