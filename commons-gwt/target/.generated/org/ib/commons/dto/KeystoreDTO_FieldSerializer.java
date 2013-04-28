package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class KeystoreDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.util.List getEntries(org.ib.commons.dto.KeystoreDTO instance) {
    return (java.util.List) ReflectionHelper.getField(org.ib.commons.dto.KeystoreDTO.class, instance, "entries");
  }
  
  private static void setEntries(org.ib.commons.dto.KeystoreDTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.KeystoreDTO.class, instance, "entries", value);
  }
  
  private static java.lang.String getName(org.ib.commons.dto.KeystoreDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.KeystoreDTO.class, instance, "name");
  }
  
  private static void setName(org.ib.commons.dto.KeystoreDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.KeystoreDTO.class, instance, "name", value);
  }
  
  private static java.lang.String getPassword(org.ib.commons.dto.KeystoreDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.KeystoreDTO.class, instance, "password");
  }
  
  private static void setPassword(org.ib.commons.dto.KeystoreDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.KeystoreDTO.class, instance, "password", value);
  }
  
  private static java.lang.String getSecurityProvider(org.ib.commons.dto.KeystoreDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.KeystoreDTO.class, instance, "securityProvider");
  }
  
  private static void setSecurityProvider(org.ib.commons.dto.KeystoreDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.KeystoreDTO.class, instance, "securityProvider", value);
  }
  
  private static java.lang.String getType(org.ib.commons.dto.KeystoreDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.KeystoreDTO.class, instance, "type");
  }
  
  private static void setType(org.ib.commons.dto.KeystoreDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.KeystoreDTO.class, instance, "type", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.KeystoreDTO instance) throws SerializationException {
    setEntries(instance, (java.util.List) streamReader.readObject());
    setName(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    setSecurityProvider(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.KeystoreDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.KeystoreDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.KeystoreDTO instance) throws SerializationException {
    streamWriter.writeObject(getEntries(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeString(getSecurityProvider(instance));
    streamWriter.writeString(getType(instance));
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.KeystoreDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.KeystoreDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.KeystoreDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.KeystoreDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.KeystoreDTO)object);
  }
  
}
