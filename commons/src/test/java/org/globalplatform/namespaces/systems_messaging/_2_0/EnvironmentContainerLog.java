
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Error" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}JobContainerLog" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EnvironmentName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EnvironmentVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "jobContainerLog"
})
@XmlRootElement(name = "EnvironmentContainerLog")
public class EnvironmentContainerLog {

    @XmlElement(name = "Error")
    protected Error error;
    @XmlElement(name = "JobContainerLog", required = true)
    protected List<JobContainerLog> jobContainerLog;
    @XmlAttribute(name = "EnvironmentName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String environmentName;
    @XmlAttribute(name = "EnvironmentVersion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String environmentVersion;

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
     * Gets the value of the jobContainerLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobContainerLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobContainerLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobContainerLog }
     * 
     * 
     */
    public List<JobContainerLog> getJobContainerLog() {
        if (jobContainerLog == null) {
            jobContainerLog = new ArrayList<JobContainerLog>();
        }
        return this.jobContainerLog;
    }

    /**
     * Gets the value of the environmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * Sets the value of the environmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentName(String value) {
        this.environmentName = value;
    }

    /**
     * Gets the value of the environmentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentVersion() {
        return environmentVersion;
    }

    /**
     * Sets the value of the environmentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentVersion(String value) {
        this.environmentVersion = value;
    }

}
