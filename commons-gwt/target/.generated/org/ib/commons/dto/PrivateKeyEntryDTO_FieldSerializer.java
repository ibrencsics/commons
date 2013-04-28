package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PrivateKeyEntryDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static org.ib.commons.dto.CertificateChainDTO getCertificateChainDTO(org.ib.commons.dto.PrivateKeyEntryDTO instance) {
    return (org.ib.commons.dto.CertificateChainDTO) ReflectionHelper.getField(org.ib.commons.dto.PrivateKeyEntryDTO.class, instance, "certificateChainDTO");
  }
  
  private static void setCertificateChainDTO(org.ib.commons.dto.PrivateKeyEntryDTO instance, org.ib.commons.dto.CertificateChainDTO value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.PrivateKeyEntryDTO.class, instance, "certificateChainDTO", value);
  }
  
  private static org.ib.commons.dto.PrivateKeyDTO getPrivateKeyDTO(org.ib.commons.dto.PrivateKeyEntryDTO instance) {
    return (org.ib.commons.dto.PrivateKeyDTO) ReflectionHelper.getField(org.ib.commons.dto.PrivateKeyEntryDTO.class, instance, "privateKeyDTO");
  }
  
  private static void setPrivateKeyDTO(org.ib.commons.dto.PrivateKeyEntryDTO instance, org.ib.commons.dto.PrivateKeyDTO value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.PrivateKeyEntryDTO.class, instance, "privateKeyDTO", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.PrivateKeyEntryDTO instance) throws SerializationException {
    setCertificateChainDTO(instance, (org.ib.commons.dto.CertificateChainDTO) streamReader.readObject());
    setPrivateKeyDTO(instance, (org.ib.commons.dto.PrivateKeyDTO) streamReader.readObject());
    
    org.ib.commons.dto.EntryDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.PrivateKeyEntryDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.PrivateKeyEntryDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.PrivateKeyEntryDTO instance) throws SerializationException {
    streamWriter.writeObject(getCertificateChainDTO(instance));
    streamWriter.writeObject(getPrivateKeyDTO(instance));
    
    org.ib.commons.dto.EntryDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.PrivateKeyEntryDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.PrivateKeyEntryDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.PrivateKeyEntryDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.PrivateKeyEntryDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.PrivateKeyEntryDTO)object);
  }
  
}
