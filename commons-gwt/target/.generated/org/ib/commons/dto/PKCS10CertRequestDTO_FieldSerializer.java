package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PKCS10CertRequestDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getName(org.ib.commons.dto.PKCS10CertRequestDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.PKCS10CertRequestDTO.class, instance, "name");
  }
  
  private static void setName(org.ib.commons.dto.PKCS10CertRequestDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.PKCS10CertRequestDTO.class, instance, "name", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.PKCS10CertRequestDTO instance) throws SerializationException {
    setName(instance, streamReader.readString());
    instance.signatureAlgorithm = streamReader.readString();
    instance.subjectDN = streamReader.readString();
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.PKCS10CertRequestDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.PKCS10CertRequestDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.PKCS10CertRequestDTO instance) throws SerializationException {
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(instance.signatureAlgorithm);
    streamWriter.writeString(instance.subjectDN);
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.PKCS10CertRequestDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.PKCS10CertRequestDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.PKCS10CertRequestDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.PKCS10CertRequestDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.PKCS10CertRequestDTO)object);
  }
  
}
