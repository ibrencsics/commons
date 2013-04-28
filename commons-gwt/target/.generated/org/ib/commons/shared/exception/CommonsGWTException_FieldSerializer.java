package org.ib.commons.shared.exception;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CommonsGWTException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getKey(org.ib.commons.shared.exception.CommonsGWTException instance) {
    return (java.lang.String) ReflectionHelper.getField(org.ib.commons.shared.exception.CommonsGWTException.class, instance, "key");
  }
  
  private static void setKey(org.ib.commons.shared.exception.CommonsGWTException instance, java.lang.String value) 
  {
    ReflectionHelper.setField(org.ib.commons.shared.exception.CommonsGWTException.class, instance, "key", value);
  }
  
  private static java.lang.String[] getParams(org.ib.commons.shared.exception.CommonsGWTException instance) {
    return (java.lang.String[]) ReflectionHelper.getField(org.ib.commons.shared.exception.CommonsGWTException.class, instance, "params");
  }
  
  private static void setParams(org.ib.commons.shared.exception.CommonsGWTException instance, java.lang.String[] value) 
  {
    ReflectionHelper.setField(org.ib.commons.shared.exception.CommonsGWTException.class, instance, "params", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.ib.commons.shared.exception.CommonsGWTException instance) throws SerializationException {
    setKey(instance, streamReader.readString());
    setParams(instance, (java.lang.String[]) streamReader.readObject());
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.ib.commons.shared.exception.CommonsGWTException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return ReflectionHelper.newInstance(org.ib.commons.shared.exception.CommonsGWTException.class);
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.ib.commons.shared.exception.CommonsGWTException instance) throws SerializationException {
    streamWriter.writeString(getKey(instance));
    streamWriter.writeObject(getParams(instance));
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.ib.commons.shared.exception.CommonsGWTException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.ib.commons.shared.exception.CommonsGWTException_FieldSerializer.deserialize(reader, (org.ib.commons.shared.exception.CommonsGWTException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.ib.commons.shared.exception.CommonsGWTException_FieldSerializer.serialize(writer, (org.ib.commons.shared.exception.CommonsGWTException)object);
  }
  
}
