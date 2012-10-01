
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RGB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Red"/>
 *         &lt;element ref="{}Green"/>
 *         &lt;element ref="{}Blue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGB", propOrder = {
    "red",
    "green",
    "blue"
})
public class RGB {

    @XmlElement(name = "Red")
    protected short red;
    @XmlElement(name = "Green")
    protected short green;
    @XmlElement(name = "Blue")
    protected short blue;

    /**
     * Gets the value of the red property.
     * 
     */
    public short getRed() {
        return red;
    }

    /**
     * Sets the value of the red property.
     * 
     */
    public void setRed(short value) {
        this.red = value;
    }

    /**
     * Gets the value of the green property.
     * 
     */
    public short getGreen() {
        return green;
    }

    /**
     * Sets the value of the green property.
     * 
     */
    public void setGreen(short value) {
        this.green = value;
    }

    /**
     * Gets the value of the blue property.
     * 
     */
    public short getBlue() {
        return blue;
    }

    /**
     * Sets the value of the blue property.
     * 
     */
    public void setBlue(short value) {
        this.blue = value;
    }

}
