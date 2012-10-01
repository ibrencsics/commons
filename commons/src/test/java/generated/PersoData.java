
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PersoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersoData">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>PersoDataSimple">
 *       &lt;attribute name="field" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersoData", propOrder = {
    "value"
})
public class PersoData {

    @XmlValue
    protected PersoDataSimple value;
    @XmlAttribute(name = "field")
    protected Boolean field;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link PersoDataSimple }
     *     
     */
    public PersoDataSimple getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoDataSimple }
     *     
     */
    public void setValue(PersoDataSimple value) {
        this.value = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setField(Boolean value) {
        this.field = value;
    }

}
