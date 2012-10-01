
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}EnvironmentContainer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BatchID" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BatchID" />
 *       &lt;attribute name="IssuingEntity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProcessingEntity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserData" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "environmentContainer"
})
@XmlRootElement(name = "BatchCardCustomization")
public class BatchCardCustomization {

    @XmlElement(name = "EnvironmentContainer", required = true)
    protected List<EnvironmentContainer> environmentContainer;
    @XmlAttribute(name = "BatchID", required = true)
    protected String batchID;
    @XmlAttribute(name = "IssuingEntity", required = true)
    protected String issuingEntity;
    @XmlAttribute(name = "ProcessingEntity", required = true)
    protected String processingEntity;
    @XmlAttribute(name = "UserData")
    protected String userData;

    /**
     * Gets the value of the environmentContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentContainer }
     * 
     * 
     */
    public List<EnvironmentContainer> getEnvironmentContainer() {
        if (environmentContainer == null) {
            environmentContainer = new ArrayList<EnvironmentContainer>();
        }
        return this.environmentContainer;
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

    /**
     * Gets the value of the issuingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingEntity() {
        return issuingEntity;
    }

    /**
     * Sets the value of the issuingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingEntity(String value) {
        this.issuingEntity = value;
    }

    /**
     * Gets the value of the processingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingEntity() {
        return processingEntity;
    }

    /**
     * Sets the value of the processingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingEntity(String value) {
        this.processingEntity = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserData(String value) {
        this.userData = value;
    }

}
