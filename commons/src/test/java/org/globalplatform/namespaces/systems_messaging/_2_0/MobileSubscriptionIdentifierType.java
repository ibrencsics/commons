
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Mobile Subscription identifier. A Mobile Subscription can for example be identified either by a MSISDN or an Alias for a particular MNO, but it can be extended to other type of identifier.
 * 
 * <p>Java class for MobileSubscriptionIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileSubscriptionIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MNOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileSubscriptionIdentifierType", propOrder = {
    "mnoName"
})
@XmlSeeAlso({
    MSIdAliasType.class,
    MSIdMSISDNType.class,
    MSIdGenericType.class,
    MSIdExtendableType.class
})
public abstract class MobileSubscriptionIdentifierType {

    @XmlElement(name = "MNOName")
    protected String mnoName;

    /**
     * Gets the value of the mnoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNOName() {
        return mnoName;
    }

    /**
     * Sets the value of the mnoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNOName(String value) {
        this.mnoName = value;
    }

}
