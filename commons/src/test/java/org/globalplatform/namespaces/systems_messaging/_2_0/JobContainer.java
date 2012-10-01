
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DataContainerHeader" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="JobID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="JobPriorityLevel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RiskLevel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataContainerHeader"
})
@XmlRootElement(name = "JobContainer")
public class JobContainer {

    @XmlElement(name = "DataContainerHeader", required = true)
    protected List<DataContainerHeader> dataContainerHeader;
    @XmlAttribute(name = "JobID")
    @XmlSchemaType(name = "anySimpleType")
    protected String jobID;
    @XmlAttribute(name = "JobPriorityLevel")
    @XmlSchemaType(name = "anySimpleType")
    protected String jobPriorityLevel;
    @XmlAttribute(name = "RiskLevel")
    @XmlSchemaType(name = "anySimpleType")
    protected String riskLevel;

    /**
     * Gets the value of the dataContainerHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataContainerHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataContainerHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataContainerHeader }
     * 
     * 
     */
    public List<DataContainerHeader> getDataContainerHeader() {
        if (dataContainerHeader == null) {
            dataContainerHeader = new ArrayList<DataContainerHeader>();
        }
        return this.dataContainerHeader;
    }

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the jobPriorityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPriorityLevel() {
        return jobPriorityLevel;
    }

    /**
     * Sets the value of the jobPriorityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPriorityLevel(String value) {
        this.jobPriorityLevel = value;
    }

    /**
     * Gets the value of the riskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevel(String value) {
        this.riskLevel = value;
    }

}
