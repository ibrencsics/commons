package org.ib.commons.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CertificateChainDTO_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.dto.CertificateChainDTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.dto.CertificateChainDTO[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new org.ib.commons.dto.CertificateChainDTO[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.dto.CertificateChainDTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.dto.CertificateChainDTO_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.dto.CertificateChainDTO_Array_Rank_1_FieldSerializer.deserialize(reader, (org.ib.commons.dto.CertificateChainDTO[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.dto.CertificateChainDTO_Array_Rank_1_FieldSerializer.serialize(writer, (org.ib.commons.dto.CertificateChainDTO[])object);
  }
  
}
