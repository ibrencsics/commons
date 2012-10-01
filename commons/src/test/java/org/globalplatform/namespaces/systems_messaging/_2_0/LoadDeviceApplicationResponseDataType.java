
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the LoadDeviceApplicationRequest message, in case or successful processing of the function
 * 
 * <p>Java class for LoadDeviceApplicationResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadDeviceApplicationResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsedInstallationMode" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeviceInstallationModeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadDeviceApplicationResponseDataType", propOrder = {
    "usedInstallationMode"
})
public class LoadDeviceApplicationResponseDataType {

    @XmlElement(name = "UsedInstallationMode", required = true)
    protected DeviceInstallationModeType usedInstallationMode;

    /**
     * Gets the value of the usedInstallationMode property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInstallationModeType }
     *     
     */
    public DeviceInstallationModeType getUsedInstallationMode() {
        return usedInstallationMode;
    }

    /**
     * Sets the value of the usedInstallationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInstallationModeType }
     *     
     */
    public void setUsedInstallationMode(DeviceInstallationModeType value) {
        this.usedInstallationMode = value;
    }

}
