
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Response to the GetSECapabilityProfileRequest message
 * 
 * <p>Java class for DIAD_GetSECapabilityProfileResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_GetSECapabilityProfileResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="CardProfile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Status">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="OK"/>
 *                         &lt;enumeration value="NEXT_ACTION"/>
 *                         &lt;enumeration value="UNKNOWN_CARD_TYPE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NextAction" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *                   &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}CardProfile" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIAD_GetSECapabilityProfileResponseType", propOrder = {
    "cardProfile"
})
public class DIADGetSECapabilityProfileResponseType
    extends BasicResponseType
{

    @XmlElement(name = "CardProfile")
    protected DIADGetSECapabilityProfileResponseType.CardProfile cardProfile;

    /**
     * Gets the value of the cardProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DIADGetSECapabilityProfileResponseType.CardProfile }
     *     
     */
    public DIADGetSECapabilityProfileResponseType.CardProfile getCardProfile() {
        return cardProfile;
    }

    /**
     * Sets the value of the cardProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADGetSECapabilityProfileResponseType.CardProfile }
     *     
     */
    public void setCardProfile(DIADGetSECapabilityProfileResponseType.CardProfile value) {
        this.cardProfile = value;
    }


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
     *         &lt;element name="Status">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="OK"/>
     *               &lt;enumeration value="NEXT_ACTION"/>
     *               &lt;enumeration value="UNKNOWN_CARD_TYPE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NextAction" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
     *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}CardProfile" minOccurs="0"/>
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
        "status",
        "nextAction",
        "profileId",
        "cardProfile"
    })
    public static class CardProfile {

        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "NextAction", type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] nextAction;
        @XmlElement(name = "ProfileId")
        protected Object profileId;
        @XmlElement(name = "CardProfile", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.1")
        protected org.globalplatform.namespaces.systems_profiles._1_1.CardProfile cardProfile;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the nextAction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getNextAction() {
            return nextAction;
        }

        /**
         * Sets the value of the nextAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextAction(byte[] value) {
            this.nextAction = value;
        }

        /**
         * Gets the value of the profileId property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getProfileId() {
            return profileId;
        }

        /**
         * Sets the value of the profileId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setProfileId(Object value) {
            this.profileId = value;
        }

        /**
         * Gets the value of the cardProfile property.
         * 
         * @return
         *     possible object is
         *     {@link org.globalplatform.namespaces.systems_profiles._1_1.CardProfile }
         *     
         */
        public org.globalplatform.namespaces.systems_profiles._1_1.CardProfile getCardProfile() {
            return cardProfile;
        }

        /**
         * Sets the value of the cardProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link org.globalplatform.namespaces.systems_profiles._1_1.CardProfile }
         *     
         */
        public void setCardProfile(org.globalplatform.namespaces.systems_profiles._1_1.CardProfile value) {
            this.cardProfile = value;
        }

    }

}
