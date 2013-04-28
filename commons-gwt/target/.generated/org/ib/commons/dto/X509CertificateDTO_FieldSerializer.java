package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class X509CertificateDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.X509CertificateDTO instance) throws SerializationException {
    instance.issuerDN = streamReader.readString();
    instance.notAfter = (java.util.Date) streamReader.readObject();
    instance.notBefore = (java.util.Date) streamReader.readObject();
    instance.serialNumber = streamReader.readString();
    instance.signatureAlgorithm = streamReader.readString();
    instance.subjectDN = streamReader.readString();
    
    org.ib.commons.dto.CertificateDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.X509CertificateDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.X509CertificateDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.X509CertificateDTO instance) throws SerializationException {
    streamWriter.writeString(instance.issuerDN);
    streamWriter.writeObject(instance.notAfter);
    streamWriter.writeObject(instance.notBefore);
    streamWriter.writeString(instance.serialNumber);
    streamWriter.writeString(instance.signatureAlgorithm);
    streamWriter.writeString(instance.subjectDN);
    
    org.ib.commons.dto.CertificateDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.X509CertificateDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.X509CertificateDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.X509CertificateDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.X509CertificateDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.X509CertificateDTO)object);
  }
  
}
