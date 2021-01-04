
package ae.rta.activematrix.degintegration.tradelicensewsdl._1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ae.rta.activematrix.degintegration.tradelicense._1_0.FaultMessage;
import ae.rta.activematrix.degintegration.tradelicense._1_0.GetTradeLicenseStatusRequest;
import ae.rta.activematrix.degintegration.tradelicense._1_0.GetTradeLicenseStatusResponse;
import ae.rta.activematrix.degintegration.tradelicense._1_0.ValidateTradeLicenseRequest;
import ae.rta.activematrix.degintegration.tradelicense._1_0.ValidateTradeLicenseResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ae.rta.activematrix.degintegration.tradelicensewsdl._1_0 package. 
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

    private final static QName _ValidateTradeLicenseFault_QNAME = new QName("http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", "ValidateTradeLicenseFault");
    private final static QName _ValidateTradeLicenseRequest_QNAME = new QName("http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", "ValidateTradeLicenseRequest");
    private final static QName _ValidateTradeLicenseResponse_QNAME = new QName("http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", "ValidateTradeLicenseResponse");
    private final static QName _GetTradeLicenseStatusFault_QNAME = new QName("http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", "getTradeLicenseStatusFault");
    private final static QName _GetTradeLicenseStatusRequest_QNAME = new QName("http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", "getTradeLicenseStatusRequest");
    private final static QName _GetTradeLicenseStatusResponse_QNAME = new QName("http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", "getTradeLicenseStatusResponse");
    private final static QName _RetrieveTradeLicenseFault_QNAME = new QName("http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", "retrieveTradeLicenseFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ae.rta.activematrix.degintegration.tradelicensewsdl._1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", name = "ValidateTradeLicenseFault")
    public JAXBElement<FaultMessage> createValidateTradeLicenseFault(FaultMessage value) {
        return new JAXBElement<FaultMessage>(_ValidateTradeLicenseFault_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateTradeLicenseRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateTradeLicenseRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", name = "ValidateTradeLicenseRequest")
    public JAXBElement<ValidateTradeLicenseRequest> createValidateTradeLicenseRequest(ValidateTradeLicenseRequest value) {
        return new JAXBElement<ValidateTradeLicenseRequest>(_ValidateTradeLicenseRequest_QNAME, ValidateTradeLicenseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateTradeLicenseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateTradeLicenseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", name = "ValidateTradeLicenseResponse")
    public JAXBElement<ValidateTradeLicenseResponse> createValidateTradeLicenseResponse(ValidateTradeLicenseResponse value) {
        return new JAXBElement<ValidateTradeLicenseResponse>(_ValidateTradeLicenseResponse_QNAME, ValidateTradeLicenseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", name = "getTradeLicenseStatusFault")
    public JAXBElement<FaultMessage> createGetTradeLicenseStatusFault(FaultMessage value) {
        return new JAXBElement<FaultMessage>(_GetTradeLicenseStatusFault_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeLicenseStatusRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeLicenseStatusRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", name = "getTradeLicenseStatusRequest")
    public JAXBElement<GetTradeLicenseStatusRequest> createGetTradeLicenseStatusRequest(GetTradeLicenseStatusRequest value) {
        return new JAXBElement<GetTradeLicenseStatusRequest>(_GetTradeLicenseStatusRequest_QNAME, GetTradeLicenseStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeLicenseStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeLicenseStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", name = "getTradeLicenseStatusResponse")
    public JAXBElement<GetTradeLicenseStatusResponse> createGetTradeLicenseStatusResponse(GetTradeLicenseStatusResponse value) {
        return new JAXBElement<GetTradeLicenseStatusResponse>(_GetTradeLicenseStatusResponse_QNAME, GetTradeLicenseStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicenseWSDL/1_0", name = "retrieveTradeLicenseFault")
    public JAXBElement<FaultMessage> createRetrieveTradeLicenseFault(FaultMessage value) {
        return new JAXBElement<FaultMessage>(_RetrieveTradeLicenseFault_QNAME, FaultMessage.class, null, value);
    }

}
