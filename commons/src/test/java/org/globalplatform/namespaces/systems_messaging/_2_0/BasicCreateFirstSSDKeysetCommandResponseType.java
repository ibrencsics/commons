
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The response to the Basic_CreateFirstSSDKeysetCommandRequest SE Command
 * 
 * <p>Java class for Basic_CreateFirstSSDKeysetCommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Basic_CreateFirstSSDKeysetCommandResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CreateFirstSSDKeysetCommandResponseType">
 *       &lt;sequence>
 *         &lt;element name="keySet" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}KeySetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Basic_CreateFirstSSDKeysetCommandResponseType", propOrder = {
    "keySet"
})
public class BasicCreateFirstSSDKeysetCommandResponseType
    extends CreateFirstSSDKeysetCommandResponseType
{

    protected KeySetType keySet;

    /**
     * Gets the value of the keySet property.
     * 
     * @return
     *     possible object is
     *     {@link KeySetType }
     *     
     */
    public KeySetType getKeySet() {
        return keySet;
    }

    /**
     * Sets the value of the keySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeySetType }
     *     
     */
    public void setKeySet(KeySetType value) {
        this.keySet = value;
    }

}
