
package org.globalplatform.namespaces.systems_messaging._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}CommonModuleIdentifierCode"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}GenericModule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DeliveryModule" minOccurs="0"/>
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
    "commonModuleIdentifierCodeAndGenericModuleAndDeliveryModule"
})
@XmlRootElement(name = "CommonDataContainer")
public class CommonDataContainer {

    @XmlElements({
        @XmlElement(name = "CommonModuleIdentifierCode", required = true, type = CommonModuleIdentifierCode.class),
        @XmlElement(name = "GenericModule", required = true, type = GenericModule.class),
        @XmlElement(name = "DeliveryModule", required = true, type = DeliveryModule.class)
    })
    protected List<Object> commonModuleIdentifierCodeAndGenericModuleAndDeliveryModule;

    /**
     * Gets the value of the commonModuleIdentifierCodeAndGenericModuleAndDeliveryModule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonModuleIdentifierCodeAndGenericModuleAndDeliveryModule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonModuleIdentifierCodeAndGenericModuleAndDeliveryModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonModuleIdentifierCode }
     * {@link GenericModule }
     * {@link DeliveryModule }
     * 
     * 
     */
    public List<Object> getCommonModuleIdentifierCodeAndGenericModuleAndDeliveryModule() {
        if (commonModuleIdentifierCodeAndGenericModuleAndDeliveryModule == null) {
            commonModuleIdentifierCodeAndGenericModuleAndDeliveryModule = new ArrayList<Object>();
        }
        return this.commonModuleIdentifierCodeAndGenericModuleAndDeliveryModule;
    }

}
