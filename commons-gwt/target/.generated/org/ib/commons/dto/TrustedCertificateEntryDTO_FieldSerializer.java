package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TrustedCertificateEntryDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static org.ib.commons.dto.CertificateDTO getCertificateDTO(org.ib.commons.dto.TrustedCertificateEntryDTO instance) {
    return (org.ib.commons.dto.CertificateDTO) ReflectionHelper.getField(org.ib.commons.dto.TrustedCertificateEntryDTO.class, instance, "certificateDTO");
  }
  
  private static void setCertificateDTO(org.ib.commons.dto.TrustedCertificateEntryDTO instance, org.ib.commons.dto.CertificateDTO value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.TrustedCertificateEntryDTO.class, instance, "certificateDTO", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.TrustedCertificateEntryDTO instance) throws SerializationException {
    setCertificateDTO(instance, (org.ib.commons.dto.CertificateDTO) streamReader.readObject());
    
    org.ib.commons.dto.EntryDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.TrustedCertificateEntryDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.TrustedCertificateEntryDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.TrustedCertificateEntryDTO instance) throws SerializationException {
    streamWriter.writeObject(getCertificateDTO(instance));
    
    org.ib.commons.dto.EntryDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.TrustedCertificateEntryDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.TrustedCertificateEntryDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.TrustedCertificateEntryDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.TrustedCertificateEntryDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.TrustedCertificateEntryDTO)object);
  }
  
}
