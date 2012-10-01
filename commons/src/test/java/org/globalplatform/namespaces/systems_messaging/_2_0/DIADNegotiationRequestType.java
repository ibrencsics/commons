
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.globalplatform.namespaces.systems_profiles._1_1.ApplicationProfile;


/**
 * Requests for installation conditions from SEI
 * 
 * <p>Java class for DIAD_NegotiationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_NegotiationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="NegotiationRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CardProfileUID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}uniqueID"/>
 *                   &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ApplicationProfile"/>
 *                   &lt;element name="SP_Requirements">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DAP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="SSD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "DIAD_NegotiationRequestType", propOrder = {
    "negotiationRequest"
})
public class DIADNegotiationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "NegotiationRequest", required = true)
    protected DIADNegotiationRequestType.NegotiationRequest negotiationRequest;

    /**
     * Gets the value of the negotiationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DIADNegotiationRequestType.NegotiationRequest }
     *     
     */
    public DIADNegotiationRequestType.NegotiationRequest getNegotiationRequest() {
        return negotiationRequest;
    }

    /**
     * Sets the value of the negotiationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADNegotiationRequestType.NegotiationRequest }
     *     
     */
    public void setNegotiationRequest(DIADNegotiationRequestType.NegotiationRequest value) {
        this.negotiationRequest = value;
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
     *         &lt;element name="CardProfileUID" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}uniqueID"/>
     *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ApplicationProfile"/>
     *         &lt;element name="SP_Requirements">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DAP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="SSD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "cardProfileUID",
        "applicationProfile",
        "spRequirements"
    })
    public static class NegotiationRequest {

        @XmlElement(name = "CardProfileUID", required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] cardProfileUID;
        @XmlElement(name = "ApplicationProfile", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.1", required = true)
        protected ApplicationProfile applicationProfile;
        @XmlElement(name = "SP_Requirements", required = true)
        protected DIADNegotiationRequestType.NegotiationRequest.SPRequirements spRequirements;

        /**
         * Gets the value of the cardProfileUID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getCardProfileUID() {
            return cardProfileUID;
        }

        /**
         * Sets the value of the cardProfileUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardProfileUID(byte[] value) {
            this.cardProfileUID = value;
        }

        /**
         * Gets the value of the applicationProfile property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationProfile }
         *     
         */
        public ApplicationProfile getApplicationProfile() {
            return applicationProfile;
        }

        /**
         * Sets the value of the applicationProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationProfile }
         *     
         */
        public void setApplicationProfile(ApplicationProfile value) {
            this.applicationProfile = value;
        }

        /**
         * Gets the value of the spRequirements property.
         * 
         * @return
         *     possible object is
         *     {@link DIADNegotiationRequestType.NegotiationRequest.SPRequirements }
         *     
         */
        public DIADNegotiationRequestType.NegotiationRequest.SPRequirements getSPRequirements() {
            return spRequirements;
        }

        /**
         * Sets the value of the spRequirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIADNegotiationRequestType.NegotiationRequest.SPRequirements }
         *     
         */
        public void setSPRequirements(DIADNegotiationRequestType.NegotiationRequest.SPRequirements value) {
            this.spRequirements = value;
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
         *         &lt;element name="DAP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="SSD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "dap",
            "ssd"
        })
        public static class SPRequirements {

            @XmlElement(name = "DAP")
            protected boolean dap;
            @XmlElement(name = "SSD")
            protected boolean ssd;

            /**
             * Gets the value of the dap property.
             * 
             */
            public boolean isDAP() {
                return dap;
            }

            /**
             * Sets the value of the dap property.
             * 
             */
            public void setDAP(boolean value) {
                this.dap = value;
            }

            /**
             * Gets the value of the ssd property.
             * 
             */
            public boolean isSSD() {
                return ssd;
            }

            /**
             * Sets the value of the ssd property.
             * 
             */
            public void setSSD(boolean value) {
                this.ssd = value;
            }

        }

    }

}
