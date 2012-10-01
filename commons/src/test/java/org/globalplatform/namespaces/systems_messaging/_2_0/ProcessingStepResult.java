
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ScriptFragment" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Error" minOccurs="0"/>
 *         &lt;element name="SECommandResult" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="Requirement" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="DataSet" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="StatusWords" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
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
    "error",
    "seCommandResult"
})
@XmlRootElement(name = "ProcessingStepResult")
public class ProcessingStepResult {

    @XmlElement(name = "PersoDeviceIns")
    protected PersoDeviceIns persoDeviceIns;
    @XmlElement(name = "ScriptFragment")
    protected String scriptFragment;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlElement(name = "SECommandResult")
    protected SECommandResultType seCommandResult;
    @XmlAttribute(name = "Action", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] action;
    @XmlAttribute(name = "Requirement", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] requirement;
    @XmlAttribute(name = "DataSet")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] dataSet;
    @XmlAttribute(name = "StatusWords")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] statusWords;

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
     * Renamed for version 2.0.0 to avoid naming conflict: Script --> ScriptFragment
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptFragment() {
        return scriptFragment;
    }

    /**
     * Sets the value of the scriptFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptFragment(String value) {
        this.scriptFragment = value;
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
     * Gets the value of the seCommandResult property.
     * 
     * @return
     *     possible object is
     *     {@link SECommandResultType }
     *     
     */
    public SECommandResultType getSECommandResult() {
        return seCommandResult;
    }

    /**
     * Sets the value of the seCommandResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECommandResultType }
     *     
     */
    public void setSECommandResult(SECommandResultType value) {
        this.seCommandResult = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAction() {
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
    public void setAction(byte[] value) {
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
    public byte[] getRequirement() {
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
    public void setRequirement(byte[] value) {
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
    public byte[] getDataSet() {
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
    public void setDataSet(byte[] value) {
        this.dataSet = value;
    }

    /**
     * Gets the value of the statusWords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getStatusWords() {
        return statusWords;
    }

    /**
     * Sets the value of the statusWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusWords(byte[] value) {
        this.statusWords = value;
    }

}
