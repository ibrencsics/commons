
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ReturnCodeStep" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Error" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}EnvironmentContainerLog" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BatchID" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BatchID" />
 *       &lt;attribute name="IssuingEntity" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ProcessingEntity" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="User" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "returnCodeStep",
    "error",
    "environmentContainerLog"
})
@XmlRootElement(name = "BatchAuditTrail")
public class BatchAuditTrail {

    @XmlElement(name = "ReturnCodeStep")
    protected ReturnCodeStep returnCodeStep;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlElement(name = "EnvironmentContainerLog", required = true)
    protected List<EnvironmentContainerLog> environmentContainerLog;
    @XmlAttribute(name = "BatchID", required = true)
    protected String batchID;
    @XmlAttribute(name = "IssuingEntity", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issuingEntity;
    @XmlAttribute(name = "ProcessingEntity", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String processingEntity;
    @XmlAttribute(name = "User")
    @XmlSchemaType(name = "anySimpleType")
    protected String user;

    /**
     * Gets the value of the returnCodeStep property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCodeStep }
     *     
     */
    public ReturnCodeStep getReturnCodeStep() {
        return returnCodeStep;
    }

    /**
     * Sets the value of the returnCodeStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCodeStep }
     *     
     */
    public void setReturnCodeStep(ReturnCodeStep value) {
        this.returnCodeStep = value;
    }

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
     * Gets the value of the environmentContainerLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentContainerLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentContainerLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentContainerLog }
     * 
     * 
     */
    public List<EnvironmentContainerLog> getEnvironmentContainerLog() {
        if (environmentContainerLog == null) {
            environmentContainerLog = new ArrayList<EnvironmentContainerLog>();
        }
        return this.environmentContainerLog;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
