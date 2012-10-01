
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Error" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CRN"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CollatorReturnCode" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ValidCardProfileID" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}PhysicalCardIdentifier" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}MuteCardsNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DecollationStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "error",
    "crn",
    "collatorReturnCode",
    "validCardProfileID",
    "physicalCardIdentifier",
    "muteCardsNumber"
})
@XmlRootElement(name = "CardConfigurationLog")
public class CardConfigurationLog {

    @XmlElement(name = "Error")
    protected Error error;
    @XmlElement(name = "CRN", required = true)
    protected CRN crn;
    @XmlElement(name = "CollatorReturnCode")
    protected CollatorReturnCode collatorReturnCode;
    @XmlElement(name = "ValidCardProfileID", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] validCardProfileID;
    @XmlElement(name = "PhysicalCardIdentifier", required = true)
    protected List<PhysicalCardIdentifier> physicalCardIdentifier;
    @XmlElement(name = "MuteCardsNumber")
    protected Short muteCardsNumber;
    @XmlAttribute(name = "DecollationStatus")
    @XmlSchemaType(name = "anySimpleType")
    protected String decollationStatus;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the crn property.
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
     * Gets the value of the collatorReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatorReturnCode }
     *     
     */
    public CollatorReturnCode getCollatorReturnCode() {
        return collatorReturnCode;
    }

    /**
     * Sets the value of the collatorReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatorReturnCode }
     *     
     */
    public void setCollatorReturnCode(CollatorReturnCode value) {
        this.collatorReturnCode = value;
    }

    /**
     * Gets the value of the validCardProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getValidCardProfileID() {
        return validCardProfileID;
    }

    /**
     * Sets the value of the validCardProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidCardProfileID(byte[] value) {
        this.validCardProfileID = value;
    }

    /**
     * Gets the value of the physicalCardIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalCardIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalCardIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalCardIdentifier }
     * 
     * 
     */
    public List<PhysicalCardIdentifier> getPhysicalCardIdentifier() {
        if (physicalCardIdentifier == null) {
            physicalCardIdentifier = new ArrayList<PhysicalCardIdentifier>();
        }
        return this.physicalCardIdentifier;
    }

    /**
     * Gets the value of the muteCardsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMuteCardsNumber() {
        return muteCardsNumber;
    }

    /**
     * Sets the value of the muteCardsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMuteCardsNumber(Short value) {
        this.muteCardsNumber = value;
    }

    /**
     * Gets the value of the decollationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecollationStatus() {
        return decollationStatus;
    }

    /**
     * Sets the value of the decollationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecollationStatus(String value) {
        this.decollationStatus = value;
    }

}
