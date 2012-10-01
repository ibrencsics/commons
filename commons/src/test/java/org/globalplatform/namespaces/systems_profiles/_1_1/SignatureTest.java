
package org.globalplatform.namespaces.systems_profiles._1_1;

import java.io.Serializable;
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}ApplicationProfile" minOccurs="0"/>
 *         &lt;element name="ApplicationProfileString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "applicationProfile",
    "applicationProfileString"
})
@XmlRootElement(name = "SignatureTest")
public class SignatureTest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ApplicationProfile")
    protected ApplicationProfile applicationProfile;
    @XmlElement(name = "ApplicationProfileString")
    protected String applicationProfileString;

    /**
     * Gets the value of the applicationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationProfile }
     *     
     */
    public ApplicationProfile getApplicationProfile() {
        return applicationProfile;
    }

    /**
     * Sets the value of the applicationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationProfile }
     *     
     */
    public void setApplicationProfile(ApplicationProfile value) {
        this.applicationProfile = value;
    }

    /**
     * Gets the value of the applicationProfileString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationProfileString() {
        return applicationProfileString;
    }

    /**
     * Sets the value of the applicationProfileString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationProfileString(String value) {
        this.applicationProfileString = value;
    }

}
