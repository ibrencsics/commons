
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data of the response to the GetCAInformationRequest message, in case or successful processing of the function
 * 
 * <p>Java class for GetCAInformationResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCAInformationResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportedCCCMMode" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CCCMModeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CACertificate" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCAInformationResponseDataType", propOrder = {
    "supportedCCCMMode",
    "caCertificate"
})
public class GetCAInformationResponseDataType {

    @XmlElement(name = "SupportedCCCMMode")
    protected List<CCCMModeType> supportedCCCMMode;
    @XmlElement(name = "CACertificate", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] caCertificate;

    /**
     * Gets the value of the supportedCCCMMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedCCCMMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedCCCMMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCCMModeType }
     * 
     * 
     */
    public List<CCCMModeType> getSupportedCCCMMode() {
        if (supportedCCCMMode == null) {
            supportedCCCMMode = new ArrayList<CCCMModeType>();
        }
        return this.supportedCCCMMode;
    }

    /**
     * Gets the value of the caCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCACertificate() {
        return caCertificate;
    }

    /**
     * Sets the value of the caCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCACertificate(byte[] value) {
        this.caCertificate = value;
    }

}
