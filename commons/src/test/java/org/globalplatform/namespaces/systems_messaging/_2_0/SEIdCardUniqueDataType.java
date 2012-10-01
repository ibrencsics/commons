
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Card Unique Date as Secure Element Identifier.
 * 
 * <p>Java class for SEId_CardUniqueDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEId_CardUniqueDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEIdentifierType">
 *       &lt;sequence>
 *         &lt;element name="CardUniqueData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CardUniqueDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEId_CardUniqueDataType", propOrder = {
    "cardUniqueData"
})
public class SEIdCardUniqueDataType
    extends SEIdentifierType
{

    @XmlElement(name = "CardUniqueData", required = true)
    protected String cardUniqueData;

    /**
     * Gets the value of the cardUniqueData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardUniqueData() {
        return cardUniqueData;
    }

    /**
     * Sets the value of the cardUniqueData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardUniqueData(String value) {
        this.cardUniqueData = value;
    }

}
