
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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ModuleIdentifierCode"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}ModulesCommonData" minOccurs="0"/>
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
    "moduleIdentifierCodeAndModulesCommonDataAndGenericModule"
})
@XmlRootElement(name = "DataContainer")
public class DataContainer {

    @XmlElements({
        @XmlElement(name = "ModuleIdentifierCode", required = true, type = ModuleIdentifierCode.class),
        @XmlElement(name = "ModulesCommonData", required = true, type = ModulesCommonData.class),
        @XmlElement(name = "GenericModule", required = true, type = GenericModule.class),
        @XmlElement(name = "DeliveryModule", required = true, type = DeliveryModule.class)
    })
    protected List<Object> moduleIdentifierCodeAndModulesCommonDataAndGenericModule;

    /**
     * Gets the value of the moduleIdentifierCodeAndModulesCommonDataAndGenericModule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleIdentifierCodeAndModulesCommonDataAndGenericModule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleIdentifierCodeAndModulesCommonDataAndGenericModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleIdentifierCode }
     * {@link ModulesCommonData }
     * {@link GenericModule }
     * {@link DeliveryModule }
     * 
     * 
     */
    public List<Object> getModuleIdentifierCodeAndModulesCommonDataAndGenericModule() {
        if (moduleIdentifierCodeAndModulesCommonDataAndGenericModule == null) {
            moduleIdentifierCodeAndModulesCommonDataAndGenericModule = new ArrayList<Object>();
        }
        return this.moduleIdentifierCodeAndModulesCommonDataAndGenericModule;
    }

}
