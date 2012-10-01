
package org.globalplatform.namespaces.systems_profiles._1_1;

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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}CardManufacturer"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Chip"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Platform"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}version" />
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
    "cardManufacturer",
    "chip",
    "platform"
})
@XmlRootElement(name = "CardManufacturerProduct")
public class CardManufacturerProduct {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CardManufacturer", required = true)
    protected CardManufacturer cardManufacturer;
    @XmlElement(name = "Chip", required = true)
    protected Chip chip;
    @XmlElement(name = "Platform", required = true)
    protected Platform platform;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

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
     * Gets the value of the cardManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link CardManufacturer }
     *     
     */
    public CardManufacturer getCardManufacturer() {
        return cardManufacturer;
    }

    /**
     * Sets the value of the cardManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardManufacturer }
     *     
     */
    public void setCardManufacturer(CardManufacturer value) {
        this.cardManufacturer = value;
    }

    /**
     * Gets the value of the chip property.
     * 
     * @return
     *     possible object is
     *     {@link Chip }
     *     
     */
    public Chip getChip() {
        return chip;
    }

    /**
     * Sets the value of the chip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chip }
     *     
     */
    public void setChip(Chip value) {
        this.chip = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link Platform }
     *     
     */
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platform }
     *     
     */
    public void setPlatform(Platform value) {
        this.platform = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
