package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CertificateDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCertStr(org.ib.commons.dto.CertificateDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.CertificateDTO.class, instance, "certStr");
  }
  
  private static void setCertStr(org.ib.commons.dto.CertificateDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.CertificateDTO.class, instance, "certStr", value);
  }
  
  private static byte[] getEncoded(org.ib.commons.dto.CertificateDTO instance) {
    return (byte[]) ReflectionHelper.getField(org.ib.commons.dto.CertificateDTO.class, instance, "encoded");
  }
  
  private static void setEncoded(org.ib.commons.dto.CertificateDTO instance, byte[] value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.CertificateDTO.class, instance, "encoded", value);
  }
  
  private static java.lang.String getPubKeyAlgorithm(org.ib.commons.dto.CertificateDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.CertificateDTO.class, instance, "pubKeyAlgorithm");
  }
  
  private static void setPubKeyAlgorithm(org.ib.commons.dto.CertificateDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.CertificateDTO.class, instance, "pubKeyAlgorithm", value);
  }
  
  private static byte[] getPubKeyEncoded(org.ib.commons.dto.CertificateDTO instance) {
    return (byte[]) ReflectionHelper.getField(org.ib.commons.dto.CertificateDTO.class, instance, "pubKeyEncoded");
  }
  
  private static void setPubKeyEncoded(org.ib.commons.dto.CertificateDTO instance, byte[] value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.CertificateDTO.class, instance, "pubKeyEncoded", value);
  }
  
  private static java.lang.String getPubKeyFormat(org.ib.commons.dto.CertificateDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.CertificateDTO.class, instance, "pubKeyFormat");
  }
  
  private static void setPubKeyFormat(org.ib.commons.dto.CertificateDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.CertificateDTO.class, instance, "pubKeyFormat", value);
  }
  
  private static java.lang.String getPubKeyStr(org.ib.commons.dto.CertificateDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.CertificateDTO.class, instance, "pubKeyStr");
  }
  
  private static void setPubKeyStr(org.ib.commons.dto.CertificateDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.CertificateDTO.class, instance, "pubKeyStr", value);
  }
  
  private static java.lang.String getType(org.ib.commons.dto.CertificateDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.dto.CertificateDTO.class, instance, "type");
  }
  
  private static void setType(org.ib.commons.dto.CertificateDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.dto.CertificateDTO.class, instance, "type", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.CertificateDTO instance) throws SerializationException {
    setCertStr(instance, streamReader.readString());
    setEncoded(instance, (byte[]) streamReader.readObject());
    setPubKeyAlgorithm(instance, streamReader.readString());
    setPubKeyEncoded(instance, (byte[]) streamReader.readObject());
    setPubKeyFormat(instance, streamReader.readString());
    setPubKeyStr(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.CertificateDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.ib.commons.dto.CertificateDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.CertificateDTO instance) throws SerializationException {
    streamWriter.writeString(getCertStr(instance));
    streamWriter.writeObject(getEncoded(instance));
    streamWriter.writeString(getPubKeyAlgorithm(instance));
    streamWriter.writeObject(getPubKeyEncoded(instance));
    streamWriter.writeString(getPubKeyFormat(instance));
    streamWriter.writeString(getPubKeyStr(instance));
    streamWriter.writeString(getType(instance));
    
    org.ib.commons.dto.BaseDTO_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.CertificateDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.CertificateDTO_FieldSerializer.deserialize(reader, (org.ib.commons.dto.CertificateDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.CertificateDTO_FieldSerializer.serialize(writer, (org.ib.commons.dto.CertificateDTO)object);
  }
  
}
