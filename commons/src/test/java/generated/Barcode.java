
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Barcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Barcode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XPosition" type="{}XPositionType"/>
 *         &lt;element name="YPosition" type="{}YPositionType"/>
 *         &lt;element ref="{}ZPosition"/>
 *         &lt;element ref="{}Side"/>
 *         &lt;element ref="{}AnchorPosition"/>
 *         &lt;element ref="{}DPI"/>
 *         &lt;element ref="{}Type"/>
 *         &lt;element name="PersoData" type="{}PersoData"/>
 *         &lt;element name="Height" type="{}Height"/>
 *         &lt;element ref="{}HumanReadableText"/>
 *         &lt;element ref="{}HumanReadableStartDigit"/>
 *         &lt;element ref="{}HumanReadableCheckDigit"/>
 *         &lt;element name="Font" type="{}Font"/>
 *         &lt;element ref="{}QuietZone"/>
 *         &lt;element ref="{}CheckDigit"/>
 *         &lt;element name="Border" type="{}Border"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Barcode", propOrder = {
    "xPosition",
    "yPosition",
    "zPosition",
    "side",
    "anchorPosition",
    "dpi",
    "type",
    "persoData",
    "height",
    "humanReadableText",
    "humanReadableStartDigit",
    "humanReadableCheckDigit",
    "font",
    "quietZone",
    "checkDigit",
    "border"
})
public class Barcode {

    @XmlElement(name = "XPosition", required = true)
    protected XPositionType xPosition;
    @XmlElement(name = "YPosition", required = true)
    protected YPositionType yPosition;
    @XmlElement(name = "ZPosition")
    protected byte zPosition;
    @XmlElement(name = "Side", required = true)
    protected String side;
    @XmlElement(name = "AnchorPosition", required = true)
    protected String anchorPosition;
    @XmlElement(name = "DPI")
    protected short dpi;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "PersoData", required = true)
    protected PersoData persoData;
    @XmlElement(name = "Height", required = true)
    protected Height height;
    @XmlElement(name = "HumanReadableText")
    protected boolean humanReadableText;
    @XmlElement(name = "HumanReadableStartDigit")
    protected boolean humanReadableStartDigit;
    @XmlElement(name = "HumanReadableCheckDigit")
    protected boolean humanReadableCheckDigit;
    @XmlElement(name = "Font", required = true)
    protected Font font;
    @XmlElement(name = "QuietZone", required = true)
    protected String quietZone;
    @XmlElement(name = "CheckDigit", required = true)
    protected String checkDigit;
    @XmlElement(name = "Border", required = true)
    protected Border border;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "description", required = true)
    protected String description;

    /**
     * Gets the value of the xPosition property.
     * 
     * @return
     *     possible object is
     *     {@link XPositionType }
     *     
     */
    public XPositionType getXPosition() {
        return xPosition;
    }

    /**
     * Sets the value of the xPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPositionType }
     *     
     */
    public void setXPosition(XPositionType value) {
        this.xPosition = value;
    }

    /**
     * Gets the value of the yPosition property.
     * 
     * @return
     *     possible object is
     *     {@link YPositionType }
     *     
     */
    public YPositionType getYPosition() {
        return yPosition;
    }

    /**
     * Sets the value of the yPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link YPositionType }
     *     
     */
    public void setYPosition(YPositionType value) {
        this.yPosition = value;
    }

    /**
     * Gets the value of the zPosition property.
     * 
     */
    public byte getZPosition() {
        return zPosition;
    }

    /**
     * Sets the value of the zPosition property.
     * 
     */
    public void setZPosition(byte value) {
        this.zPosition = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the anchorPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchorPosition() {
        return anchorPosition;
    }

    /**
     * Sets the value of the anchorPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchorPosition(String value) {
        this.anchorPosition = value;
    }

    /**
     * Gets the value of the dpi property.
     * 
     */
    public short getDPI() {
        return dpi;
    }

    /**
     * Sets the value of the dpi property.
     * 
     */
    public void setDPI(short value) {
        this.dpi = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the persoData property.
     * 
     * @return
     *     possible object is
     *     {@link PersoData }
     *     
     */
    public PersoData getPersoData() {
        return persoData;
    }

    /**
     * Sets the value of the persoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoData }
     *     
     */
    public void setPersoData(PersoData value) {
        this.persoData = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setHeight(Height value) {
        this.height = value;
    }

    /**
     * Gets the value of the humanReadableText property.
     * 
     */
    public boolean isHumanReadableText() {
        return humanReadableText;
    }

    /**
     * Sets the value of the humanReadableText property.
     * 
     */
    public void setHumanReadableText(boolean value) {
        this.humanReadableText = value;
    }

    /**
     * Gets the value of the humanReadableStartDigit property.
     * 
     */
    public boolean isHumanReadableStartDigit() {
        return humanReadableStartDigit;
    }

    /**
     * Sets the value of the humanReadableStartDigit property.
     * 
     */
    public void setHumanReadableStartDigit(boolean value) {
        this.humanReadableStartDigit = value;
    }

    /**
     * Gets the value of the humanReadableCheckDigit property.
     * 
     */
    public boolean isHumanReadableCheckDigit() {
        return humanReadableCheckDigit;
    }

    /**
     * Sets the value of the humanReadableCheckDigit property.
     * 
     */
    public void setHumanReadableCheckDigit(boolean value) {
        this.humanReadableCheckDigit = value;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * Gets the value of the quietZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuietZone() {
        return quietZone;
    }

    /**
     * Sets the value of the quietZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuietZone(String value) {
        this.quietZone = value;
    }

    /**
     * Gets the value of the checkDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDigit() {
        return checkDigit;
    }

    /**
     * Sets the value of the checkDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDigit(String value) {
        this.checkDigit = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link Border }
     *     
     */
    public Border getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link Border }
     *     
     */
    public void setBorder(Border value) {
        this.border = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
