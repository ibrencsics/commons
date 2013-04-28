package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CertificateChainDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.util.List getCertChain(org.ib.commons.dto.CertificateChainDTO instance) {
    return (java.util.List) ReflectionHelper.getField(org.ib.commons.dto.CertificateChainDTO.class, instance, "certChain");
  }
  
  private static void setCertChain(org.ib.commons.dto.CertificateChainDTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.CertificateChainDTO.class, instance, "certChain", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.CertificateChainDTO instance) throws SerializationException {
    setCertChain(instance, (java.util.List) streamReader.readObject());
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.CertificateChainDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.CertificateChainDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.CertificateChainDTO instance) throws SerializationException {
    streamWriter.writeObject(getCertChain(instance));
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.CertificateChainDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.CertificateChainDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.CertificateChainDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.CertificateChainDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.CertificateChainDTO)object);
  }
  
}
