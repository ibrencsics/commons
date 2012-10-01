
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig.SignatureType;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AID" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ApplicationProfileUniqueID" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ProcessingStep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}LogData" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ICCData" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aid",
    "applicationProfileUniqueID",
    "processingStep",
    "logData",
    "iccData",
    "signature"
})
@XmlRootElement(name = "ApplicationData")
public class ApplicationData {

    @XmlElement(name = "AID")
    protected AID aid;
    @XmlElement(name = "ApplicationProfileUniqueID", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] applicationProfileUniqueID;
    @XmlElement(name = "ProcessingStep")
    protected List<ProcessingStep> processingStep;
    @XmlElement(name = "LogData")
    protected LogData logData;
    @XmlElement(name = "ICCData")
    protected ICCData iccData;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * Updated for version 2.0.0: element is made optional as it is:
     * - Not used for mobile-NFC service management
     * - But mandatory for other use cases
     * 
     * @return
     *     possible object is
     *     {@link AID }
     *     
     */
    public AID getAID() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AID }
     *     
     */
    public void setAID(AID value) {
        this.aid = value;
    }

    /**
     * Gets the value of the applicationProfileUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getApplicationProfileUniqueID() {
        return applicationProfileUniqueID;
    }

    /**
     * Sets the value of the applicationProfileUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationProfileUniqueID(byte[] value) {
        this.applicationProfileUniqueID = value;
    }

    /**
     * Gets the value of the processingStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingStep }
     * 
     * 
     */
    public List<ProcessingStep> getProcessingStep() {
        if (processingStep == null) {
            processingStep = new ArrayList<ProcessingStep>();
        }
        return this.processingStep;
    }

    /**
     * Gets the value of the logData property.
     * 
     * @return
     *     possible object is
     *     {@link LogData }
     *     
     */
    public LogData getLogData() {
        return logData;
    }

    /**
     * Sets the value of the logData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogData }
     *     
     */
    public void setLogData(LogData value) {
        this.logData = value;
    }

    /**
     * Gets the value of the iccData property.
     * 
     * @return
     *     possible object is
     *     {@link ICCData }
     *     
     */
    public ICCData getICCData() {
        return iccData;
    }

    /**
     * Sets the value of the iccData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCData }
     *     
     */
    public void setICCData(ICCData value) {
        this.iccData = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
