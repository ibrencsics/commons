
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * TAR as SE Application identifier.
 * 
 * <p>Java class for SEAppId_TARType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEAppId_TARType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SEApplicationIdentifierType">
 *       &lt;sequence>
 *         &lt;element name="TAR" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}TARType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEAppId_TARType", propOrder = {
    "tar"
})
public class SEAppIdTARType
    extends SEApplicationIdentifierType
{

    @XmlElement(name = "TAR", required = true)
    protected String tar;

    /**
     * Gets the value of the tar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAR() {
        return tar;
    }

    /**
     * Sets the value of the tar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAR(String value) {
        this.tar = value;
    }

}
