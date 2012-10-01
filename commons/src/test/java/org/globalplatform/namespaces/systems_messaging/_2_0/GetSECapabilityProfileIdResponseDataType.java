
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the GetSECapabilityProfileIdRequest message, in case or successful processing of the function
 * 
 * <p>Java class for GetSECapabilityProfileIdResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSECapabilityProfileIdResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SECapabilityProfileId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSECapabilityProfileIdResponseDataType", propOrder = {
    "seCapabilityProfileId"
})
public class GetSECapabilityProfileIdResponseDataType {

    @XmlElement(name = "SECapabilityProfileId", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger seCapabilityProfileId;

    /**
     * Gets the value of the seCapabilityProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSECapabilityProfileId() {
        return seCapabilityProfileId;
    }

    /**
     * Sets the value of the seCapabilityProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSECapabilityProfileId(BigInteger value) {
        this.seCapabilityProfileId = value;
    }

}
