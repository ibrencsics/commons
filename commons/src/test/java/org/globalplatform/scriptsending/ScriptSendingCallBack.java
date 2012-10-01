package org.globalplatform.scriptsending;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T15:50:29.936+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://globalplatform.org/scriptsending", name = "ScriptSendingCallBack")
@XmlSeeAlso({org.globalplatform.namespaces.systems_profiles._1_1.ObjectFactory.class, generated.ObjectFactory.class, org.globalplatform.namespaces.systems_messaging._2_0.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ScriptSendingCallBack {

    @Oneway
    @WebMethod(operationName = "BeginConversation", action = "BeginConversation")
    public void beginConversation(
        @WebParam(partName = "BeginConversationResponse", name = "BeginConversationResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.BeginConversationResponseType beginConversationResponse
    );

    @Oneway
    @WebMethod(operationName = "SendScript", action = "SendScript")
    public void sendScript(
        @WebParam(partName = "SendScriptResponse", name = "SendScriptResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1")
        org.globalplatform.namespaces.systems_messaging._2_0.SendScriptResponseType sendScriptResponse
    );
}
