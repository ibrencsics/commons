
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ModuleIdentifierCode"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}GenericModule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ModulesCommonData" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeliveryModule" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BatchID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BatchID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "moduleIdentifierCode",
    "genericModule",
    "modulesCommonData",
    "deliveryModule"
})
@XmlRootElement(name = "CardCustomization")
public class CardCustomization {

    @XmlElement(name = "ModuleIdentifierCode", required = true)
    protected ModuleIdentifierCode moduleIdentifierCode;
    @XmlElement(name = "GenericModule")
    protected List<GenericModule> genericModule;
    @XmlElement(name = "ModulesCommonData")
    protected ModulesCommonData modulesCommonData;
    @XmlElement(name = "DeliveryModule")
    protected DeliveryModule deliveryModule;
    @XmlAttribute(name = "BatchID")
    protected String batchID;

    /**
     * Gets the value of the moduleIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleIdentifierCode }
     *     
     */
    public ModuleIdentifierCode getModuleIdentifierCode() {
        return moduleIdentifierCode;
    }

    /**
     * Sets the value of the moduleIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleIdentifierCode }
     *     
     */
    public void setModuleIdentifierCode(ModuleIdentifierCode value) {
        this.moduleIdentifierCode = value;
    }

    /**
     * Renamed for version 2.0.0 to avoid naming conflict: Module --> GenericModule Gets the value of the genericModule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericModule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericModule }
     * 
     * 
     */
    public List<GenericModule> getGenericModule() {
        if (genericModule == null) {
            genericModule = new ArrayList<GenericModule>();
        }
        return this.genericModule;
    }

    /**
     * Gets the value of the modulesCommonData property.
     * 
     * @return
     *     possible object is
     *     {@link ModulesCommonData }
     *     
     */
    public ModulesCommonData getModulesCommonData() {
        return modulesCommonData;
    }

    /**
     * Sets the value of the modulesCommonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModulesCommonData }
     *     
     */
    public void setModulesCommonData(ModulesCommonData value) {
        this.modulesCommonData = value;
    }

    /**
     * Gets the value of the deliveryModule property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryModule }
     *     
     */
    public DeliveryModule getDeliveryModule() {
        return deliveryModule;
    }

    /**
     * Sets the value of the deliveryModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryModule }
     *     
     */
    public void setDeliveryModule(DeliveryModule value) {
        this.deliveryModule = value;
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

}
