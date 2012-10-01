
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForegroundColor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForegroundColor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RGB" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}RGB"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForegroundColor", propOrder = {
    "rgb"
})
public class ForegroundColor {

    @XmlElement(name = "RGB", required = true)
    protected RGB rgb;

    /**
     * Gets the value of the rgb property.
     * 
     * @return
     *     possible object is
     *     {@link RGB }
     *     
     */
    public RGB getRGB() {
        return rgb;
    }

    /**
     * Sets the value of the rgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGB }
     *     
     */
    public void setRGB(RGB value) {
        this.rgb = value;
    }

}
