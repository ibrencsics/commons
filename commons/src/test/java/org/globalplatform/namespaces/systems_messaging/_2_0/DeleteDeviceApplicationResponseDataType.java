
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the DeleteDeviceApplicationRequest message, in case or successful processing of the function
 * 
 * <p>Java class for DeleteDeviceApplicationResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteDeviceApplicationResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsedDeletionMode" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeviceDeletionModeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteDeviceApplicationResponseDataType", propOrder = {
    "usedDeletionMode"
})
public class DeleteDeviceApplicationResponseDataType {

    @XmlElement(name = "UsedDeletionMode", required = true)
    protected DeviceDeletionModeType usedDeletionMode;

    /**
     * Gets the value of the usedDeletionMode property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDeletionModeType }
     *     
     */
    public DeviceDeletionModeType getUsedDeletionMode() {
        return usedDeletionMode;
    }

    /**
     * Sets the value of the usedDeletionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDeletionModeType }
     *     
     */
    public void setUsedDeletionMode(DeviceDeletionModeType value) {
        this.usedDeletionMode = value;
    }

}
