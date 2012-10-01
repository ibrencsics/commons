
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ResourcesAvailable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resourcesAvailable"
})
@XmlRootElement(name = "CardInfo")
public class CardInfo {

    @XmlElement(name = "ResourcesAvailable", required = true)
    protected ResourcesAvailable resourcesAvailable;

    /**
     * Gets the value of the resourcesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcesAvailable }
     *     
     */
    public ResourcesAvailable getResourcesAvailable() {
        return resourcesAvailable;
    }

    /**
     * Sets the value of the resourcesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesAvailable }
     *     
     */
    public void setResourcesAvailable(ResourcesAvailable value) {
        this.resourcesAvailable = value;
    }

}
