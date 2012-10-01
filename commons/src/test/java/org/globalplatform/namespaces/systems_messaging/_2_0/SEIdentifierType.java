
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Secure Element identifier. A Secure Element can for example be identified either by a Card Unique Data or an ICCID, but it can be extended to other type of identifier.
 * 
 * <p>Java class for SEIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEIdentifierType">
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
@XmlType(name = "SEIdentifierType")
@XmlSeeAlso({
    SEIdGenericType.class,
    SEIdExtendableType.class,
    SEIdCardUniqueDataType.class,
    SEIdICCIDType.class
})
public abstract class SEIdentifierType {


}
