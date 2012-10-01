
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.globalplatform.namespaces.systems_profiles._1_1.LoadFileProfile;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}LoadFileProfile"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ProfileIdentification"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UniqueID" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}uniqueID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loadFileProfile",
    "profileIdentification"
})
@XmlRootElement(name = "LFP")
public class LFP {

    @XmlElement(name = "LoadFileProfile", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.1", required = true)
    protected LoadFileProfile loadFileProfile;
    @XmlElement(name = "ProfileIdentification", required = true)
    protected ProfileIdentification profileIdentification;
    @XmlAttribute(name = "UniqueID", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] uniqueID;

    /**
     * Gets the value of the loadFileProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LoadFileProfile }
     *     
     */
    public LoadFileProfile getLoadFileProfile() {
        return loadFileProfile;
    }

    /**
     * Sets the value of the loadFileProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadFileProfile }
     *     
     */
    public void setLoadFileProfile(LoadFileProfile value) {
        this.loadFileProfile = value;
    }

    /**
     * Gets the value of the profileIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileIdentification }
     *     
     */
    public ProfileIdentification getProfileIdentification() {
        return profileIdentification;
    }

    /**
     * Sets the value of the profileIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileIdentification }
     *     
     */
    public void setProfileIdentification(ProfileIdentification value) {
        this.profileIdentification = value;
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

}
