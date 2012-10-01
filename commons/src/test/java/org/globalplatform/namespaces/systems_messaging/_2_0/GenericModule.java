
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig.SignatureType;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ProfileUniqueID"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ProcessingStep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}LogData" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ModuleData" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ModuleName" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ModuleNameType" />
 *       &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profileUniqueID",
    "processingStep",
    "logData",
    "moduleData",
    "signature"
})
@XmlRootElement(name = "GenericModule")
public class GenericModule {

    @XmlElement(name = "ProfileUniqueID", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] profileUniqueID;
    @XmlElement(name = "ProcessingStep")
    protected List<ProcessingStep> processingStep;
    @XmlElement(name = "LogData")
    protected LogData logData;
    @XmlElement(name = "ModuleData")
    protected ModuleData moduleData;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "ModuleName", required = true)
    protected String moduleName;
    @XmlAttribute(name = "Identifier")
    protected String identifier;

    /**
     * Gets the value of the profileUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getProfileUniqueID() {
        return profileUniqueID;
    }

    /**
     * Sets the value of the profileUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileUniqueID(byte[] value) {
        this.profileUniqueID = value;
    }

    /**
     * Gets the value of the processingStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingStep }
     * 
     * 
     */
    public List<ProcessingStep> getProcessingStep() {
        if (processingStep == null) {
            processingStep = new ArrayList<ProcessingStep>();
        }
        return this.processingStep;
    }

    /**
     * Gets the value of the logData property.
     * 
     * @return
     *     possible object is
     *     {@link LogData }
     *     
     */
    public LogData getLogData() {
        return logData;
    }

    /**
     * Sets the value of the logData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogData }
     *     
     */
    public void setLogData(LogData value) {
        this.logData = value;
    }

    /**
     * Gets the value of the moduleData property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleData }
     *     
     */
    public ModuleData getModuleData() {
        return moduleData;
    }

    /**
     * Sets the value of the moduleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleData }
     *     
     */
    public void setModuleData(ModuleData value) {
        this.moduleData = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
