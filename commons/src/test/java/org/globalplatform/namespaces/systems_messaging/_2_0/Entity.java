
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Address" minOccurs="0"/>
 *         &lt;element name="Contact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;choice>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Person" minOccurs="0"/>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}PhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}FaxNumber" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}eMail" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}URL" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Information" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "address",
    "contact"
})
@XmlRootElement(name = "Entity")
public class Entity {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Contact")
    protected Entity.Contact contact;
    @XmlAttribute(name = "Name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Entity.Contact }
     *     
     */
    public Entity.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entity.Contact }
     *     
     */
    public void setContact(Entity.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;choice>
     *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Person" minOccurs="0"/>
     *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}PhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}FaxNumber" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}eMail" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}URL" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}Information" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "personOrPhoneNumberOrFaxNumber"
    })
    public static class Contact {

        @XmlElementRefs({
            @XmlElementRef(name = "Person", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", type = Person.class),
            @XmlElementRef(name = "URL", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", type = JAXBElement.class),
            @XmlElementRef(name = "Information", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", type = Information.class),
            @XmlElementRef(name = "eMail", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", type = JAXBElement.class),
            @XmlElementRef(name = "FaxNumber", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", type = JAXBElement.class),
            @XmlElementRef(name = "PhoneNumber", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", type = JAXBElement.class)
        })
        protected List<Object> personOrPhoneNumberOrFaxNumber;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Gets the value of the personOrPhoneNumberOrFaxNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personOrPhoneNumberOrFaxNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersonOrPhoneNumberOrFaxNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Person }
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link Information }
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * 
         * 
         */
        public List<Object> getPersonOrPhoneNumberOrFaxNumber() {
            if (personOrPhoneNumberOrFaxNumber == null) {
                personOrPhoneNumberOrFaxNumber = new ArrayList<Object>();
            }
            return this.personOrPhoneNumberOrFaxNumber;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
