
package org.globalplatform.namespaces.systems_profiles._1_1;

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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Description" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ConflictRules" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Declaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}KeyDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Script"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StartLifeCycle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EndLifeCycle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecureChannel" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}secureChannelProtocol" />
 *       &lt;attribute name="SecurityLevel" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}securityLevel" />
 *       &lt;attribute name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "conflictRules",
    "declaration",
    "keyDeclaration",
    "script"
})
@XmlRootElement(name = "ScriptFragment")
public class ScriptFragment {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ConflictRules")
    protected ConflictRules conflictRules;
    @XmlElement(name = "Declaration")
    protected List<Declaration> declaration;
    @XmlElement(name = "KeyDeclaration")
    protected List<KeyDeclaration> keyDeclaration;
    @XmlElement(name = "Script", required = true)
    protected Object script;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "StartLifeCycle", required = true)
    protected String startLifeCycle;
    @XmlAttribute(name = "EndLifeCycle", required = true)
    protected String endLifeCycle;
    @XmlAttribute(name = "SecureChannel")
    protected SecureChannelProtocol secureChannel;
    @XmlAttribute(name = "SecurityLevel")
    protected SecurityLevel securityLevel;
    @XmlAttribute(name = "Active")
    protected Boolean active;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the conflictRules property.
     * 
     * @return
     *     possible object is
     *     {@link ConflictRules }
     *     
     */
    public ConflictRules getConflictRules() {
        return conflictRules;
    }

    /**
     * Sets the value of the conflictRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConflictRules }
     *     
     */
    public void setConflictRules(ConflictRules value) {
        this.conflictRules = value;
    }

    /**
     * Gets the value of the declaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Declaration }
     * 
     * 
     */
    public List<Declaration> getDeclaration() {
        if (declaration == null) {
            declaration = new ArrayList<Declaration>();
        }
        return this.declaration;
    }

    /**
     * Gets the value of the keyDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyDeclaration }
     * 
     * 
     */
    public List<KeyDeclaration> getKeyDeclaration() {
        if (keyDeclaration == null) {
            keyDeclaration = new ArrayList<KeyDeclaration>();
        }
        return this.keyDeclaration;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setScript(Object value) {
        this.script = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the startLifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLifeCycle() {
        return startLifeCycle;
    }

    /**
     * Sets the value of the startLifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLifeCycle(String value) {
        this.startLifeCycle = value;
    }

    /**
     * Gets the value of the endLifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLifeCycle() {
        return endLifeCycle;
    }

    /**
     * Sets the value of the endLifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLifeCycle(String value) {
        this.endLifeCycle = value;
    }

    /**
     * Gets the value of the secureChannel property.
     * 
     * @return
     *     possible object is
     *     {@link SecureChannelProtocol }
     *     
     */
    public SecureChannelProtocol getSecureChannel() {
        return secureChannel;
    }

    /**
     * Sets the value of the secureChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureChannelProtocol }
     *     
     */
    public void setSecureChannel(SecureChannelProtocol value) {
        this.secureChannel = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityLevel }
     *     
     */
    public SecurityLevel getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityLevel }
     *     
     */
    public void setSecurityLevel(SecurityLevel value) {
        this.securityLevel = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

}
