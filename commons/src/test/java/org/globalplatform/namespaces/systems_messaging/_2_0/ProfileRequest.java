
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ProfileIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}profileType" />
 *       &lt;attribute name="ProfileUniqueID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}uniqueID" />
 *       &lt;attribute name="ProfileVersion" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}version" />
 *       &lt;attribute name="AssociateProfiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profileIdentification"
})
@XmlRootElement(name = "ProfileRequest")
public class ProfileRequest {

    @XmlElement(name = "ProfileIdentification")
    protected List<ProfileIdentification> profileIdentification;
    @XmlAttribute(name = "type", required = true)
    protected ProfileType type;
    @XmlAttribute(name = "ProfileUniqueID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] profileUniqueID;
    @XmlAttribute(name = "ProfileVersion")
    protected String profileVersion;
    @XmlAttribute(name = "AssociateProfiles")
    protected Boolean associateProfiles;

    /**
     * Gets the value of the profileIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileIdentification }
     * 
     * 
     */
    public List<ProfileIdentification> getProfileIdentification() {
        if (profileIdentification == null) {
            profileIdentification = new ArrayList<ProfileIdentification>();
        }
        return this.profileIdentification;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileType }
     *     
     */
    public ProfileType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType }
     *     
     */
    public void setType(ProfileType value) {
        this.type = value;
    }

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
     * Gets the value of the associateProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssociateProfiles() {
        if (associateProfiles == null) {
            return false;
        } else {
            return associateProfiles;
        }
    }

    /**
     * Sets the value of the associateProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssociateProfiles(Boolean value) {
        this.associateProfiles = value;
    }

}
