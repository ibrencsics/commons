
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.globalplatform.namespaces.systems_profiles._1_1.ApplicationProfile;


/**
 * Response containing the Application Profile
 * 
 * <p>Java class for DIAD_GetAppProfileResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_GetAppProfileResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="AppProfileResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ApplicationProfile"/>
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
@XmlType(name = "DIAD_GetAppProfileResponseType", propOrder = {
    "appProfileResponse"
})
public class DIADGetAppProfileResponseType
    extends BasicResponseType
{

    @XmlElement(name = "AppProfileResponse", required = true)
    protected DIADGetAppProfileResponseType.AppProfileResponse appProfileResponse;

    /**
     * Gets the value of the appProfileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DIADGetAppProfileResponseType.AppProfileResponse }
     *     
     */
    public DIADGetAppProfileResponseType.AppProfileResponse getAppProfileResponse() {
        return appProfileResponse;
    }

    /**
     * Sets the value of the appProfileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADGetAppProfileResponseType.AppProfileResponse }
     *     
     */
    public void setAppProfileResponse(DIADGetAppProfileResponseType.AppProfileResponse value) {
        this.appProfileResponse = value;
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
     *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ApplicationProfile"/>
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
        "applicationProfile"
    })
    public static class AppProfileResponse {

        @XmlElement(name = "ApplicationProfile", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.1", required = true)
        protected ApplicationProfile applicationProfile;

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

    }

}
