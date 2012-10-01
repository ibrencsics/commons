
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CRN" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}AID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BatchID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BatchID" />
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
    "aid"
})
@XmlRootElement(name = "ApplicationDataRequest")
public class ApplicationDataRequest {

    @XmlElement(name = "CRN", required = true)
    protected List<CRN> crn;
    @XmlElement(name = "AID")
    protected AID aid;
    @XmlAttribute(name = "BatchID")
    protected String batchID;

    /**
     * Gets the value of the crn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRN }
     * 
     * 
     */
    public List<CRN> getCRN() {
        if (crn == null) {
            crn = new ArrayList<CRN>();
        }
        return this.crn;
    }

    /**
     * Gets the value of the aid property.
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
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchID(String value) {
        this.batchID = value;
    }

}
