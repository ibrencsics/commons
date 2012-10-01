
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CRN" minOccurs="0"/>
 *         &lt;element name="SecureElementId" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ValidCardProfileID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CollatorStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crn",
    "secureElementId",
    "validCardProfileID",
    "aid"
})
@XmlRootElement(name = "CardConfiguration")
public class CardConfiguration {

    @XmlElement(name = "CRN")
    protected CRN crn;
    @XmlElement(name = "SecureElementId")
    protected SEIdentifierType secureElementId;
    @XmlElement(name = "ValidCardProfileID", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected List<byte[]> validCardProfileID;
    @XmlElement(name = "AID")
    protected List<AID> aid;
    @XmlAttribute(name = "CollatorStatus", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String collatorStatus;

    /**
     * Updated for version 2.0.0: element is made optional as it is:
     * - Not used for mobile-NFC service management
     * - But mandatory for other use cases
     * 
     * @return
     *     possible object is
     *     {@link CRN }
     *     
     */
    public CRN getCRN() {
        return crn;
    }

    /**
     * Sets the value of the crn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRN }
     *     
     */
    public void setCRN(CRN value) {
        this.crn = value;
    }

    /**
     * Gets the value of the secureElementId property.
     * 
     * @return
     *     possible object is
     *     {@link SEIdentifierType }
     *     
     */
    public SEIdentifierType getSecureElementId() {
        return secureElementId;
    }

    /**
     * Sets the value of the secureElementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEIdentifierType }
     *     
     */
    public void setSecureElementId(SEIdentifierType value) {
        this.secureElementId = value;
    }

    /**
     * Gets the value of the validCardProfileID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validCardProfileID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidCardProfileID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<byte[]> getValidCardProfileID() {
        if (validCardProfileID == null) {
            validCardProfileID = new ArrayList<byte[]>();
        }
        return this.validCardProfileID;
    }

    /**
     * Gets the value of the aid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AID }
     * 
     * 
     */
    public List<AID> getAID() {
        if (aid == null) {
            aid = new ArrayList<AID>();
        }
        return this.aid;
    }

    /**
     * Gets the value of the collatorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollatorStatus() {
        return collatorStatus;
    }

    /**
     * Sets the value of the collatorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollatorStatus(String value) {
        this.collatorStatus = value;
    }

}
