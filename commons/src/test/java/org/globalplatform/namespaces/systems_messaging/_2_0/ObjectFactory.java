
package org.globalplatform.namespaces.systems_messaging._2_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.globalplatform.namespaces.systems_messaging._2_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoadSCWSServicePortalRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "LoadSCWSServicePortalRequest");
    private final static QName _ScriptFragment_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "ScriptFragment");
    private final static QName _BindDeviceApplicationToSEApplicationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "BindDeviceApplicationToSEApplicationResponse");
    private final static QName _BeginConversationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "BeginConversationRequest");
    private final static QName _HandleSERenewalNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "HandleSERenewalNotificationRequest");
    private final static QName _ProfileUniqueID_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "ProfileUniqueID");
    private final static QName _SECommandsGenerationAndRemoteExecutionResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "SECommandsGenerationAndRemoteExecutionResponse");
    private final static QName _SendScriptRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "SendScriptRequest");
    private final static QName _GetApplicationOrELFStatusResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetApplicationOrELFStatusResponse");
    private final static QName _CheckMobileSubscriptionEligibilityRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "CheckMobileSubscriptionEligibilityRequest");
    private final static QName _GetSECapabilityProfileIdRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetSECapabilityProfileIdRequest");
    private final static QName _GetMobileSubscriptionAlternateIdentifierRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetMobileSubscriptionAlternateIdentifierRequest");
    private final static QName _EndConversationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "EndConversationRequest");
    private final static QName _GenerateDMTokenRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GenerateDMTokenRequest");
    private final static QName _CheckMobileSubscriptionEligibilityResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "CheckMobileSubscriptionEligibilityResponse");
    private final static QName _HandleStartServiceStateChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "HandleStartServiceStateChangeNotificationRequest");
    private final static QName _HandleMobileSubscriptionStatusChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "HandleMobileSubscriptionStatusChangeNotificationRequest");
    private final static QName _GetSEMobileSubscriptionIdentifierRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetSEMobileSubscriptionIdentifierRequest");
    private final static QName _CardLifeCycleState_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "CardLifeCycleState");
    private final static QName _SendScriptResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "SendScriptResponse");
    private final static QName _GetCAInformationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetCAInformationResponse");
    private final static QName _LoadDeviceApplicationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "LoadDeviceApplicationRequest");
    private final static QName _DeliveryDate_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "DeliveryDate");
    private final static QName _GetSECapabilityProfileIdResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetSECapabilityProfileIdResponse");
    private final static QName _HandleSEMobileSubscriptionChangedNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "HandleSEMobileSubscriptionChangedNotificationRequest");
    private final static QName _SECommandsGenerationAndRemoteExecutionRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "SECommandsGenerationAndRemoteExecutionRequest");
    private final static QName _EndConversationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "EndConversationResponse");
    private final static QName _MuteCardsNumber_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "MuteCardsNumber");
    private final static QName _ExpectedDeliveryDate_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "ExpectedDeliveryDate");
    private final static QName _EnrollSSDOwnerCertificateRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "EnrollSSDOwnerCertificateRequest");
    private final static QName _ValidCardProfileID_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "ValidCardProfileID");
    private final static QName _VerifyDMReceiptRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "VerifyDMReceiptRequest");
    private final static QName _HandleEndServiceStateChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "HandleEndServiceStateChangeNotificationRequest");
    private final static QName _HandleSEDeviceChangedNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "HandleSEDeviceChangedNotificationRequest");
    private final static QName _DeleteDeviceApplicationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "DeleteDeviceApplicationRequest");
    private final static QName _HandleMobileSubscriptionIdentifierChangedNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "HandleMobileSubscriptionIdentifierChangedNotificationRequest");
    private final static QName _DeleteSCWSServicePortalResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "DeleteSCWSServicePortalResponse");
    private final static QName _GetApplicationOrELFStatusRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetApplicationOrELFStatusRequest");
    private final static QName _GetCAInformationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetCAInformationRequest");
    private final static QName _VerifyDMReceiptResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "VerifyDMReceiptResponse");
    private final static QName _DeleteSCWSServicePortalRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "DeleteSCWSServicePortalRequest");
    private final static QName _UnbindDeviceApplicationToSEApplicationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "UnbindDeviceApplicationToSEApplicationResponse");
    private final static QName _URL_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "URL");
    private final static QName _EMail_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "eMail");
    private final static QName _FaxNumber_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "FaxNumber");
    private final static QName _LoadSCWSServicePortalResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "LoadSCWSServicePortalResponse");
    private final static QName _PhoneNumber_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "PhoneNumber");
    private final static QName _BeginConversationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "BeginConversationResponse");
    private final static QName _ApplicationProfileUniqueID_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "ApplicationProfileUniqueID");
    private final static QName _HandleSEStatusChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "HandleSEStatusChangeNotificationRequest");
    private final static QName _GetDeviceCapabilityProfileIdRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetDeviceCapabilityProfileIdRequest");
    private final static QName _EnrollSSDOwnerCertificateResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "EnrollSSDOwnerCertificateResponse");
    private final static QName _GenerateDMTokenResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GenerateDMTokenResponse");
    private final static QName _LoadDeviceApplicationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "LoadDeviceApplicationResponse");
    private final static QName _GetMobileSubscriptionAlternateIdentifierResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetMobileSubscriptionAlternateIdentifierResponse");
    private final static QName _BindDeviceApplicationToSEApplicationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "BindDeviceApplicationToSEApplicationRequest");
    private final static QName _GetDeviceCapabilityProfileIdResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetDeviceCapabilityProfileIdResponse");
    private final static QName _GetSEMobileSubscriptionIdentifierResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "GetSEMobileSubscriptionIdentifierResponse");
    private final static QName _UnbindDeviceApplicationToSEApplicationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "UnbindDeviceApplicationToSEApplicationRequest");
    private final static QName _DeleteDeviceApplicationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.0.1", "DeleteDeviceApplicationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.globalplatform.namespaces.systems_messaging._2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link GPHeader }
     * 
     */
    public GPHeader createGPHeader() {
        return new GPHeader();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionAlternateIdentifierResponseType }
     * 
     */
    public GetMobileSubscriptionAlternateIdentifierResponseType createGetMobileSubscriptionAlternateIdentifierResponseType() {
        return new GetMobileSubscriptionAlternateIdentifierResponseType();
    }

    /**
     * Create an instance of {@link LoadDeviceApplicationResponseType }
     * 
     */
    public LoadDeviceApplicationResponseType createLoadDeviceApplicationResponseType() {
        return new LoadDeviceApplicationResponseType();
    }

    /**
     * Create an instance of {@link DeliveryModuleLog }
     * 
     */
    public DeliveryModuleLog createDeliveryModuleLog() {
        return new DeliveryModuleLog();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link EntityID }
     * 
     */
    public EntityID createEntityID() {
        return new EntityID();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Entity.Contact }
     * 
     */
    public Entity.Contact createEntityContact() {
        return new Entity.Contact();
    }

    /**
     * Create an instance of {@link RequestedDeliveryDate }
     * 
     */
    public RequestedDeliveryDate createRequestedDeliveryDate() {
        return new RequestedDeliveryDate();
    }

    /**
     * Create an instance of {@link ShippingInformation }
     * 
     */
    public ShippingInformation createShippingInformation() {
        return new ShippingInformation();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link PackagingInformation }
     * 
     */
    public PackagingInformation createPackagingInformation() {
        return new PackagingInformation();
    }

    /**
     * Create an instance of {@link GenerateDMTokenResponseType }
     * 
     */
    public GenerateDMTokenResponseType createGenerateDMTokenResponseType() {
        return new GenerateDMTokenResponseType();
    }

    /**
     * Create an instance of {@link LogData }
     * 
     */
    public LogData createLogData() {
        return new LogData();
    }

    /**
     * Create an instance of {@link DataSet }
     * 
     */
    public DataSet createDataSet() {
        return new DataSet();
    }

    /**
     * Create an instance of {@link ProfileRequest }
     * 
     */
    public ProfileRequest createProfileRequest() {
        return new ProfileRequest();
    }

    /**
     * Create an instance of {@link ProfileIdentification }
     * 
     */
    public ProfileIdentification createProfileIdentification() {
        return new ProfileIdentification();
    }

    /**
     * Create an instance of {@link ModulesCommonData }
     * 
     */
    public ModulesCommonData createModulesCommonData() {
        return new ModulesCommonData();
    }

    /**
     * Create an instance of {@link UnbindDeviceApplicationToSEApplicationRequestType }
     * 
     */
    public UnbindDeviceApplicationToSEApplicationRequestType createUnbindDeviceApplicationToSEApplicationRequestType() {
        return new UnbindDeviceApplicationToSEApplicationRequestType();
    }

    /**
     * Create an instance of {@link DeleteDeviceApplicationResponseType }
     * 
     */
    public DeleteDeviceApplicationResponseType createDeleteDeviceApplicationResponseType() {
        return new DeleteDeviceApplicationResponseType();
    }

    /**
     * Create an instance of {@link GetSEMobileSubscriptionIdentifierResponseType }
     * 
     */
    public GetSEMobileSubscriptionIdentifierResponseType createGetSEMobileSubscriptionIdentifierResponseType() {
        return new GetSEMobileSubscriptionIdentifierResponseType();
    }

    /**
     * Create an instance of {@link ApplicationData }
     * 
     */
    public ApplicationData createApplicationData() {
        return new ApplicationData();
    }

    /**
     * Create an instance of {@link AID }
     * 
     */
    public AID createAID() {
        return new AID();
    }

    /**
     * Create an instance of {@link ProcessingStep }
     * 
     */
    public ProcessingStep createProcessingStep() {
        return new ProcessingStep();
    }

    /**
     * Create an instance of {@link PersoDeviceIns }
     * 
     */
    public PersoDeviceIns createPersoDeviceIns() {
        return new PersoDeviceIns();
    }

    /**
     * Create an instance of {@link ICCData }
     * 
     */
    public ICCData createICCData() {
        return new ICCData();
    }

    /**
     * Create an instance of {@link GetDeviceCapabilityProfileIdResponseType }
     * 
     */
    public GetDeviceCapabilityProfileIdResponseType createGetDeviceCapabilityProfileIdResponseType() {
        return new GetDeviceCapabilityProfileIdResponseType();
    }

    /**
     * Create an instance of {@link CardCommonConfigurationLog }
     * 
     */
    public CardCommonConfigurationLog createCardCommonConfigurationLog() {
        return new CardCommonConfigurationLog();
    }

    /**
     * Create an instance of {@link CollatorReturnCode }
     * 
     */
    public CollatorReturnCode createCollatorReturnCode() {
        return new CollatorReturnCode();
    }

    /**
     * Create an instance of {@link BindDeviceApplicationToSEApplicationRequestType }
     * 
     */
    public BindDeviceApplicationToSEApplicationRequestType createBindDeviceApplicationToSEApplicationRequestType() {
        return new BindDeviceApplicationToSEApplicationRequestType();
    }

    /**
     * Create an instance of {@link CommonLogContainer }
     * 
     */
    public CommonLogContainer createCommonLogContainer() {
        return new CommonLogContainer();
    }

    /**
     * Create an instance of {@link CommonLogIdentifierCode }
     * 
     */
    public CommonLogIdentifierCode createCommonLogIdentifierCode() {
        return new CommonLogIdentifierCode();
    }

    /**
     * Create an instance of {@link ApplicationCommonLog }
     * 
     */
    public ApplicationCommonLog createApplicationCommonLog() {
        return new ApplicationCommonLog();
    }

    /**
     * Create an instance of {@link ApplicationLog }
     * 
     */
    public ApplicationLog createApplicationLog() {
        return new ApplicationLog();
    }

    /**
     * Create an instance of {@link ProcessingStepResult }
     * 
     */
    public ProcessingStepResult createProcessingStepResult() {
        return new ProcessingStepResult();
    }

    /**
     * Create an instance of {@link SECommandResultType }
     * 
     */
    public SECommandResultType createSECommandResultType() {
        return new SECommandResultType();
    }

    /**
     * Create an instance of {@link ModuleLog }
     * 
     */
    public ModuleLog createModuleLog() {
        return new ModuleLog();
    }

    /**
     * Create an instance of {@link BeginConversationResponseType }
     * 
     */
    public BeginConversationResponseType createBeginConversationResponseType() {
        return new BeginConversationResponseType();
    }

    /**
     * Create an instance of {@link LFP }
     * 
     */
    public LFP createLFP() {
        return new LFP();
    }

    /**
     * Create an instance of {@link JobContainerLog }
     * 
     */
    public JobContainerLog createJobContainerLog() {
        return new JobContainerLog();
    }

    /**
     * Create an instance of {@link LogContainerHeader }
     * 
     */
    public LogContainerHeader createLogContainerHeader() {
        return new LogContainerHeader();
    }

    /**
     * Create an instance of {@link LogContainer }
     * 
     */
    public LogContainer createLogContainer() {
        return new LogContainer();
    }

    /**
     * Create an instance of {@link LogIdentifierCode }
     * 
     */
    public LogIdentifierCode createLogIdentifierCode() {
        return new LogIdentifierCode();
    }

    /**
     * Create an instance of {@link CardConfigurationLog }
     * 
     */
    public CardConfigurationLog createCardConfigurationLog() {
        return new CardConfigurationLog();
    }

    /**
     * Create an instance of {@link CRN }
     * 
     */
    public CRN createCRN() {
        return new CRN();
    }

    /**
     * Create an instance of {@link PhysicalCardIdentifier }
     * 
     */
    public PhysicalCardIdentifier createPhysicalCardIdentifier() {
        return new PhysicalCardIdentifier();
    }

    /**
     * Create an instance of {@link ApplicationCommonData }
     * 
     */
    public ApplicationCommonData createApplicationCommonData() {
        return new ApplicationCommonData();
    }

    /**
     * Create an instance of {@link GenericModule }
     * 
     */
    public GenericModule createGenericModule() {
        return new GenericModule();
    }

    /**
     * Create an instance of {@link ModuleData }
     * 
     */
    public ModuleData createModuleData() {
        return new ModuleData();
    }

    /**
     * Create an instance of {@link EnrollSSDOwnerCertificateResponseType }
     * 
     */
    public EnrollSSDOwnerCertificateResponseType createEnrollSSDOwnerCertificateResponseType() {
        return new EnrollSSDOwnerCertificateResponseType();
    }

    /**
     * Create an instance of {@link HandleSEStatusChangeNotificationRequestType }
     * 
     */
    public HandleSEStatusChangeNotificationRequestType createHandleSEStatusChangeNotificationRequestType() {
        return new HandleSEStatusChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link GetDeviceCapabilityProfileIdRequestType }
     * 
     */
    public GetDeviceCapabilityProfileIdRequestType createGetDeviceCapabilityProfileIdRequestType() {
        return new GetDeviceCapabilityProfileIdRequestType();
    }

    /**
     * Create an instance of {@link JobContainer }
     * 
     */
    public JobContainer createJobContainer() {
        return new JobContainer();
    }

    /**
     * Create an instance of {@link DataContainerHeader }
     * 
     */
    public DataContainerHeader createDataContainerHeader() {
        return new DataContainerHeader();
    }

    /**
     * Create an instance of {@link CommonDataContainer }
     * 
     */
    public CommonDataContainer createCommonDataContainer() {
        return new CommonDataContainer();
    }

    /**
     * Create an instance of {@link CommonModuleIdentifierCode }
     * 
     */
    public CommonModuleIdentifierCode createCommonModuleIdentifierCode() {
        return new CommonModuleIdentifierCode();
    }

    /**
     * Create an instance of {@link CardCommonConfiguration }
     * 
     */
    public CardCommonConfiguration createCardCommonConfiguration() {
        return new CardCommonConfiguration();
    }

    /**
     * Create an instance of {@link DeliveryModule }
     * 
     */
    public DeliveryModule createDeliveryModule() {
        return new DeliveryModule();
    }

    /**
     * Create an instance of {@link DataContainer }
     * 
     */
    public DataContainer createDataContainer() {
        return new DataContainer();
    }

    /**
     * Create an instance of {@link ModuleIdentifierCode }
     * 
     */
    public ModuleIdentifierCode createModuleIdentifierCode() {
        return new ModuleIdentifierCode();
    }

    /**
     * Create an instance of {@link CardConfiguration }
     * 
     */
    public CardConfiguration createCardConfiguration() {
        return new CardConfiguration();
    }

    /**
     * Create an instance of {@link DeleteSCWSServicePortalRequestType }
     * 
     */
    public DeleteSCWSServicePortalRequestType createDeleteSCWSServicePortalRequestType() {
        return new DeleteSCWSServicePortalRequestType();
    }

    /**
     * Create an instance of {@link MessageContext }
     * 
     */
    public MessageContext createMessageContext() {
        return new MessageContext();
    }

    /**
     * Create an instance of {@link ReturnCodeStep }
     * 
     */
    public ReturnCodeStep createReturnCodeStep() {
        return new ReturnCodeStep();
    }

    /**
     * Create an instance of {@link VerifyDMReceiptResponseType }
     * 
     */
    public VerifyDMReceiptResponseType createVerifyDMReceiptResponseType() {
        return new VerifyDMReceiptResponseType();
    }

    /**
     * Create an instance of {@link GetCAInformationRequestType }
     * 
     */
    public GetCAInformationRequestType createGetCAInformationRequestType() {
        return new GetCAInformationRequestType();
    }

    /**
     * Create an instance of {@link LoadSCWSServicePortalResponseType }
     * 
     */
    public LoadSCWSServicePortalResponseType createLoadSCWSServicePortalResponseType() {
        return new LoadSCWSServicePortalResponseType();
    }

    /**
     * Create an instance of {@link EnvironmentContainer }
     * 
     */
    public EnvironmentContainer createEnvironmentContainer() {
        return new EnvironmentContainer();
    }

    /**
     * Create an instance of {@link CardAuditTrail }
     * 
     */
    public CardAuditTrail createCardAuditTrail() {
        return new CardAuditTrail();
    }

    /**
     * Create an instance of {@link GPHeader.RequestingEntity }
     * 
     */
    public GPHeader.RequestingEntity createGPHeaderRequestingEntity() {
        return new GPHeader.RequestingEntity();
    }

    /**
     * Create an instance of {@link GPHeader.TargetEntity }
     * 
     */
    public GPHeader.TargetEntity createGPHeaderTargetEntity() {
        return new GPHeader.TargetEntity();
    }

    /**
     * Create an instance of {@link UnbindDeviceApplicationToSEApplicationResponseType }
     * 
     */
    public UnbindDeviceApplicationToSEApplicationResponseType createUnbindDeviceApplicationToSEApplicationResponseType() {
        return new UnbindDeviceApplicationToSEApplicationResponseType();
    }

    /**
     * Create an instance of {@link HandleSEDeviceChangedNotificationRequestType }
     * 
     */
    public HandleSEDeviceChangedNotificationRequestType createHandleSEDeviceChangedNotificationRequestType() {
        return new HandleSEDeviceChangedNotificationRequestType();
    }

    /**
     * Create an instance of {@link HandleEndServiceStateChangeNotificationRequestType }
     * 
     */
    public HandleEndServiceStateChangeNotificationRequestType createHandleEndServiceStateChangeNotificationRequestType() {
        return new HandleEndServiceStateChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link VerifyDMReceiptRequestType }
     * 
     */
    public VerifyDMReceiptRequestType createVerifyDMReceiptRequestType() {
        return new VerifyDMReceiptRequestType();
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link GetApplicationOrELFStatusRequestType }
     * 
     */
    public GetApplicationOrELFStatusRequestType createGetApplicationOrELFStatusRequestType() {
        return new GetApplicationOrELFStatusRequestType();
    }

    /**
     * Create an instance of {@link DeleteSCWSServicePortalResponseType }
     * 
     */
    public DeleteSCWSServicePortalResponseType createDeleteSCWSServicePortalResponseType() {
        return new DeleteSCWSServicePortalResponseType();
    }

    /**
     * Create an instance of {@link HandleMobileSubscriptionIdentifierChangedNotificationRequestType }
     * 
     */
    public HandleMobileSubscriptionIdentifierChangedNotificationRequestType createHandleMobileSubscriptionIdentifierChangedNotificationRequestType() {
        return new HandleMobileSubscriptionIdentifierChangedNotificationRequestType();
    }

    /**
     * Create an instance of {@link DeleteDeviceApplicationRequestType }
     * 
     */
    public DeleteDeviceApplicationRequestType createDeleteDeviceApplicationRequestType() {
        return new DeleteDeviceApplicationRequestType();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link KeyID }
     * 
     */
    public KeyID createKeyID() {
        return new KeyID();
    }

    /**
     * Create an instance of {@link ApplicationDataPerCRN }
     * 
     */
    public ApplicationDataPerCRN createApplicationDataPerCRN() {
        return new ApplicationDataPerCRN();
    }

    /**
     * Create an instance of {@link EndConversationResponseType }
     * 
     */
    public EndConversationResponseType createEndConversationResponseType() {
        return new EndConversationResponseType();
    }

    /**
     * Create an instance of {@link LoadFileName }
     * 
     */
    public LoadFileName createLoadFileName() {
        return new LoadFileName();
    }

    /**
     * Create an instance of {@link EnrollSSDOwnerCertificateRequestType }
     * 
     */
    public EnrollSSDOwnerCertificateRequestType createEnrollSSDOwnerCertificateRequestType() {
        return new EnrollSSDOwnerCertificateRequestType();
    }

    /**
     * Create an instance of {@link ApplicationDataNotification }
     * 
     */
    public ApplicationDataNotification createApplicationDataNotification() {
        return new ApplicationDataNotification();
    }

    /**
     * Create an instance of {@link ApplicationAuditTrail }
     * 
     */
    public ApplicationAuditTrail createApplicationAuditTrail() {
        return new ApplicationAuditTrail();
    }

    /**
     * Create an instance of {@link ApplicationLogPerCRN }
     * 
     */
    public ApplicationLogPerCRN createApplicationLogPerCRN() {
        return new ApplicationLogPerCRN();
    }

    /**
     * Create an instance of {@link GetSECapabilityProfileIdResponseType }
     * 
     */
    public GetSECapabilityProfileIdResponseType createGetSECapabilityProfileIdResponseType() {
        return new GetSECapabilityProfileIdResponseType();
    }

    /**
     * Create an instance of {@link LoadDeviceApplicationRequestType }
     * 
     */
    public LoadDeviceApplicationRequestType createLoadDeviceApplicationRequestType() {
        return new LoadDeviceApplicationRequestType();
    }

    /**
     * Create an instance of {@link BatchAuditTrail }
     * 
     */
    public BatchAuditTrail createBatchAuditTrail() {
        return new BatchAuditTrail();
    }

    /**
     * Create an instance of {@link EnvironmentContainerLog }
     * 
     */
    public EnvironmentContainerLog createEnvironmentContainerLog() {
        return new EnvironmentContainerLog();
    }

    /**
     * Create an instance of {@link GetCAInformationResponseType }
     * 
     */
    public GetCAInformationResponseType createGetCAInformationResponseType() {
        return new GetCAInformationResponseType();
    }

    /**
     * Create an instance of {@link SendScriptResponseType }
     * 
     */
    public SendScriptResponseType createSendScriptResponseType() {
        return new SendScriptResponseType();
    }

    /**
     * Create an instance of {@link CardCustomization }
     * 
     */
    public CardCustomization createCardCustomization() {
        return new CardCustomization();
    }

    /**
     * Create an instance of {@link GetSEMobileSubscriptionIdentifierRequestType }
     * 
     */
    public GetSEMobileSubscriptionIdentifierRequestType createGetSEMobileSubscriptionIdentifierRequestType() {
        return new GetSEMobileSubscriptionIdentifierRequestType();
    }

    /**
     * Create an instance of {@link HandleMobileSubscriptionStatusChangeNotificationRequestType }
     * 
     */
    public HandleMobileSubscriptionStatusChangeNotificationRequestType createHandleMobileSubscriptionStatusChangeNotificationRequestType() {
        return new HandleMobileSubscriptionStatusChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link SECommandsGenerationAndRemoteExecutionRequestType }
     * 
     */
    public SECommandsGenerationAndRemoteExecutionRequestType createSECommandsGenerationAndRemoteExecutionRequestType() {
        return new SECommandsGenerationAndRemoteExecutionRequestType();
    }

    /**
     * Create an instance of {@link ApplicationDataRequest }
     * 
     */
    public ApplicationDataRequest createApplicationDataRequest() {
        return new ApplicationDataRequest();
    }

    /**
     * Create an instance of {@link HandleSEMobileSubscriptionChangedNotificationRequestType }
     * 
     */
    public HandleSEMobileSubscriptionChangedNotificationRequestType createHandleSEMobileSubscriptionChangedNotificationRequestType() {
        return new HandleSEMobileSubscriptionChangedNotificationRequestType();
    }

    /**
     * Create an instance of {@link AP }
     * 
     */
    public AP createAP() {
        return new AP();
    }

    /**
     * Create an instance of {@link CPP }
     * 
     */
    public CPP createCPP() {
        return new CPP();
    }

    /**
     * Create an instance of {@link CheckMobileSubscriptionEligibilityResponseType }
     * 
     */
    public CheckMobileSubscriptionEligibilityResponseType createCheckMobileSubscriptionEligibilityResponseType() {
        return new CheckMobileSubscriptionEligibilityResponseType();
    }

    /**
     * Create an instance of {@link GenerateDMTokenRequestType }
     * 
     */
    public GenerateDMTokenRequestType createGenerateDMTokenRequestType() {
        return new GenerateDMTokenRequestType();
    }

    /**
     * Create an instance of {@link KeyExchange }
     * 
     */
    public KeyExchange createKeyExchange() {
        return new KeyExchange();
    }

    /**
     * Create an instance of {@link EndConversationRequestType }
     * 
     */
    public EndConversationRequestType createEndConversationRequestType() {
        return new EndConversationRequestType();
    }

    /**
     * Create an instance of {@link GPMessage }
     * 
     */
    public GPMessage createGPMessage() {
        return new GPMessage();
    }

    /**
     * Create an instance of {@link GPBody }
     * 
     */
    public GPBody createGPBody() {
        return new GPBody();
    }

    /**
     * Create an instance of {@link CP }
     * 
     */
    public CP createCP() {
        return new CP();
    }

    /**
     * Create an instance of {@link CPChanges }
     * 
     */
    public CPChanges createCPChanges() {
        return new CPChanges();
    }

    /**
     * Create an instance of {@link KP }
     * 
     */
    public KP createKP() {
        return new KP();
    }

    /**
     * Create an instance of {@link BatchCardCustomization }
     * 
     */
    public BatchCardCustomization createBatchCardCustomization() {
        return new BatchCardCustomization();
    }

    /**
     * Create an instance of {@link GetSECapabilityProfileIdRequestType }
     * 
     */
    public GetSECapabilityProfileIdRequestType createGetSECapabilityProfileIdRequestType() {
        return new GetSECapabilityProfileIdRequestType();
    }

    /**
     * Create an instance of {@link CheckMobileSubscriptionEligibilityRequestType }
     * 
     */
    public CheckMobileSubscriptionEligibilityRequestType createCheckMobileSubscriptionEligibilityRequestType() {
        return new CheckMobileSubscriptionEligibilityRequestType();
    }

    /**
     * Create an instance of {@link HandleStartServiceStateChangeNotificationRequestType }
     * 
     */
    public HandleStartServiceStateChangeNotificationRequestType createHandleStartServiceStateChangeNotificationRequestType() {
        return new HandleStartServiceStateChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionAlternateIdentifierRequestType }
     * 
     */
    public GetMobileSubscriptionAlternateIdentifierRequestType createGetMobileSubscriptionAlternateIdentifierRequestType() {
        return new GetMobileSubscriptionAlternateIdentifierRequestType();
    }

    /**
     * Create an instance of {@link HandleSERenewalNotificationRequestType }
     * 
     */
    public HandleSERenewalNotificationRequestType createHandleSERenewalNotificationRequestType() {
        return new HandleSERenewalNotificationRequestType();
    }

    /**
     * Create an instance of {@link SECommandsGenerationAndRemoteExecutionResponseType }
     * 
     */
    public SECommandsGenerationAndRemoteExecutionResponseType createSECommandsGenerationAndRemoteExecutionResponseType() {
        return new SECommandsGenerationAndRemoteExecutionResponseType();
    }

    /**
     * Create an instance of {@link BeginConversationRequestType }
     * 
     */
    public BeginConversationRequestType createBeginConversationRequestType() {
        return new BeginConversationRequestType();
    }

    /**
     * Create an instance of {@link SendScriptRequestType }
     * 
     */
    public SendScriptRequestType createSendScriptRequestType() {
        return new SendScriptRequestType();
    }

    /**
     * Create an instance of {@link GetApplicationOrELFStatusResponseType }
     * 
     */
    public GetApplicationOrELFStatusResponseType createGetApplicationOrELFStatusResponseType() {
        return new GetApplicationOrELFStatusResponseType();
    }

    /**
     * Create an instance of {@link LoadSCWSServicePortalRequestType }
     * 
     */
    public LoadSCWSServicePortalRequestType createLoadSCWSServicePortalRequestType() {
        return new LoadSCWSServicePortalRequestType();
    }

    /**
     * Create an instance of {@link BindDeviceApplicationToSEApplicationResponseType }
     * 
     */
    public BindDeviceApplicationToSEApplicationResponseType createBindDeviceApplicationToSEApplicationResponseType() {
        return new BindDeviceApplicationToSEApplicationResponseType();
    }

    /**
     * Create an instance of {@link CIN }
     * 
     */
    public CIN createCIN() {
        return new CIN();
    }

    /**
     * Create an instance of {@link CCMCommandStatusType }
     * 
     */
    public CCMCommandStatusType createCCMCommandStatusType() {
        return new CCMCommandStatusType();
    }

    /**
     * Create an instance of {@link CCCMScenario2BCreateFirstSSDKeysetCommandType }
     * 
     */
    public CCCMScenario2BCreateFirstSSDKeysetCommandType createCCCMScenario2BCreateFirstSSDKeysetCommandType() {
        return new CCCMScenario2BCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link CCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public CCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType createCCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType() {
        return new CCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link CommandStatusCodeDataType }
     * 
     */
    public CommandStatusCodeDataType createCommandStatusCodeDataType() {
        return new CommandStatusCodeDataType();
    }

    /**
     * Create an instance of {@link ExtraditeCommandType }
     * 
     */
    public ExtraditeCommandType createExtraditeCommandType() {
        return new ExtraditeCommandType();
    }

    /**
     * Create an instance of {@link CCCMScenario2BCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public CCCMScenario2BCreateFirstSSDKeysetCommandResponseType createCCCMScenario2BCreateFirstSSDKeysetCommandResponseType() {
        return new CCCMScenario2BCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link BeginConversationResponseDataType }
     * 
     */
    public BeginConversationResponseDataType createBeginConversationResponseDataType() {
        return new BeginConversationResponseDataType();
    }

    /**
     * Create an instance of {@link BasicRandomCreateFirstSSDKeysetCommandType }
     * 
     */
    public BasicRandomCreateFirstSSDKeysetCommandType createBasicRandomCreateFirstSSDKeysetCommandType() {
        return new BasicRandomCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link LoadELFCommandType }
     * 
     */
    public LoadELFCommandType createLoadELFCommandType() {
        return new LoadELFCommandType();
    }

    /**
     * Create an instance of {@link GetDeviceCapabilityProfileIdResponseDataType }
     * 
     */
    public GetDeviceCapabilityProfileIdResponseDataType createGetDeviceCapabilityProfileIdResponseDataType() {
        return new GetDeviceCapabilityProfileIdResponseDataType();
    }

    /**
     * Create an instance of {@link CheckMobileSubscriptionEligibilityResponseDataType }
     * 
     */
    public CheckMobileSubscriptionEligibilityResponseDataType createCheckMobileSubscriptionEligibilityResponseDataType() {
        return new CheckMobileSubscriptionEligibilityResponseDataType();
    }

    /**
     * Create an instance of {@link DeleteDeviceApplicationResponseDataType }
     * 
     */
    public DeleteDeviceApplicationResponseDataType createDeleteDeviceApplicationResponseDataType() {
        return new DeleteDeviceApplicationResponseDataType();
    }

    /**
     * Create an instance of {@link GetCAInformationResponseDataType }
     * 
     */
    public GetCAInformationResponseDataType createGetCAInformationResponseDataType() {
        return new GetCAInformationResponseDataType();
    }

    /**
     * Create an instance of {@link InstantiateApplicationCommandType }
     * 
     */
    public InstantiateApplicationCommandType createInstantiateApplicationCommandType() {
        return new InstantiateApplicationCommandType();
    }

    /**
     * Create an instance of {@link ApplicationRegistryUpdateCommandType }
     * 
     */
    public ApplicationRegistryUpdateCommandType createApplicationRegistryUpdateCommandType() {
        return new ApplicationRegistryUpdateCommandType();
    }

    /**
     * Create an instance of {@link MobileNFCServiceResultContextType }
     * 
     */
    public MobileNFCServiceResultContextType createMobileNFCServiceResultContextType() {
        return new MobileNFCServiceResultContextType();
    }

    /**
     * Create an instance of {@link ELFComponentStatusType }
     * 
     */
    public ELFComponentStatusType createELFComponentStatusType() {
        return new ELFComponentStatusType();
    }

    /**
     * Create an instance of {@link ServiceVersionType }
     * 
     */
    public ServiceVersionType createServiceVersionType() {
        return new ServiceVersionType();
    }

    /**
     * Create an instance of {@link SEIdGenericType }
     * 
     */
    public SEIdGenericType createSEIdGenericType() {
        return new SEIdGenericType();
    }

    /**
     * Create an instance of {@link ServiceQualifierType }
     * 
     */
    public ServiceQualifierType createServiceQualifierType() {
        return new ServiceQualifierType();
    }

    /**
     * Create an instance of {@link GenerateDMTokenResponseDataType }
     * 
     */
    public GenerateDMTokenResponseDataType createGenerateDMTokenResponseDataType() {
        return new GenerateDMTokenResponseDataType();
    }

    /**
     * Create an instance of {@link CCCMScenario2ACreateFirstSSDKeysetCommandType }
     * 
     */
    public CCCMScenario2ACreateFirstSSDKeysetCommandType createCCCMScenario2ACreateFirstSSDKeysetCommandType() {
        return new CCCMScenario2ACreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link StatusCodeDataType }
     * 
     */
    public StatusCodeDataType createStatusCodeDataType() {
        return new StatusCodeDataType();
    }

    /**
     * Create an instance of {@link GetSEMobileSubscriptionIdentifierResponseDataType }
     * 
     */
    public GetSEMobileSubscriptionIdentifierResponseDataType createGetSEMobileSubscriptionIdentifierResponseDataType() {
        return new GetSEMobileSubscriptionIdentifierResponseDataType();
    }

    /**
     * Create an instance of {@link CCCMScenario2ACreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public CCCMScenario2ACreateFirstSSDKeysetCommandResponseType createCCCMScenario2ACreateFirstSSDKeysetCommandResponseType() {
        return new CCCMScenario2ACreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link BasicRequestType }
     * 
     */
    public BasicRequestType createBasicRequestType() {
        return new BasicRequestType();
    }

    /**
     * Create an instance of {@link BasicCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public BasicCreateFirstSSDKeysetCommandResponseType createBasicCreateFirstSSDKeysetCommandResponseType() {
        return new BasicCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link BasicRandomCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public BasicRandomCreateFirstSSDKeysetCommandResponseType createBasicRandomCreateFirstSSDKeysetCommandResponseType() {
        return new BasicRandomCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link CCCMScenario1UsingPKCreateFirstSSDKeysetCommandType }
     * 
     */
    public CCCMScenario1UsingPKCreateFirstSSDKeysetCommandType createCCCMScenario1UsingPKCreateFirstSSDKeysetCommandType() {
        return new CCCMScenario1UsingPKCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link GetApplicationOrELFStatusResponseDataType }
     * 
     */
    public GetApplicationOrELFStatusResponseDataType createGetApplicationOrELFStatusResponseDataType() {
        return new GetApplicationOrELFStatusResponseDataType();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionAlternateIdentifierResponseDataType }
     * 
     */
    public GetMobileSubscriptionAlternateIdentifierResponseDataType createGetMobileSubscriptionAlternateIdentifierResponseDataType() {
        return new GetMobileSubscriptionAlternateIdentifierResponseDataType();
    }

    /**
     * Create an instance of {@link CreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public CreateFirstSSDKeysetCommandResponseType createCreateFirstSSDKeysetCommandResponseType() {
        return new CreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link SEAppIdAIDType }
     * 
     */
    public SEAppIdAIDType createSEAppIdAIDType() {
        return new SEAppIdAIDType();
    }

    /**
     * Create an instance of {@link ServiceIdentifierType }
     * 
     */
    public ServiceIdentifierType createServiceIdentifierType() {
        return new ServiceIdentifierType();
    }

    /**
     * Create an instance of {@link SDComponentStatusType }
     * 
     */
    public SDComponentStatusType createSDComponentStatusType() {
        return new SDComponentStatusType();
    }

    /**
     * Create an instance of {@link SDKeyType }
     * 
     */
    public SDKeyType createSDKeyType() {
        return new SDKeyType();
    }

    /**
     * Create an instance of {@link GetSECapabilityProfileIdResponseDataType }
     * 
     */
    public GetSECapabilityProfileIdResponseDataType createGetSECapabilityProfileIdResponseDataType() {
        return new GetSECapabilityProfileIdResponseDataType();
    }

    /**
     * Create an instance of {@link ApplicationComponentStatusType }
     * 
     */
    public ApplicationComponentStatusType createApplicationComponentStatusType() {
        return new ApplicationComponentStatusType();
    }

    /**
     * Create an instance of {@link SEIdExtendableType }
     * 
     */
    public SEIdExtendableType createSEIdExtendableType() {
        return new SEIdExtendableType();
    }

    /**
     * Create an instance of {@link SendScriptResponseDataType }
     * 
     */
    public SendScriptResponseDataType createSendScriptResponseDataType() {
        return new SendScriptResponseDataType();
    }

    /**
     * Create an instance of {@link MSIdAliasType }
     * 
     */
    public MSIdAliasType createMSIdAliasType() {
        return new MSIdAliasType();
    }

    /**
     * Create an instance of {@link BasicResponseType }
     * 
     */
    public BasicResponseType createBasicResponseType() {
        return new BasicResponseType();
    }

    /**
     * Create an instance of {@link DeviceInstallationModeType }
     * 
     */
    public DeviceInstallationModeType createDeviceInstallationModeType() {
        return new DeviceInstallationModeType();
    }

    /**
     * Create an instance of {@link LoadDeviceApplicationResponseDataType }
     * 
     */
    public LoadDeviceApplicationResponseDataType createLoadDeviceApplicationResponseDataType() {
        return new LoadDeviceApplicationResponseDataType();
    }

    /**
     * Create an instance of {@link MobileNFCServiceContextType }
     * 
     */
    public MobileNFCServiceContextType createMobileNFCServiceContextType() {
        return new MobileNFCServiceContextType();
    }

    /**
     * Create an instance of {@link KeySetType }
     * 
     */
    public KeySetType createKeySetType() {
        return new KeySetType();
    }

    /**
     * Create an instance of {@link ExecutionStatusType }
     * 
     */
    public ExecutionStatusType createExecutionStatusType() {
        return new ExecutionStatusType();
    }

    /**
     * Create an instance of {@link MSIdMSISDNType }
     * 
     */
    public MSIdMSISDNType createMSIdMSISDNType() {
        return new MSIdMSISDNType();
    }

    /**
     * Create an instance of {@link DeviceDeletionModeType }
     * 
     */
    public DeviceDeletionModeType createDeviceDeletionModeType() {
        return new DeviceDeletionModeType();
    }

    /**
     * Create an instance of {@link CCMCommandType }
     * 
     */
    public CCMCommandType createCCMCommandType() {
        return new CCMCommandType();
    }

    /**
     * Create an instance of {@link MSIdGenericType }
     * 
     */
    public MSIdGenericType createMSIdGenericType() {
        return new MSIdGenericType();
    }

    /**
     * Create an instance of {@link SetStatusCommandType }
     * 
     */
    public SetStatusCommandType createSetStatusCommandType() {
        return new SetStatusCommandType();
    }

    /**
     * Create an instance of {@link SEIdCardUniqueDataType }
     * 
     */
    public SEIdCardUniqueDataType createSEIdCardUniqueDataType() {
        return new SEIdCardUniqueDataType();
    }

    /**
     * Create an instance of {@link DeleteCommandType }
     * 
     */
    public DeleteCommandType createDeleteCommandType() {
        return new DeleteCommandType();
    }

    /**
     * Create an instance of {@link InstantiateApplicationCommandResponseType }
     * 
     */
    public InstantiateApplicationCommandResponseType createInstantiateApplicationCommandResponseType() {
        return new InstantiateApplicationCommandResponseType();
    }

    /**
     * Create an instance of {@link DAPBlockType }
     * 
     */
    public DAPBlockType createDAPBlockType() {
        return new DAPBlockType();
    }

    /**
     * Create an instance of {@link MSIdExtendableType }
     * 
     */
    public MSIdExtendableType createMSIdExtendableType() {
        return new MSIdExtendableType();
    }

    /**
     * Create an instance of {@link SEIdICCIDType }
     * 
     */
    public SEIdICCIDType createSEIdICCIDType() {
        return new SEIdICCIDType();
    }

    /**
     * Create an instance of {@link SEAppIdTARType }
     * 
     */
    public SEAppIdTARType createSEAppIdTARType() {
        return new SEAppIdTARType();
    }

    /**
     * Create an instance of {@link BasicCreateFirstSSDKeysetCommandType }
     * 
     */
    public BasicCreateFirstSSDKeysetCommandType createBasicCreateFirstSSDKeysetCommandType() {
        return new BasicCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link ExtensionsType }
     * 
     */
    public ExtensionsType createExtensionsType() {
        return new ExtensionsType();
    }

    /**
     * Create an instance of {@link MakeSelectableApplicationCommandType }
     * 
     */
    public MakeSelectableApplicationCommandType createMakeSelectableApplicationCommandType() {
        return new MakeSelectableApplicationCommandType();
    }

    /**
     * Create an instance of {@link SECommandsGenerationAndRemoteExecutionResponseResponseDataType }
     * 
     */
    public SECommandsGenerationAndRemoteExecutionResponseResponseDataType createSECommandsGenerationAndRemoteExecutionResponseResponseDataType() {
        return new SECommandsGenerationAndRemoteExecutionResponseResponseDataType();
    }

    /**
     * Create an instance of {@link EnrollSSDOwnerCertificateResponseDataType }
     * 
     */
    public EnrollSSDOwnerCertificateResponseDataType createEnrollSSDOwnerCertificateResponseDataType() {
        return new EnrollSSDOwnerCertificateResponseDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadSCWSServicePortalRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "LoadSCWSServicePortalRequest")
    public JAXBElement<LoadSCWSServicePortalRequestType> createLoadSCWSServicePortalRequest(LoadSCWSServicePortalRequestType value) {
        return new JAXBElement<LoadSCWSServicePortalRequestType>(_LoadSCWSServicePortalRequest_QNAME, LoadSCWSServicePortalRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "ScriptFragment")
    public JAXBElement<String> createScriptFragment(String value) {
        return new JAXBElement<String>(_ScriptFragment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindDeviceApplicationToSEApplicationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "BindDeviceApplicationToSEApplicationResponse")
    public JAXBElement<BindDeviceApplicationToSEApplicationResponseType> createBindDeviceApplicationToSEApplicationResponse(BindDeviceApplicationToSEApplicationResponseType value) {
        return new JAXBElement<BindDeviceApplicationToSEApplicationResponseType>(_BindDeviceApplicationToSEApplicationResponse_QNAME, BindDeviceApplicationToSEApplicationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeginConversationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "BeginConversationRequest")
    public JAXBElement<BeginConversationRequestType> createBeginConversationRequest(BeginConversationRequestType value) {
        return new JAXBElement<BeginConversationRequestType>(_BeginConversationRequest_QNAME, BeginConversationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSERenewalNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "HandleSERenewalNotificationRequest")
    public JAXBElement<HandleSERenewalNotificationRequestType> createHandleSERenewalNotificationRequest(HandleSERenewalNotificationRequestType value) {
        return new JAXBElement<HandleSERenewalNotificationRequestType>(_HandleSERenewalNotificationRequest_QNAME, HandleSERenewalNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "ProfileUniqueID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createProfileUniqueID(byte[] value) {
        return new JAXBElement<byte[]>(_ProfileUniqueID_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SECommandsGenerationAndRemoteExecutionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "SECommandsGenerationAndRemoteExecutionResponse")
    public JAXBElement<SECommandsGenerationAndRemoteExecutionResponseType> createSECommandsGenerationAndRemoteExecutionResponse(SECommandsGenerationAndRemoteExecutionResponseType value) {
        return new JAXBElement<SECommandsGenerationAndRemoteExecutionResponseType>(_SECommandsGenerationAndRemoteExecutionResponse_QNAME, SECommandsGenerationAndRemoteExecutionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendScriptRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "SendScriptRequest")
    public JAXBElement<SendScriptRequestType> createSendScriptRequest(SendScriptRequestType value) {
        return new JAXBElement<SendScriptRequestType>(_SendScriptRequest_QNAME, SendScriptRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationOrELFStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetApplicationOrELFStatusResponse")
    public JAXBElement<GetApplicationOrELFStatusResponseType> createGetApplicationOrELFStatusResponse(GetApplicationOrELFStatusResponseType value) {
        return new JAXBElement<GetApplicationOrELFStatusResponseType>(_GetApplicationOrELFStatusResponse_QNAME, GetApplicationOrELFStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMobileSubscriptionEligibilityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "CheckMobileSubscriptionEligibilityRequest")
    public JAXBElement<CheckMobileSubscriptionEligibilityRequestType> createCheckMobileSubscriptionEligibilityRequest(CheckMobileSubscriptionEligibilityRequestType value) {
        return new JAXBElement<CheckMobileSubscriptionEligibilityRequestType>(_CheckMobileSubscriptionEligibilityRequest_QNAME, CheckMobileSubscriptionEligibilityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSECapabilityProfileIdRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetSECapabilityProfileIdRequest")
    public JAXBElement<GetSECapabilityProfileIdRequestType> createGetSECapabilityProfileIdRequest(GetSECapabilityProfileIdRequestType value) {
        return new JAXBElement<GetSECapabilityProfileIdRequestType>(_GetSECapabilityProfileIdRequest_QNAME, GetSECapabilityProfileIdRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileSubscriptionAlternateIdentifierRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetMobileSubscriptionAlternateIdentifierRequest")
    public JAXBElement<GetMobileSubscriptionAlternateIdentifierRequestType> createGetMobileSubscriptionAlternateIdentifierRequest(GetMobileSubscriptionAlternateIdentifierRequestType value) {
        return new JAXBElement<GetMobileSubscriptionAlternateIdentifierRequestType>(_GetMobileSubscriptionAlternateIdentifierRequest_QNAME, GetMobileSubscriptionAlternateIdentifierRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndConversationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "EndConversationRequest")
    public JAXBElement<EndConversationRequestType> createEndConversationRequest(EndConversationRequestType value) {
        return new JAXBElement<EndConversationRequestType>(_EndConversationRequest_QNAME, EndConversationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateDMTokenRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GenerateDMTokenRequest")
    public JAXBElement<GenerateDMTokenRequestType> createGenerateDMTokenRequest(GenerateDMTokenRequestType value) {
        return new JAXBElement<GenerateDMTokenRequestType>(_GenerateDMTokenRequest_QNAME, GenerateDMTokenRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMobileSubscriptionEligibilityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "CheckMobileSubscriptionEligibilityResponse")
    public JAXBElement<CheckMobileSubscriptionEligibilityResponseType> createCheckMobileSubscriptionEligibilityResponse(CheckMobileSubscriptionEligibilityResponseType value) {
        return new JAXBElement<CheckMobileSubscriptionEligibilityResponseType>(_CheckMobileSubscriptionEligibilityResponse_QNAME, CheckMobileSubscriptionEligibilityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleStartServiceStateChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "HandleStartServiceStateChangeNotificationRequest")
    public JAXBElement<HandleStartServiceStateChangeNotificationRequestType> createHandleStartServiceStateChangeNotificationRequest(HandleStartServiceStateChangeNotificationRequestType value) {
        return new JAXBElement<HandleStartServiceStateChangeNotificationRequestType>(_HandleStartServiceStateChangeNotificationRequest_QNAME, HandleStartServiceStateChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleMobileSubscriptionStatusChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "HandleMobileSubscriptionStatusChangeNotificationRequest")
    public JAXBElement<HandleMobileSubscriptionStatusChangeNotificationRequestType> createHandleMobileSubscriptionStatusChangeNotificationRequest(HandleMobileSubscriptionStatusChangeNotificationRequestType value) {
        return new JAXBElement<HandleMobileSubscriptionStatusChangeNotificationRequestType>(_HandleMobileSubscriptionStatusChangeNotificationRequest_QNAME, HandleMobileSubscriptionStatusChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSEMobileSubscriptionIdentifierRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetSEMobileSubscriptionIdentifierRequest")
    public JAXBElement<GetSEMobileSubscriptionIdentifierRequestType> createGetSEMobileSubscriptionIdentifierRequest(GetSEMobileSubscriptionIdentifierRequestType value) {
        return new JAXBElement<GetSEMobileSubscriptionIdentifierRequestType>(_GetSEMobileSubscriptionIdentifierRequest_QNAME, GetSEMobileSubscriptionIdentifierRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "CardLifeCycleState")
    public JAXBElement<String> createCardLifeCycleState(String value) {
        return new JAXBElement<String>(_CardLifeCycleState_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendScriptResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "SendScriptResponse")
    public JAXBElement<SendScriptResponseType> createSendScriptResponse(SendScriptResponseType value) {
        return new JAXBElement<SendScriptResponseType>(_SendScriptResponse_QNAME, SendScriptResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCAInformationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetCAInformationResponse")
    public JAXBElement<GetCAInformationResponseType> createGetCAInformationResponse(GetCAInformationResponseType value) {
        return new JAXBElement<GetCAInformationResponseType>(_GetCAInformationResponse_QNAME, GetCAInformationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDeviceApplicationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "LoadDeviceApplicationRequest")
    public JAXBElement<LoadDeviceApplicationRequestType> createLoadDeviceApplicationRequest(LoadDeviceApplicationRequestType value) {
        return new JAXBElement<LoadDeviceApplicationRequestType>(_LoadDeviceApplicationRequest_QNAME, LoadDeviceApplicationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "DeliveryDate")
    public JAXBElement<Object> createDeliveryDate(Object value) {
        return new JAXBElement<Object>(_DeliveryDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSECapabilityProfileIdResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetSECapabilityProfileIdResponse")
    public JAXBElement<GetSECapabilityProfileIdResponseType> createGetSECapabilityProfileIdResponse(GetSECapabilityProfileIdResponseType value) {
        return new JAXBElement<GetSECapabilityProfileIdResponseType>(_GetSECapabilityProfileIdResponse_QNAME, GetSECapabilityProfileIdResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSEMobileSubscriptionChangedNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "HandleSEMobileSubscriptionChangedNotificationRequest")
    public JAXBElement<HandleSEMobileSubscriptionChangedNotificationRequestType> createHandleSEMobileSubscriptionChangedNotificationRequest(HandleSEMobileSubscriptionChangedNotificationRequestType value) {
        return new JAXBElement<HandleSEMobileSubscriptionChangedNotificationRequestType>(_HandleSEMobileSubscriptionChangedNotificationRequest_QNAME, HandleSEMobileSubscriptionChangedNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SECommandsGenerationAndRemoteExecutionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "SECommandsGenerationAndRemoteExecutionRequest")
    public JAXBElement<SECommandsGenerationAndRemoteExecutionRequestType> createSECommandsGenerationAndRemoteExecutionRequest(SECommandsGenerationAndRemoteExecutionRequestType value) {
        return new JAXBElement<SECommandsGenerationAndRemoteExecutionRequestType>(_SECommandsGenerationAndRemoteExecutionRequest_QNAME, SECommandsGenerationAndRemoteExecutionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndConversationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "EndConversationResponse")
    public JAXBElement<EndConversationResponseType> createEndConversationResponse(EndConversationResponseType value) {
        return new JAXBElement<EndConversationResponseType>(_EndConversationResponse_QNAME, EndConversationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "MuteCardsNumber")
    public JAXBElement<Short> createMuteCardsNumber(Short value) {
        return new JAXBElement<Short>(_MuteCardsNumber_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "ExpectedDeliveryDate")
    public JAXBElement<Object> createExpectedDeliveryDate(Object value) {
        return new JAXBElement<Object>(_ExpectedDeliveryDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollSSDOwnerCertificateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "EnrollSSDOwnerCertificateRequest")
    public JAXBElement<EnrollSSDOwnerCertificateRequestType> createEnrollSSDOwnerCertificateRequest(EnrollSSDOwnerCertificateRequestType value) {
        return new JAXBElement<EnrollSSDOwnerCertificateRequestType>(_EnrollSSDOwnerCertificateRequest_QNAME, EnrollSSDOwnerCertificateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "ValidCardProfileID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createValidCardProfileID(byte[] value) {
        return new JAXBElement<byte[]>(_ValidCardProfileID_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyDMReceiptRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "VerifyDMReceiptRequest")
    public JAXBElement<VerifyDMReceiptRequestType> createVerifyDMReceiptRequest(VerifyDMReceiptRequestType value) {
        return new JAXBElement<VerifyDMReceiptRequestType>(_VerifyDMReceiptRequest_QNAME, VerifyDMReceiptRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleEndServiceStateChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "HandleEndServiceStateChangeNotificationRequest")
    public JAXBElement<HandleEndServiceStateChangeNotificationRequestType> createHandleEndServiceStateChangeNotificationRequest(HandleEndServiceStateChangeNotificationRequestType value) {
        return new JAXBElement<HandleEndServiceStateChangeNotificationRequestType>(_HandleEndServiceStateChangeNotificationRequest_QNAME, HandleEndServiceStateChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSEDeviceChangedNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "HandleSEDeviceChangedNotificationRequest")
    public JAXBElement<HandleSEDeviceChangedNotificationRequestType> createHandleSEDeviceChangedNotificationRequest(HandleSEDeviceChangedNotificationRequestType value) {
        return new JAXBElement<HandleSEDeviceChangedNotificationRequestType>(_HandleSEDeviceChangedNotificationRequest_QNAME, HandleSEDeviceChangedNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDeviceApplicationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "DeleteDeviceApplicationRequest")
    public JAXBElement<DeleteDeviceApplicationRequestType> createDeleteDeviceApplicationRequest(DeleteDeviceApplicationRequestType value) {
        return new JAXBElement<DeleteDeviceApplicationRequestType>(_DeleteDeviceApplicationRequest_QNAME, DeleteDeviceApplicationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleMobileSubscriptionIdentifierChangedNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "HandleMobileSubscriptionIdentifierChangedNotificationRequest")
    public JAXBElement<HandleMobileSubscriptionIdentifierChangedNotificationRequestType> createHandleMobileSubscriptionIdentifierChangedNotificationRequest(HandleMobileSubscriptionIdentifierChangedNotificationRequestType value) {
        return new JAXBElement<HandleMobileSubscriptionIdentifierChangedNotificationRequestType>(_HandleMobileSubscriptionIdentifierChangedNotificationRequest_QNAME, HandleMobileSubscriptionIdentifierChangedNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSCWSServicePortalResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "DeleteSCWSServicePortalResponse")
    public JAXBElement<DeleteSCWSServicePortalResponseType> createDeleteSCWSServicePortalResponse(DeleteSCWSServicePortalResponseType value) {
        return new JAXBElement<DeleteSCWSServicePortalResponseType>(_DeleteSCWSServicePortalResponse_QNAME, DeleteSCWSServicePortalResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationOrELFStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetApplicationOrELFStatusRequest")
    public JAXBElement<GetApplicationOrELFStatusRequestType> createGetApplicationOrELFStatusRequest(GetApplicationOrELFStatusRequestType value) {
        return new JAXBElement<GetApplicationOrELFStatusRequestType>(_GetApplicationOrELFStatusRequest_QNAME, GetApplicationOrELFStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCAInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetCAInformationRequest")
    public JAXBElement<GetCAInformationRequestType> createGetCAInformationRequest(GetCAInformationRequestType value) {
        return new JAXBElement<GetCAInformationRequestType>(_GetCAInformationRequest_QNAME, GetCAInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyDMReceiptResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "VerifyDMReceiptResponse")
    public JAXBElement<VerifyDMReceiptResponseType> createVerifyDMReceiptResponse(VerifyDMReceiptResponseType value) {
        return new JAXBElement<VerifyDMReceiptResponseType>(_VerifyDMReceiptResponse_QNAME, VerifyDMReceiptResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSCWSServicePortalRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "DeleteSCWSServicePortalRequest")
    public JAXBElement<DeleteSCWSServicePortalRequestType> createDeleteSCWSServicePortalRequest(DeleteSCWSServicePortalRequestType value) {
        return new JAXBElement<DeleteSCWSServicePortalRequestType>(_DeleteSCWSServicePortalRequest_QNAME, DeleteSCWSServicePortalRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnbindDeviceApplicationToSEApplicationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "UnbindDeviceApplicationToSEApplicationResponse")
    public JAXBElement<UnbindDeviceApplicationToSEApplicationResponseType> createUnbindDeviceApplicationToSEApplicationResponse(UnbindDeviceApplicationToSEApplicationResponseType value) {
        return new JAXBElement<UnbindDeviceApplicationToSEApplicationResponseType>(_UnbindDeviceApplicationToSEApplicationResponse_QNAME, UnbindDeviceApplicationToSEApplicationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "URL")
    public JAXBElement<Object> createURL(Object value) {
        return new JAXBElement<Object>(_URL_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "eMail")
    public JAXBElement<Object> createEMail(Object value) {
        return new JAXBElement<Object>(_EMail_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "FaxNumber")
    public JAXBElement<Object> createFaxNumber(Object value) {
        return new JAXBElement<Object>(_FaxNumber_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadSCWSServicePortalResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "LoadSCWSServicePortalResponse")
    public JAXBElement<LoadSCWSServicePortalResponseType> createLoadSCWSServicePortalResponse(LoadSCWSServicePortalResponseType value) {
        return new JAXBElement<LoadSCWSServicePortalResponseType>(_LoadSCWSServicePortalResponse_QNAME, LoadSCWSServicePortalResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "PhoneNumber")
    public JAXBElement<Object> createPhoneNumber(Object value) {
        return new JAXBElement<Object>(_PhoneNumber_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeginConversationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "BeginConversationResponse")
    public JAXBElement<BeginConversationResponseType> createBeginConversationResponse(BeginConversationResponseType value) {
        return new JAXBElement<BeginConversationResponseType>(_BeginConversationResponse_QNAME, BeginConversationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "ApplicationProfileUniqueID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createApplicationProfileUniqueID(byte[] value) {
        return new JAXBElement<byte[]>(_ApplicationProfileUniqueID_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSEStatusChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "HandleSEStatusChangeNotificationRequest")
    public JAXBElement<HandleSEStatusChangeNotificationRequestType> createHandleSEStatusChangeNotificationRequest(HandleSEStatusChangeNotificationRequestType value) {
        return new JAXBElement<HandleSEStatusChangeNotificationRequestType>(_HandleSEStatusChangeNotificationRequest_QNAME, HandleSEStatusChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceCapabilityProfileIdRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetDeviceCapabilityProfileIdRequest")
    public JAXBElement<GetDeviceCapabilityProfileIdRequestType> createGetDeviceCapabilityProfileIdRequest(GetDeviceCapabilityProfileIdRequestType value) {
        return new JAXBElement<GetDeviceCapabilityProfileIdRequestType>(_GetDeviceCapabilityProfileIdRequest_QNAME, GetDeviceCapabilityProfileIdRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollSSDOwnerCertificateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "EnrollSSDOwnerCertificateResponse")
    public JAXBElement<EnrollSSDOwnerCertificateResponseType> createEnrollSSDOwnerCertificateResponse(EnrollSSDOwnerCertificateResponseType value) {
        return new JAXBElement<EnrollSSDOwnerCertificateResponseType>(_EnrollSSDOwnerCertificateResponse_QNAME, EnrollSSDOwnerCertificateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateDMTokenResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GenerateDMTokenResponse")
    public JAXBElement<GenerateDMTokenResponseType> createGenerateDMTokenResponse(GenerateDMTokenResponseType value) {
        return new JAXBElement<GenerateDMTokenResponseType>(_GenerateDMTokenResponse_QNAME, GenerateDMTokenResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDeviceApplicationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "LoadDeviceApplicationResponse")
    public JAXBElement<LoadDeviceApplicationResponseType> createLoadDeviceApplicationResponse(LoadDeviceApplicationResponseType value) {
        return new JAXBElement<LoadDeviceApplicationResponseType>(_LoadDeviceApplicationResponse_QNAME, LoadDeviceApplicationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileSubscriptionAlternateIdentifierResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetMobileSubscriptionAlternateIdentifierResponse")
    public JAXBElement<GetMobileSubscriptionAlternateIdentifierResponseType> createGetMobileSubscriptionAlternateIdentifierResponse(GetMobileSubscriptionAlternateIdentifierResponseType value) {
        return new JAXBElement<GetMobileSubscriptionAlternateIdentifierResponseType>(_GetMobileSubscriptionAlternateIdentifierResponse_QNAME, GetMobileSubscriptionAlternateIdentifierResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindDeviceApplicationToSEApplicationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "BindDeviceApplicationToSEApplicationRequest")
    public JAXBElement<BindDeviceApplicationToSEApplicationRequestType> createBindDeviceApplicationToSEApplicationRequest(BindDeviceApplicationToSEApplicationRequestType value) {
        return new JAXBElement<BindDeviceApplicationToSEApplicationRequestType>(_BindDeviceApplicationToSEApplicationRequest_QNAME, BindDeviceApplicationToSEApplicationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceCapabilityProfileIdResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetDeviceCapabilityProfileIdResponse")
    public JAXBElement<GetDeviceCapabilityProfileIdResponseType> createGetDeviceCapabilityProfileIdResponse(GetDeviceCapabilityProfileIdResponseType value) {
        return new JAXBElement<GetDeviceCapabilityProfileIdResponseType>(_GetDeviceCapabilityProfileIdResponse_QNAME, GetDeviceCapabilityProfileIdResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSEMobileSubscriptionIdentifierResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "GetSEMobileSubscriptionIdentifierResponse")
    public JAXBElement<GetSEMobileSubscriptionIdentifierResponseType> createGetSEMobileSubscriptionIdentifierResponse(GetSEMobileSubscriptionIdentifierResponseType value) {
        return new JAXBElement<GetSEMobileSubscriptionIdentifierResponseType>(_GetSEMobileSubscriptionIdentifierResponse_QNAME, GetSEMobileSubscriptionIdentifierResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnbindDeviceApplicationToSEApplicationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "UnbindDeviceApplicationToSEApplicationRequest")
    public JAXBElement<UnbindDeviceApplicationToSEApplicationRequestType> createUnbindDeviceApplicationToSEApplicationRequest(UnbindDeviceApplicationToSEApplicationRequestType value) {
        return new JAXBElement<UnbindDeviceApplicationToSEApplicationRequestType>(_UnbindDeviceApplicationToSEApplicationRequest_QNAME, UnbindDeviceApplicationToSEApplicationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDeviceApplicationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.0.1", name = "DeleteDeviceApplicationResponse")
    public JAXBElement<DeleteDeviceApplicationResponseType> createDeleteDeviceApplicationResponse(DeleteDeviceApplicationResponseType value) {
        return new JAXBElement<DeleteDeviceApplicationResponseType>(_DeleteDeviceApplicationResponse_QNAME, DeleteDeviceApplicationResponseType.class, null, value);
    }

}
