package org.ib.commons.client.backend;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class BackendService_Proxy extends RemoteServiceProxy implements org.ib.commons.client.backend.BackendServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.ib.commons.client.backend.BackendService";
  private static final String SERIALIZATION_POLICY ="E22781ED6DAA69EF747D14EDCD5C9BA8";
  private static final org.ib.commons.client.backend.BackendService_TypeSerializer SERIALIZER = new org.ib.commons.client.backend.BackendService_TypeSerializer();
  
  public BackendService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "backend", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void canonicalize(java.lang.String xml, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "canonicalize");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(xml);
      helper.finish(async, ResponseReader.STRING);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createNewRoot(org.ib.commons.dto.KeystoreDTO keystoreDTO, org.ib.commons.dto.EntryDTO entryDTO, org.ib.commons.dto.X509CertificateDTO x509CertificateDTO, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "createNewRoot");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("org.ib.commons.dto.KeystoreDTO/1829695789");
      streamWriter.writeString("org.ib.commons.dto.EntryDTO/1497168455");
      streamWriter.writeString("org.ib.commons.dto.X509CertificateDTO/1048459402");
      streamWriter.writeObject(keystoreDTO);
      streamWriter.writeObject(entryDTO);
      streamWriter.writeObject(x509CertificateDTO);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createPKCS10CertRequest(org.ib.commons.dto.PKCS10CertRequestDTO pkcs10Dto, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "createPKCS10CertRequest");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("org.ib.commons.dto.PKCS10CertRequestDTO/4063155999");
      streamWriter.writeObject(pkcs10Dto);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getKeystores(com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "getKeystores");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(async, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getPKCS10CertRequests(com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "getPKCS10CertRequests");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(async, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void greetServer(java.lang.String input, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "greetServer");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(input);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void issueCertificate(org.ib.commons.dto.PKCS10CertRequestDTO pkcs10DTO, org.ib.commons.dto.KeystoreDTO issuerKS, org.ib.commons.dto.PrivateKeyEntryDTO issuerEntry, org.ib.commons.dto.KeystoreDTO targetKS, org.ib.commons.dto.PrivateKeyEntryDTO subjectEntry, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "issueCertificate");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 5);
      streamWriter.writeString("org.ib.commons.dto.PKCS10CertRequestDTO/4063155999");
      streamWriter.writeString("org.ib.commons.dto.KeystoreDTO/1829695789");
      streamWriter.writeString("org.ib.commons.dto.PrivateKeyEntryDTO/2578662297");
      streamWriter.writeString("org.ib.commons.dto.KeystoreDTO/1829695789");
      streamWriter.writeString("org.ib.commons.dto.PrivateKeyEntryDTO/2578662297");
      streamWriter.writeObject(pkcs10DTO);
      streamWriter.writeObject(issuerKS);
      streamWriter.writeObject(issuerEntry);
      streamWriter.writeObject(targetKS);
      streamWriter.writeObject(subjectEntry);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void printDOM(java.lang.String xml, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "printDOM");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(xml);
      helper.finish(async, ResponseReader.STRING);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void saveKeystore(org.ib.commons.dto.KeystoreDTO keystoreDTO, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "saveKeystore");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("org.ib.commons.dto.KeystoreDTO/1829695789");
      streamWriter.writeObject(keystoreDTO);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void signXML(java.lang.String xml, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "signXML");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(xml);
      helper.finish(async, ResponseReader.STRING);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void verifySignature(java.lang.String xml, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BackendService_Proxy", "verifySignature");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(xml);
      helper.finish(async, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
