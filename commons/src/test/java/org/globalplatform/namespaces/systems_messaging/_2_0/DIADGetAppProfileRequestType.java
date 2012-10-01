
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.globalplatform.namespaces.systems_profiles._1_1.CardProfile;


/**
 * Request for Application Profile based on Card Profile and Service ID
 * 
 * <p>Java class for DIAD_GetAppProfileRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_GetAppProfileRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="AppProfileRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}CardProfile"/>
 *                   &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ServiceId"/>
 *                   &lt;element name="ServiceProvider" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ServiceProviderId"/>
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
@XmlType(name = "DIAD_GetAppProfileRequestType", propOrder = {
    "appProfileRequest"
})
public class DIADGetAppProfileRequestType
    extends BasicRequestType
{

    @XmlElement(name = "AppProfileRequest", required = true)
    protected DIADGetAppProfileRequestType.AppProfileRequest appProfileRequest;

    /**
     * Gets the value of the appProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DIADGetAppProfileRequestType.AppProfileRequest }
     *     
     */
    public DIADGetAppProfileRequestType.AppProfileRequest getAppProfileRequest() {
        return appProfileRequest;
    }

    /**
     * Sets the value of the appProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADGetAppProfileRequestType.AppProfileRequest }
     *     
     */
    public void setAppProfileRequest(DIADGetAppProfileRequestType.AppProfileRequest value) {
        this.appProfileRequest = value;
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
     *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}CardProfile"/>
     *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ServiceId"/>
     *         &lt;element name="ServiceProvider" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ServiceProviderId"/>
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
        "cardProfile",
        "service",
        "serviceProvider"
    })
    public static class AppProfileRequest {

        @XmlElement(name = "CardProfile", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.1", required = true)
        protected CardProfile cardProfile;
        @XmlElement(name = "Service", required = true)
        protected DIADServiceId service;
        @XmlElement(name = "ServiceProvider", required = true)
        protected DIADServiceProviderId serviceProvider;

        /**
         * Gets the value of the cardProfile property.
         * 
         * @return
         *     possible object is
         *     {@link CardProfile }
         *     
         */
        public CardProfile getCardProfile() {
            return cardProfile;
        }

        /**
         * Sets the value of the cardProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link CardProfile }
         *     
         */
        public void setCardProfile(CardProfile value) {
            this.cardProfile = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link DIADServiceId }
         *     
         */
        public DIADServiceId getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIADServiceId }
         *     
         */
        public void setService(DIADServiceId value) {
            this.service = value;
        }

        /**
         * Gets the value of the serviceProvider property.
         * 
         * @return
         *     possible object is
         *     {@link DIADServiceProviderId }
         *     
         */
        public DIADServiceProviderId getServiceProvider() {
            return serviceProvider;
        }

        /**
         * Sets the value of the serviceProvider property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIADServiceProviderId }
         *     
         */
        public void setServiceProvider(DIADServiceProviderId value) {
            this.serviceProvider = value;
        }

    }

}
