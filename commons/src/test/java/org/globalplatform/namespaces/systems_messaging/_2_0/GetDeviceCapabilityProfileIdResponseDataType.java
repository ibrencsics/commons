
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the GetDeviceCapabilityProfileIdRequest message, in case or successful processing of the function
 * 
 * <p>Java class for GetDeviceCapabilityProfileIdResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeviceCapabilityProfileIdResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceCapabilityProfileId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeviceCapabilityProfileIdResponseDataType", propOrder = {
    "deviceCapabilityProfileId"
})
public class GetDeviceCapabilityProfileIdResponseDataType {

    @XmlElement(name = "DeviceCapabilityProfileId", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger deviceCapabilityProfileId;

    /**
     * Gets the value of the deviceCapabilityProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceCapabilityProfileId() {
        return deviceCapabilityProfileId;
    }

    /**
     * Sets the value of the deviceCapabilityProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceCapabilityProfileId(BigInteger value) {
        this.deviceCapabilityProfileId = value;
    }

}
