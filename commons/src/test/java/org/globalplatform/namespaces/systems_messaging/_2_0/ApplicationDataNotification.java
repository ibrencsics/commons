
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ApplicationCommonData" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ApplicationDataPerCRN" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BatchID" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BatchID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationCommonData",
    "applicationDataPerCRN"
})
@XmlRootElement(name = "ApplicationDataNotification")
public class ApplicationDataNotification {

    @XmlElement(name = "ApplicationCommonData")
    protected ApplicationCommonData applicationCommonData;
    @XmlElement(name = "ApplicationDataPerCRN", required = true)
    protected List<ApplicationDataPerCRN> applicationDataPerCRN;
    @XmlAttribute(name = "BatchID", required = true)
    protected String batchID;

    /**
     * Gets the value of the applicationCommonData property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationCommonData }
     *     
     */
    public ApplicationCommonData getApplicationCommonData() {
        return applicationCommonData;
    }

    /**
     * Sets the value of the applicationCommonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationCommonData }
     *     
     */
    public void setApplicationCommonData(ApplicationCommonData value) {
        this.applicationCommonData = value;
    }

    /**
     * Gets the value of the applicationDataPerCRN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationDataPerCRN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationDataPerCRN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationDataPerCRN }
     * 
     * 
     */
    public List<ApplicationDataPerCRN> getApplicationDataPerCRN() {
        if (applicationDataPerCRN == null) {
            applicationDataPerCRN = new ArrayList<ApplicationDataPerCRN>();
        }
        return this.applicationDataPerCRN;
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
