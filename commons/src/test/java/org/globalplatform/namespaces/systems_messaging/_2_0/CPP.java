
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.globalplatform.namespaces.systems_profiles._1_1.CardPrintingProfile;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.1}CardPrintingProfile"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ProfileIdentification"/>
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
    "cardPrintingProfile",
    "profileIdentification"
})
@XmlRootElement(name = "CPP")
public class CPP {

    @XmlElement(name = "CardPrintingProfile", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.1", required = true)
    protected CardPrintingProfile cardPrintingProfile;
    @XmlElement(name = "ProfileIdentification", required = true)
    protected ProfileIdentification profileIdentification;

    /**
     * Gets the value of the cardPrintingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CardPrintingProfile }
     *     
     */
    public CardPrintingProfile getCardPrintingProfile() {
        return cardPrintingProfile;
    }

    /**
     * Sets the value of the cardPrintingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPrintingProfile }
     *     
     */
    public void setCardPrintingProfile(CardPrintingProfile value) {
        this.cardPrintingProfile = value;
    }

    /**
     * Gets the value of the profileIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileIdentification }
     *     
     */
    public ProfileIdentification getProfileIdentification() {
        return profileIdentification;
    }

    /**
     * Sets the value of the profileIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileIdentification }
     *     
     */
    public void setProfileIdentification(ProfileIdentification value) {
        this.profileIdentification = value;
    }

}
