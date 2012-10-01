
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}JobContainer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EnvironmentName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EnvironmentVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Preference" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CommandInterpreterSupport" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CommandInterpreterType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CommandInterpreterVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jobContainer"
})
@XmlRootElement(name = "EnvironmentContainer")
public class EnvironmentContainer {

    @XmlElement(name = "JobContainer", required = true)
    protected List<JobContainer> jobContainer;
    @XmlAttribute(name = "EnvironmentName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String environmentName;
    @XmlAttribute(name = "EnvironmentVersion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String environmentVersion;
    @XmlAttribute(name = "Preference", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String preference;
    @XmlAttribute(name = "CommandInterpreterSupport")
    @XmlSchemaType(name = "anySimpleType")
    protected String commandInterpreterSupport;
    @XmlAttribute(name = "CommandInterpreterType")
    protected String commandInterpreterType;
    @XmlAttribute(name = "CommandInterpreterVersion")
    protected String commandInterpreterVersion;

    /**
     * Gets the value of the jobContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobContainer }
     * 
     * 
     */
    public List<JobContainer> getJobContainer() {
        if (jobContainer == null) {
            jobContainer = new ArrayList<JobContainer>();
        }
        return this.jobContainer;
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

    /**
     * Gets the value of the preference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreference() {
        return preference;
    }

    /**
     * Sets the value of the preference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreference(String value) {
        this.preference = value;
    }

    /**
     * Gets the value of the commandInterpreterSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandInterpreterSupport() {
        return commandInterpreterSupport;
    }

    /**
     * Sets the value of the commandInterpreterSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandInterpreterSupport(String value) {
        this.commandInterpreterSupport = value;
    }

    /**
     * Gets the value of the commandInterpreterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandInterpreterType() {
        return commandInterpreterType;
    }

    /**
     * Sets the value of the commandInterpreterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandInterpreterType(String value) {
        this.commandInterpreterType = value;
    }

    /**
     * Gets the value of the commandInterpreterVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandInterpreterVersion() {
        return commandInterpreterVersion;
    }

    /**
     * Sets the value of the commandInterpreterVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandInterpreterVersion(String value) {
        this.commandInterpreterVersion = value;
    }

}
