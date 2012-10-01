
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This SE Command requests the creation of the first keyset of a Supplementary Security Domain in "Basic" mode.
 * 
 * <p>Java class for Basic_CreateFirstSSDKeysetCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Basic_CreateFirstSSDKeysetCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CreateFirstSSDKeysetCommandType">
 *       &lt;sequence>
 *         &lt;element name="KeySet" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}KeySetType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Basic_CreateFirstSSDKeysetCommandType", propOrder = {
    "keySet"
})
public class BasicCreateFirstSSDKeysetCommandType
    extends CreateFirstSSDKeysetCommandType
{

    @XmlElement(name = "KeySet", required = true)
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
