
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional information that qualifies the mobile-NFC service.
 * For instance, it may be used when a service is multi-instantiated, to uniquely identify the particular instance that is under installation, and later, for post-delivery actions, to identify the particular instance that is to be locked, unlocked, or deleted.
 * 
 * <p>Java class for ServiceQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceQualifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Extensions" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ExtensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceQualifierType", propOrder = {
    "qualifier",
    "extensions"
})
public class ServiceQualifierType {

    @XmlElement(name = "Qualifier", required = true)
    protected String qualifier;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsType> extensions;

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsType }
     * 
     * 
     */
    public List<ExtensionsType> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionsType>();
        }
        return this.extensions;
    }

}
