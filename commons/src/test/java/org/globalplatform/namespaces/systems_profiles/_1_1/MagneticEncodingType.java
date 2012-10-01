
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagneticEncodingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MagneticEncodingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Side"/>
 *         &lt;element name="PersoData" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}PersoData"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}TrackTypeID"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}WriteLevelStandard"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MagneticEncodingType", propOrder = {
    "side",
    "persoData",
    "trackTypeID",
    "writeLevelStandard"
})
public class MagneticEncodingType {

    @XmlElement(name = "Side", required = true)
    protected String side;
    @XmlElement(name = "PersoData", required = true)
    protected PersoData persoData;
    @XmlElement(name = "TrackTypeID", required = true)
    protected String trackTypeID;
    @XmlElement(name = "WriteLevelStandard", required = true)
    protected String writeLevelStandard;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "description", required = true)
    protected String description;

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the persoData property.
     * 
     * @return
     *     possible object is
     *     {@link PersoData }
     *     
     */
    public PersoData getPersoData() {
        return persoData;
    }

    /**
     * Sets the value of the persoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoData }
     *     
     */
    public void setPersoData(PersoData value) {
        this.persoData = value;
    }

    /**
     * Gets the value of the trackTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackTypeID() {
        return trackTypeID;
    }

    /**
     * Sets the value of the trackTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackTypeID(String value) {
        this.trackTypeID = value;
    }

    /**
     * Gets the value of the writeLevelStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteLevelStandard() {
        return writeLevelStandard;
    }

    /**
     * Sets the value of the writeLevelStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteLevelStandard(String value) {
        this.writeLevelStandard = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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

}
