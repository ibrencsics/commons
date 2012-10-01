
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The requested operation has been completed
 * 
 * <p>Java class for DIAD_RequestServiceCompletedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_RequestServiceCompletedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="Service">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ServiceId"/>
 *                   &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_SecureElementId"/>
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
@XmlType(name = "DIAD_RequestServiceCompletedType", propOrder = {
    "service"
})
public class DIADRequestServiceCompletedType
    extends BasicRequestType
{

    @XmlElement(name = "Service", required = true)
    protected DIADRequestServiceCompletedType.Service service;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link DIADRequestServiceCompletedType.Service }
     *     
     */
    public DIADRequestServiceCompletedType.Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADRequestServiceCompletedType.Service }
     *     
     */
    public void setService(DIADRequestServiceCompletedType.Service value) {
        this.service = value;
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
     *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ServiceId"/>
     *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_SecureElementId"/>
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
        "service",
        "secureElement"
    })
    public static class Service {

        @XmlElement(name = "Service", required = true)
        protected DIADServiceId service;
        @XmlElement(name = "SecureElement", required = true)
        protected DIADSecureElementId secureElement;

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
         * Gets the value of the secureElement property.
         * 
         * @return
         *     possible object is
         *     {@link DIADSecureElementId }
         *     
         */
        public DIADSecureElementId getSecureElement() {
            return secureElement;
        }

        /**
         * Sets the value of the secureElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIADSecureElementId }
         *     
         */
        public void setSecureElement(DIADSecureElementId value) {
            this.secureElement = value;
        }

    }

}
