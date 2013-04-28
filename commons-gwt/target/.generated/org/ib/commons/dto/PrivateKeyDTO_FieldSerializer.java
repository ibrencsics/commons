package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PrivateKeyDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getAlgorithm(org.ib.commons.dto.PrivateKeyDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.PrivateKeyDTO.class, instance, "algorithm");
  }
  
  private static void setAlgorithm(org.ib.commons.dto.PrivateKeyDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.PrivateKeyDTO.class, instance, "algorithm", value);
  }
  
  private static byte[] getEncoded(org.ib.commons.dto.PrivateKeyDTO instance) {
    return (byte[]) ReflectionHelper.getField(org.ib.commons.dto.PrivateKeyDTO.class, instance, "encoded");
  }
  
  private static void setEncoded(org.ib.commons.dto.PrivateKeyDTO instance, byte[] value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.PrivateKeyDTO.class, instance, "encoded", value);
  }
  
  private static java.lang.String getFormat(org.ib.commons.dto.PrivateKeyDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.PrivateKeyDTO.class, instance, "format");
  }
  
  private static void setFormat(org.ib.commons.dto.PrivateKeyDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.PrivateKeyDTO.class, instance, "format", value);
  }
  
  private static java.lang.String getPrivKeyStr(org.ib.commons.dto.PrivateKeyDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.PrivateKeyDTO.class, instance, "privKeyStr");
  }
  
  private static void setPrivKeyStr(org.ib.commons.dto.PrivateKeyDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.PrivateKeyDTO.class, instance, "privKeyStr", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.PrivateKeyDTO instance) throws SerializationException {
    setAlgorithm(instance, streamReader.readString());
    setEncoded(instance, (byte[]) streamReader.readObject());
    setFormat(instance, streamReader.readString());
    setPrivKeyStr(instance, streamReader.readString());
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.PrivateKeyDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.PrivateKeyDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.PrivateKeyDTO instance) throws SerializationException {
    streamWriter.writeString(getAlgorithm(instance));
    streamWriter.writeObject(getEncoded(instance));
    streamWriter.writeString(getFormat(instance));
    streamWriter.writeString(getPrivKeyStr(instance));
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.PrivateKeyDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.PrivateKeyDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.PrivateKeyDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.PrivateKeyDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.PrivateKeyDTO)object);
  }
  
}
