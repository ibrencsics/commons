
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="AuditTrailHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EnvironmentContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="JobContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DataContainerHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Collation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DataContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ReturnCodeStep")
public class ReturnCodeStep {

    @XmlAttribute(name = "AuditTrailHeader")
    protected Boolean auditTrailHeader;
    @XmlAttribute(name = "EnvironmentContainer")
    protected Boolean environmentContainer;
    @XmlAttribute(name = "JobContainer")
    protected Boolean jobContainer;
    @XmlAttribute(name = "DataContainerHeader")
    protected Boolean dataContainerHeader;
    @XmlAttribute(name = "Collation")
    protected Boolean collation;
    @XmlAttribute(name = "DataContainer")
    protected Boolean dataContainer;

    /**
     * Gets the value of the auditTrailHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuditTrailHeader() {
        return auditTrailHeader;
    }

    /**
     * Sets the value of the auditTrailHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditTrailHeader(Boolean value) {
        this.auditTrailHeader = value;
    }

    /**
     * Gets the value of the environmentContainer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnvironmentContainer() {
        return environmentContainer;
    }

    /**
     * Sets the value of the environmentContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnvironmentContainer(Boolean value) {
        this.environmentContainer = value;
    }

    /**
     * Gets the value of the jobContainer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJobContainer() {
        return jobContainer;
    }

    /**
     * Sets the value of the jobContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobContainer(Boolean value) {
        this.jobContainer = value;
    }

    /**
     * Gets the value of the dataContainerHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataContainerHeader() {
        return dataContainerHeader;
    }

    /**
     * Sets the value of the dataContainerHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataContainerHeader(Boolean value) {
        this.dataContainerHeader = value;
    }

    /**
     * Gets the value of the collation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollation() {
        return collation;
    }

    /**
     * Sets the value of the collation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollation(Boolean value) {
        this.collation = value;
    }

    /**
     * Gets the value of the dataContainer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataContainer() {
        return dataContainer;
    }

    /**
     * Sets the value of the dataContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataContainer(Boolean value) {
        this.dataContainer = value;
    }

}
