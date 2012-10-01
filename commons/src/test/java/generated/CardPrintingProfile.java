
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CardDesignOrientation"/>
 *         &lt;element ref="{}CardDesignOrigin"/>
 *         &lt;element ref="{}ConfigurationID" minOccurs="0"/>
 *         &lt;element ref="{}CardStockID" minOccurs="0"/>
 *         &lt;element ref="{}PersonalizationOrderConstraint" maxOccurs="unbounded"/>
 *         &lt;element name="Emboss" type="{}Emboss" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Label" type="{}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MagneticEncoding" type="{}MagneticEncodingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Overlay" type="{}Overlay" minOccurs="0"/>
 *         &lt;element name="Barcode" type="{}Barcode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Text" type="{}Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Image" type="{}Image" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardDesignOrientation",
    "cardDesignOrigin",
    "configurationID",
    "cardStockID",
    "personalizationOrderConstraint",
    "emboss",
    "label",
    "magneticEncoding",
    "overlay",
    "barcode",
    "text",
    "image"
})
@XmlRootElement(name = "CardPrintingProfile")
public class CardPrintingProfile {

    @XmlElement(name = "CardDesignOrientation", required = true)
    protected String cardDesignOrientation;
    @XmlElement(name = "CardDesignOrigin", required = true)
    protected String cardDesignOrigin;
    @XmlElement(name = "ConfigurationID")
    protected String configurationID;
    @XmlElement(name = "CardStockID")
    protected String cardStockID;
    @XmlElement(name = "PersonalizationOrderConstraint", required = true)
    protected List<String> personalizationOrderConstraint;
    @XmlElement(name = "Emboss")
    protected List<Emboss> emboss;
    @XmlElement(name = "Label")
    protected List<Label> label;
    @XmlElement(name = "MagneticEncoding")
    protected List<MagneticEncodingType> magneticEncoding;
    @XmlElement(name = "Overlay")
    protected Overlay overlay;
    @XmlElement(name = "Barcode")
    protected List<Barcode> barcode;
    @XmlElement(name = "Text")
    protected List<Text> text;
    @XmlElement(name = "Image")
    protected List<Image> image;

    /**
     * Gets the value of the cardDesignOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDesignOrientation() {
        return cardDesignOrientation;
    }

    /**
     * Sets the value of the cardDesignOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDesignOrientation(String value) {
        this.cardDesignOrientation = value;
    }

    /**
     * Gets the value of the cardDesignOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDesignOrigin() {
        return cardDesignOrigin;
    }

    /**
     * Sets the value of the cardDesignOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDesignOrigin(String value) {
        this.cardDesignOrigin = value;
    }

    /**
     * Gets the value of the configurationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationID() {
        return configurationID;
    }

    /**
     * Sets the value of the configurationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationID(String value) {
        this.configurationID = value;
    }

    /**
     * Gets the value of the cardStockID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStockID() {
        return cardStockID;
    }

    /**
     * Sets the value of the cardStockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStockID(String value) {
        this.cardStockID = value;
    }

    /**
     * Gets the value of the personalizationOrderConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalizationOrderConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalizationOrderConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPersonalizationOrderConstraint() {
        if (personalizationOrderConstraint == null) {
            personalizationOrderConstraint = new ArrayList<String>();
        }
        return this.personalizationOrderConstraint;
    }

    /**
     * Gets the value of the emboss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emboss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmboss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Emboss }
     * 
     * 
     */
    public List<Emboss> getEmboss() {
        if (emboss == null) {
            emboss = new ArrayList<Emboss>();
        }
        return this.emboss;
    }

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * 
     * 
     */
    public List<Label> getLabel() {
        if (label == null) {
            label = new ArrayList<Label>();
        }
        return this.label;
    }

    /**
     * Gets the value of the magneticEncoding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magneticEncoding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagneticEncoding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MagneticEncodingType }
     * 
     * 
     */
    public List<MagneticEncodingType> getMagneticEncoding() {
        if (magneticEncoding == null) {
            magneticEncoding = new ArrayList<MagneticEncodingType>();
        }
        return this.magneticEncoding;
    }

    /**
     * Gets the value of the overlay property.
     * 
     * @return
     *     possible object is
     *     {@link Overlay }
     *     
     */
    public Overlay getOverlay() {
        return overlay;
    }

    /**
     * Sets the value of the overlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overlay }
     *     
     */
    public void setOverlay(Overlay value) {
        this.overlay = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barcode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarcode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Barcode }
     * 
     * 
     */
    public List<Barcode> getBarcode() {
        if (barcode == null) {
            barcode = new ArrayList<Barcode>();
        }
        return this.barcode;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * 
     * 
     */
    public List<Text> getText() {
        if (text == null) {
            text = new ArrayList<Text>();
        }
        return this.text;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Image }
     * 
     * 
     */
    public List<Image> getImage() {
        if (image == null) {
            image = new ArrayList<Image>();
        }
        return this.image;
    }

}
