
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
 * Requests for the installation / activation / personalization of a service from CMS
 * 
 * <p>Java class for DIAD_RequestServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIAD_RequestServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="Service">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OTP" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_OTP" minOccurs="0"/>
 *                   &lt;element name="Functions">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AppFunction" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ScriptName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="ScriptParams" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Content" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GPFunction" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StateName">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="INSTALL"/>
 *                                             &lt;enumeration value="PERSONALIZE"/>
 *                                             &lt;enumeration value="ACTIVATE"/>
 *                                             &lt;enumeration value="SUSPEND"/>
 *                                             &lt;enumeration value="DELETE"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Params" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ServiceId"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIAD_RequestServiceType", propOrder = {
    "service"
})
public class DIADRequestServiceType
    extends BasicRequestType
{

    @XmlElement(name = "Service", required = true)
    protected DIADRequestServiceType.Service service;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link DIADRequestServiceType.Service }
     *     
     */
    public DIADRequestServiceType.Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIADRequestServiceType.Service }
     *     
     */
    public void setService(DIADRequestServiceType.Service value) {
        this.service = value;
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
     *       &lt;sequence>
     *         &lt;element name="OTP" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_OTP" minOccurs="0"/>
     *         &lt;element name="Functions">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AppFunction" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ScriptName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="ScriptParams" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Content" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GPFunction" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StateName">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="INSTALL"/>
     *                                   &lt;enumeration value="PERSONALIZE"/>
     *                                   &lt;enumeration value="ACTIVATE"/>
     *                                   &lt;enumeration value="SUSPEND"/>
     *                                   &lt;enumeration value="DELETE"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Params" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.0.1}DIAD_ServiceId"/>
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
        "otp",
        "functions",
        "service"
    })
    public static class Service {

        @XmlElement(name = "OTP", type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        protected byte[] otp;
        @XmlElement(name = "Functions", required = true)
        protected DIADRequestServiceType.Service.Functions functions;
        @XmlElement(name = "Service", required = true)
        protected DIADServiceId service;

        /**
         * Gets the value of the otp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getOTP() {
            return otp;
        }

        /**
         * Sets the value of the otp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTP(byte[] value) {
            this.otp = value;
        }

        /**
         * Gets the value of the functions property.
         * 
         * @return
         *     possible object is
         *     {@link DIADRequestServiceType.Service.Functions }
         *     
         */
        public DIADRequestServiceType.Service.Functions getFunctions() {
            return functions;
        }

        /**
         * Sets the value of the functions property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIADRequestServiceType.Service.Functions }
         *     
         */
        public void setFunctions(DIADRequestServiceType.Service.Functions value) {
            this.functions = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link DIADServiceId }
         *     
         */
        public DIADServiceId getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link DIADServiceId }
         *     
         */
        public void setService(DIADServiceId value) {
            this.service = value;
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
         *       &lt;sequence>
         *         &lt;element name="AppFunction" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ScriptName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="ScriptParams" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Content" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GPFunction" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StateName">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="INSTALL"/>
         *                         &lt;enumeration value="PERSONALIZE"/>
         *                         &lt;enumeration value="ACTIVATE"/>
         *                         &lt;enumeration value="SUSPEND"/>
         *                         &lt;enumeration value="DELETE"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Params" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "appFunction",
            "gpFunction"
        })
        public static class Functions {

            @XmlElement(name = "AppFunction")
            protected List<DIADRequestServiceType.Service.Functions.AppFunction> appFunction;
            @XmlElement(name = "GPFunction")
            protected List<DIADRequestServiceType.Service.Functions.GPFunction> gpFunction;

            /**
             * Gets the value of the appFunction property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the appFunction property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAppFunction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DIADRequestServiceType.Service.Functions.AppFunction }
             * 
             * 
             */
            public List<DIADRequestServiceType.Service.Functions.AppFunction> getAppFunction() {
                if (appFunction == null) {
                    appFunction = new ArrayList<DIADRequestServiceType.Service.Functions.AppFunction>();
                }
                return this.appFunction;
            }

            /**
             * Gets the value of the gpFunction property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the gpFunction property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGPFunction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DIADRequestServiceType.Service.Functions.GPFunction }
             * 
             * 
             */
            public List<DIADRequestServiceType.Service.Functions.GPFunction> getGPFunction() {
                if (gpFunction == null) {
                    gpFunction = new ArrayList<DIADRequestServiceType.Service.Functions.GPFunction>();
                }
                return this.gpFunction;
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
             *       &lt;sequence>
             *         &lt;element name="ScriptName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="ScriptParams" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Content" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "scriptName",
                "scriptParams",
                "content"
            })
            public static class AppFunction {

                @XmlElement(name = "ScriptName", required = true)
                protected Object scriptName;
                @XmlElement(name = "ScriptParams")
                protected List<DIADRequestServiceType.Service.Functions.AppFunction.ScriptParams> scriptParams;
                @XmlElement(name = "Content")
                protected List<DIADRequestServiceType.Service.Functions.AppFunction.Content> content;

                /**
                 * Gets the value of the scriptName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getScriptName() {
                    return scriptName;
                }

                /**
                 * Sets the value of the scriptName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setScriptName(Object value) {
                    this.scriptName = value;
                }

                /**
                 * Gets the value of the scriptParams property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the scriptParams property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getScriptParams().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DIADRequestServiceType.Service.Functions.AppFunction.ScriptParams }
                 * 
                 * 
                 */
                public List<DIADRequestServiceType.Service.Functions.AppFunction.ScriptParams> getScriptParams() {
                    if (scriptParams == null) {
                        scriptParams = new ArrayList<DIADRequestServiceType.Service.Functions.AppFunction.ScriptParams>();
                    }
                    return this.scriptParams;
                }

                /**
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DIADRequestServiceType.Service.Functions.AppFunction.Content }
                 * 
                 * 
                 */
                public List<DIADRequestServiceType.Service.Functions.AppFunction.Content> getContent() {
                    if (content == null) {
                        content = new ArrayList<DIADRequestServiceType.Service.Functions.AppFunction.Content>();
                    }
                    return this.content;
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
                 *       &lt;sequence>
                 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
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
                    "key",
                    "value"
                })
                public static class Content {

                    @XmlElement(name = "Key", required = true)
                    protected String key;
                    @XmlElement(name = "Value", required = true, type = String.class)
                    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
                    @XmlSchemaType(name = "hexBinary")
                    protected byte[] value;

                    /**
                     * Gets the value of the key property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKey() {
                        return key;
                    }

                    /**
                     * Sets the value of the key property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKey(String value) {
                        this.key = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public byte[] getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(byte[] value) {
                        this.value = value;
                    }

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
                 *       &lt;sequence>
                 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
                    "name",
                    "value"
                })
                public static class ScriptParams {

                    @XmlElement(name = "Name", required = true)
                    protected Object name;
                    @XmlElement(name = "Value", required = true)
                    protected Object value;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setName(Object value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setValue(Object value) {
                        this.value = value;
                    }

                }

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
             *       &lt;sequence>
             *         &lt;element name="StateName">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="INSTALL"/>
             *               &lt;enumeration value="PERSONALIZE"/>
             *               &lt;enumeration value="ACTIVATE"/>
             *               &lt;enumeration value="SUSPEND"/>
             *               &lt;enumeration value="DELETE"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Params" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "stateName",
                "params"
            })
            public static class GPFunction {

                @XmlElement(name = "StateName", required = true)
                protected String stateName;
                @XmlElement(name = "Params")
                protected List<DIADRequestServiceType.Service.Functions.GPFunction.Params> params;

                /**
                 * Gets the value of the stateName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateName() {
                    return stateName;
                }

                /**
                 * Sets the value of the stateName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateName(String value) {
                    this.stateName = value;
                }

                /**
                 * Gets the value of the params property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the params property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getParams().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DIADRequestServiceType.Service.Functions.GPFunction.Params }
                 * 
                 * 
                 */
                public List<DIADRequestServiceType.Service.Functions.GPFunction.Params> getParams() {
                    if (params == null) {
                        params = new ArrayList<DIADRequestServiceType.Service.Functions.GPFunction.Params>();
                    }
                    return this.params;
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
                 *       &lt;sequence>
                 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
                    "name",
                    "value"
                })
                public static class Params {

                    @XmlElement(name = "Name", required = true)
                    protected Object name;
                    @XmlElement(name = "Value", required = true)
                    protected Object value;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setName(Object value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setValue(Object value) {
                        this.value = value;
                    }

                }

            }

        }

    }

}
