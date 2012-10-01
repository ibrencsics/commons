
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}PersoDeviceIns" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ScriptFragment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SECommand" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Requirement" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DataSet" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "persoDeviceIns",
    "scriptFragment",
    "seCommand"
})
@XmlRootElement(name = "ProcessingStep")
public class ProcessingStep {

    @XmlElement(name = "PersoDeviceIns")
    protected PersoDeviceIns persoDeviceIns;
    @XmlElement(name = "ScriptFragment")
    protected List<String> scriptFragment;
    @XmlElement(name = "SECommand")
    protected SECommandType seCommand;
    @XmlAttribute(name = "Action", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String action;
    @XmlAttribute(name = "Requirement", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String requirement;
    @XmlAttribute(name = "DataSet")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataSet;

    /**
     * Gets the value of the persoDeviceIns property.
     * 
     * @return
     *     possible object is
     *     {@link PersoDeviceIns }
     *     
     */
    public PersoDeviceIns getPersoDeviceIns() {
        return persoDeviceIns;
    }

    /**
     * Sets the value of the persoDeviceIns property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoDeviceIns }
     *     
     */
    public void setPersoDeviceIns(PersoDeviceIns value) {
        this.persoDeviceIns = value;
    }

    /**
     * Renamed for version 2.0.0 to avoid naming conflict: Script --> ScriptFragment Gets the value of the scriptFragment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scriptFragment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScriptFragment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScriptFragment() {
        if (scriptFragment == null) {
            scriptFragment = new ArrayList<String>();
        }
        return this.scriptFragment;
    }

    /**
     * Gets the value of the seCommand property.
     * 
     * @return
     *     possible object is
     *     {@link SECommandType }
     *     
     */
    public SECommandType getSECommand() {
        return seCommand;
    }

    /**
     * Sets the value of the seCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECommandType }
     *     
     */
    public void setSECommand(SECommandType value) {
        this.seCommand = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * Sets the value of the requirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirement(String value) {
        this.requirement = value;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSet(String value) {
        this.dataSet = value;
    }

}
