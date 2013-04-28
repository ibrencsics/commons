package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class EntryDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getAlias(org.ib.commons.dto.EntryDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.EntryDTO.class, instance, "alias");
  }
  
  private static void setAlias(org.ib.commons.dto.EntryDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.EntryDTO.class, instance, "alias", value);
  }
  
  private static java.lang.String getPassword(org.ib.commons.dto.EntryDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.EntryDTO.class, instance, "password");
  }
  
  private static void setPassword(org.ib.commons.dto.EntryDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.EntryDTO.class, instance, "password", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.EntryDTO instance) throws SerializationException {
    setAlias(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.EntryDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.EntryDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.EntryDTO instance) throws SerializationException {
    streamWriter.writeString(getAlias(instance));
    streamWriter.writeString(getPassword(instance));
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.EntryDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.EntryDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.EntryDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.EntryDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.EntryDTO)object);
  }
  
}
