
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Border complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Border">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Width" type="{}Width"/>
 *         &lt;element ref="{}LineStyle"/>
 *         &lt;element name="RoundCorner" type="{}RoundCorner" minOccurs="0"/>
 *         &lt;element name="CornerStyle" type="{}CornerStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Border", propOrder = {
    "width",
    "lineStyle",
    "roundCorner",
    "cornerStyle"
})
public class Border {

    @XmlElement(name = "Width", required = true)
    protected Width width;
    @XmlElement(name = "LineStyle", required = true)
    protected String lineStyle;
    @XmlElement(name = "RoundCorner")
    protected RoundCorner roundCorner;
    @XmlElement(name = "CornerStyle")
    protected CornerStyle cornerStyle;

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Width }
     *     
     */
    public Width getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Width }
     *     
     */
    public void setWidth(Width value) {
        this.width = value;
    }

    /**
     * Gets the value of the lineStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineStyle() {
        return lineStyle;
    }

    /**
     * Sets the value of the lineStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineStyle(String value) {
        this.lineStyle = value;
    }

    /**
     * Gets the value of the roundCorner property.
     * 
     * @return
     *     possible object is
     *     {@link RoundCorner }
     *     
     */
    public RoundCorner getRoundCorner() {
        return roundCorner;
    }

    /**
     * Sets the value of the roundCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundCorner }
     *     
     */
    public void setRoundCorner(RoundCorner value) {
        this.roundCorner = value;
    }

    /**
     * Gets the value of the cornerStyle property.
     * 
     * @return
     *     possible object is
     *     {@link CornerStyle }
     *     
     */
    public CornerStyle getCornerStyle() {
        return cornerStyle;
    }

    /**
     * Sets the value of the cornerStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CornerStyle }
     *     
     */
    public void setCornerStyle(CornerStyle value) {
        this.cornerStyle = value;
    }

}
