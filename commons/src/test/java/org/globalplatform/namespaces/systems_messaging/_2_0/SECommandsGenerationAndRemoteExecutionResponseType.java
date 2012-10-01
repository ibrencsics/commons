
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the SECommandsGenerationAndRemoteExecutionRequest message
 * 
 * <p>Java class for SECommandsGenerationAndRemoteExecutionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECommandsGenerationAndRemoteExecutionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}SECommandsGenerationAndRemoteExecutionResponseResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECommandsGenerationAndRemoteExecutionResponseType", propOrder = {
    "responseData"
})
public class SECommandsGenerationAndRemoteExecutionResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected SECommandsGenerationAndRemoteExecutionResponseResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link SECommandsGenerationAndRemoteExecutionResponseResponseDataType }
     *     
     */
    public SECommandsGenerationAndRemoteExecutionResponseResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECommandsGenerationAndRemoteExecutionResponseResponseDataType }
     *     
     */
    public void setResponseData(SECommandsGenerationAndRemoteExecutionResponseResponseDataType value) {
        this.responseData = value;
    }

}
