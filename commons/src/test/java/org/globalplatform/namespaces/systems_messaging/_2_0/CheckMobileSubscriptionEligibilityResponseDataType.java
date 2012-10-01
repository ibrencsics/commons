
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the CheckMobileSubscriptionEligibilityRequest message, in case or successful processing of the function
 * 
 * <p>Java class for CheckMobileSubscriptionEligibilityResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckMobileSubscriptionEligibilityResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Eligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NonEligibilityReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckMobileSubscriptionEligibilityResponseDataType", propOrder = {
    "eligible",
    "nonEligibilityReason"
})
public class CheckMobileSubscriptionEligibilityResponseDataType {

    @XmlElement(name = "Eligible")
    protected boolean eligible;
    @XmlElement(name = "NonEligibilityReason")
    protected BigInteger nonEligibilityReason;

    /**
     * Gets the value of the eligible property.
     * 
     */
    public boolean isEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     */
    public void setEligible(boolean value) {
        this.eligible = value;
    }

    /**
     * Gets the value of the nonEligibilityReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonEligibilityReason() {
        return nonEligibilityReason;
    }

    /**
     * Sets the value of the nonEligibilityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonEligibilityReason(BigInteger value) {
        this.nonEligibilityReason = value;
    }

}
