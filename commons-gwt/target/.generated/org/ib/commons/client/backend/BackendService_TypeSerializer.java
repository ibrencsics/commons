package org.ib.commons.client.backend;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class BackendService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("[B/3308590456", "com.google.gwt.user.client.rpc.core.byte_Array_Rank_1_FieldSerializer");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord/3375188634", "com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("java.lang.Boolean/476441737", "com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer");
    result.put("java.lang.IllegalArgumentException/1755012560", "com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer");
    result.put("java.lang.NumberFormatException/3305228476", "com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("[Ljava.lang.String;/2600011424", "com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer");
    result.put("java.sql.Date/730999118", "com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer");
    result.put("java.sql.Time/1816797103", "com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer");
    result.put("java.sql.Timestamp/3040052672", "com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer");
    result.put("java.util.ArrayList/4159755760", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/2507071751", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/4157118744", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$SingletonList/1586180994", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.Date/3385151746", "com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer");
    result.put("java.util.LinkedList/3953877921", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1346942793", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.Vector/3057315478", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    result.put("org.ib.commons.dto.BaseDTO/3428132725", "org.ib.commons.dto.BaseDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.BaseDTO;/1022854590", "org.ib.commons.dto.BaseDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.CertificateChainDTO/3630390878", "org.ib.commons.dto.CertificateChainDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.CertificateChainDTO;/2632854869", "org.ib.commons.dto.CertificateChainDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.CertificateDTO/1097470676", "org.ib.commons.dto.CertificateDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.CertificateDTO;/2780293173", "org.ib.commons.dto.CertificateDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.EntryDTO/1497168455", "org.ib.commons.dto.EntryDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.EntryDTO;/3671858803", "org.ib.commons.dto.EntryDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.KeystoreDTO/1829695789", "org.ib.commons.dto.KeystoreDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.KeystoreDTO;/578775633", "org.ib.commons.dto.KeystoreDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.PKCS10CertRequestDTO/4063155999", "org.ib.commons.dto.PKCS10CertRequestDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.PKCS10CertRequestDTO;/1147842564", "org.ib.commons.dto.PKCS10CertRequestDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.PrivateKeyDTO/2086910291", "org.ib.commons.dto.PrivateKeyDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.PrivateKeyDTO;/2797896733", "org.ib.commons.dto.PrivateKeyDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.PrivateKeyEntryDTO/2578662297", "org.ib.commons.dto.PrivateKeyEntryDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.PrivateKeyEntryDTO;/2453944365", "org.ib.commons.dto.PrivateKeyEntryDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.TrustedCertificateEntryDTO/2707427925", "org.ib.commons.dto.TrustedCertificateEntryDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.TrustedCertificateEntryDTO;/2769568644", "org.ib.commons.dto.TrustedCertificateEntryDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.dto.X509CertificateDTO/1048459402", "org.ib.commons.dto.X509CertificateDTO_FieldSerializer");
    result.put("[Lorg.ib.commons.dto.X509CertificateDTO;/1711056763", "org.ib.commons.dto.X509CertificateDTO_Array_Rank_1_FieldSerializer");
    result.put("org.ib.commons.shared.exception.CommonsGWTException/3294070759", "org.ib.commons.shared.exception.CommonsGWTException_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("[B", "[B/3308590456");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord", "com.google.gwt.i18n.shared.impl.DateRecord/3375188634");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("java.lang.Boolean", "java.lang.Boolean/476441737");
    result.put("java.lang.IllegalArgumentException", "java.lang.IllegalArgumentException/1755012560");
    result.put("java.lang.NumberFormatException", "java.lang.NumberFormatException/3305228476");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("[Ljava.lang.String;", "[Ljava.lang.String;/2600011424");
    result.put("java.sql.Date", "java.sql.Date/730999118");
    result.put("java.sql.Time", "java.sql.Time/1816797103");
    result.put("java.sql.Timestamp", "java.sql.Timestamp/3040052672");
    result.put("java.util.ArrayList", "java.util.ArrayList/4159755760");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/2507071751");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/4157118744");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/1586180994");
    result.put("java.util.Date", "java.util.Date/3385151746");
    result.put("java.util.LinkedList", "java.util.LinkedList/3953877921");
    result.put("java.util.Stack", "java.util.Stack/1346942793");
    result.put("java.util.Vector", "java.util.Vector/3057315478");
    result.put("org.ib.commons.dto.BaseDTO", "org.ib.commons.dto.BaseDTO/3428132725");
    result.put("[Lorg.ib.commons.dto.BaseDTO;", "[Lorg.ib.commons.dto.BaseDTO;/1022854590");
    result.put("org.ib.commons.dto.CertificateChainDTO", "org.ib.commons.dto.CertificateChainDTO/3630390878");
    result.put("[Lorg.ib.commons.dto.CertificateChainDTO;", "[Lorg.ib.commons.dto.CertificateChainDTO;/2632854869");
    result.put("org.ib.commons.dto.CertificateDTO", "org.ib.commons.dto.CertificateDTO/1097470676");
    result.put("[Lorg.ib.commons.dto.CertificateDTO;", "[Lorg.ib.commons.dto.CertificateDTO;/2780293173");
    result.put("org.ib.commons.dto.EntryDTO", "org.ib.commons.dto.EntryDTO/1497168455");
    result.put("[Lorg.ib.commons.dto.EntryDTO;", "[Lorg.ib.commons.dto.EntryDTO;/3671858803");
    result.put("org.ib.commons.dto.KeystoreDTO", "org.ib.commons.dto.KeystoreDTO/1829695789");
    result.put("[Lorg.ib.commons.dto.KeystoreDTO;", "[Lorg.ib.commons.dto.KeystoreDTO;/578775633");
    result.put("org.ib.commons.dto.PKCS10CertRequestDTO", "org.ib.commons.dto.PKCS10CertRequestDTO/4063155999");
    result.put("[Lorg.ib.commons.dto.PKCS10CertRequestDTO;", "[Lorg.ib.commons.dto.PKCS10CertRequestDTO;/1147842564");
    result.put("org.ib.commons.dto.PrivateKeyDTO", "org.ib.commons.dto.PrivateKeyDTO/2086910291");
    result.put("[Lorg.ib.commons.dto.PrivateKeyDTO;", "[Lorg.ib.commons.dto.PrivateKeyDTO;/2797896733");
    result.put("org.ib.commons.dto.PrivateKeyEntryDTO", "org.ib.commons.dto.PrivateKeyEntryDTO/2578662297");
    result.put("[Lorg.ib.commons.dto.PrivateKeyEntryDTO;", "[Lorg.ib.commons.dto.PrivateKeyEntryDTO;/2453944365");
    result.put("org.ib.commons.dto.TrustedCertificateEntryDTO", "org.ib.commons.dto.TrustedCertificateEntryDTO/2707427925");
    result.put("[Lorg.ib.commons.dto.TrustedCertificateEntryDTO;", "[Lorg.ib.commons.dto.TrustedCertificateEntryDTO;/2769568644");
    result.put("org.ib.commons.dto.X509CertificateDTO", "org.ib.commons.dto.X509CertificateDTO/1048459402");
    result.put("[Lorg.ib.commons.dto.X509CertificateDTO;", "[Lorg.ib.commons.dto.X509CertificateDTO;/1711056763");
    result.put("org.ib.commons.shared.exception.CommonsGWTException", "org.ib.commons.shared.exception.CommonsGWTException/3294070759");
    return result;
  }
  
  public BackendService_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
