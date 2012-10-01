
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for command to be executed on the SE.
 * 
 * <p>Java class for SECommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECommandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECommandType")
@XmlSeeAlso({
    ExtraditeCommandType.class,
    LoadELFCommandType.class,
    InstantiateApplicationCommandType.class,
    ApplicationRegistryUpdateCommandType.class,
    SetStatusCommandType.class,
    DeleteCommandType.class,
    CreateFirstSSDKeysetCommandType.class,
    MakeSelectableApplicationCommandType.class
})
public abstract class SECommandType {


}
