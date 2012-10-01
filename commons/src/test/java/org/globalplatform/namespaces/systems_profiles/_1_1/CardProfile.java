
package org.globalplatform.namespaces.systems_profiles._1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Description" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}Revisions"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}CardManufacturerProduct"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ConflictRules"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}LoadFileInstances"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ApplicationInstances"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}CardInfo"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UniqueID" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}uniqueID" />
 *       &lt;attribute name="ProfileVersion" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}version" />
 *       &lt;attribute name="ErrataVersion" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "revisions",
    "cardManufacturerProduct",
    "conflictRules",
    "loadFileInstances",
    "applicationInstances",
    "cardInfo"
})
@XmlRootElement(name = "CardProfile")
public class CardProfile {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Revisions", required = true)
    protected Revisions revisions;
    @XmlElement(name = "CardManufacturerProduct", required = true)
    protected CardManufacturerProduct cardManufacturerProduct;
    @XmlElement(name = "ConflictRules", required = true)
    protected ConflictRules conflictRules;
    @XmlElement(name = "LoadFileInstances", required = true)
    protected LoadFileInstances loadFileInstances;
    @XmlElement(name = "ApplicationInstances", required = true)
    protected ApplicationInstances applicationInstances;
    @XmlElement(name = "CardInfo", required = true)
    protected CardInfo cardInfo;
    @XmlAttribute(name = "UniqueID", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] uniqueID;
    @XmlAttribute(name = "ProfileVersion", required = true)
    protected String profileVersion;
    @XmlAttribute(name = "ErrataVersion")
    protected BigInteger errataVersion;

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
     * Gets the value of the revisions property.
     * 
     * @return
     *     possible object is
     *     {@link Revisions }
     *     
     */
    public Revisions getRevisions() {
        return revisions;
    }

    /**
     * Sets the value of the revisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revisions }
     *     
     */
    public void setRevisions(Revisions value) {
        this.revisions = value;
    }

    /**
     * Gets the value of the cardManufacturerProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CardManufacturerProduct }
     *     
     */
    public CardManufacturerProduct getCardManufacturerProduct() {
        return cardManufacturerProduct;
    }

    /**
     * Sets the value of the cardManufacturerProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardManufacturerProduct }
     *     
     */
    public void setCardManufacturerProduct(CardManufacturerProduct value) {
        this.cardManufacturerProduct = value;
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
     * Gets the value of the loadFileInstances property.
     * 
     * @return
     *     possible object is
     *     {@link LoadFileInstances }
     *     
     */
    public LoadFileInstances getLoadFileInstances() {
        return loadFileInstances;
    }

    /**
     * Sets the value of the loadFileInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadFileInstances }
     *     
     */
    public void setLoadFileInstances(LoadFileInstances value) {
        this.loadFileInstances = value;
    }

    /**
     * Gets the value of the applicationInstances property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInstances }
     *     
     */
    public ApplicationInstances getApplicationInstances() {
        return applicationInstances;
    }

    /**
     * Sets the value of the applicationInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInstances }
     *     
     */
    public void setApplicationInstances(ApplicationInstances value) {
        this.applicationInstances = value;
    }

    /**
     * Gets the value of the cardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfo }
     *     
     */
    public CardInfo getCardInfo() {
        return cardInfo;
    }

    /**
     * Sets the value of the cardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfo }
     *     
     */
    public void setCardInfo(CardInfo value) {
        this.cardInfo = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueID(byte[] value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileVersion(String value) {
        this.profileVersion = value;
    }

    /**
     * Gets the value of the errataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrataVersion() {
        return errataVersion;
    }

    /**
     * Sets the value of the errataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrataVersion(BigInteger value) {
        this.errataVersion = value;
    }

}
