
package org.globalplatform.namespaces.systems_profiles._1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="Encrypt" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Decrypt" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DecryptEncrypt" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Verify" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Wrap" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Unwrap" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="UnwrapWrap" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Derive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Usage")
public class Usage {

    @XmlAttribute(name = "Encrypt")
    protected Boolean encrypt;
    @XmlAttribute(name = "Decrypt")
    protected Boolean decrypt;
    @XmlAttribute(name = "DecryptEncrypt")
    protected Boolean decryptEncrypt;
    @XmlAttribute(name = "Sign")
    protected Boolean sign;
    @XmlAttribute(name = "Verify")
    protected Boolean verify;
    @XmlAttribute(name = "Wrap")
    protected Boolean wrap;
    @XmlAttribute(name = "Unwrap")
    protected Boolean unwrap;
    @XmlAttribute(name = "UnwrapWrap")
    protected Boolean unwrapWrap;
    @XmlAttribute(name = "Derive")
    protected Boolean derive;

    /**
     * Gets the value of the encrypt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypt() {
        return encrypt;
    }

    /**
     * Sets the value of the encrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypt(Boolean value) {
        this.encrypt = value;
    }

    /**
     * Gets the value of the decrypt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDecrypt() {
        return decrypt;
    }

    /**
     * Sets the value of the decrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecrypt(Boolean value) {
        this.decrypt = value;
    }

    /**
     * Gets the value of the decryptEncrypt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDecryptEncrypt() {
        return decryptEncrypt;
    }

    /**
     * Sets the value of the decryptEncrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecryptEncrypt(Boolean value) {
        this.decryptEncrypt = value;
    }

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSign(Boolean value) {
        this.sign = value;
    }

    /**
     * Gets the value of the verify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerify() {
        return verify;
    }

    /**
     * Sets the value of the verify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerify(Boolean value) {
        this.verify = value;
    }

    /**
     * Gets the value of the wrap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrap() {
        return wrap;
    }

    /**
     * Sets the value of the wrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrap(Boolean value) {
        this.wrap = value;
    }

    /**
     * Gets the value of the unwrap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnwrap() {
        return unwrap;
    }

    /**
     * Sets the value of the unwrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnwrap(Boolean value) {
        this.unwrap = value;
    }

    /**
     * Gets the value of the unwrapWrap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnwrapWrap() {
        return unwrapWrap;
    }

    /**
     * Sets the value of the unwrapWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnwrapWrap(Boolean value) {
        this.unwrapWrap = value;
    }

    /**
     * Gets the value of the derive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerive() {
        return derive;
    }

    /**
     * Sets the value of the derive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDerive(Boolean value) {
        this.derive = value;
    }

}
