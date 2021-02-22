
package eip.integrations.shared.definition.commertialinstitutedetails;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eip.integrations.shared.definition.commertialinstitutedetails package. 
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

    private final static QName _Fault_QNAME = new QName("http://www.rta.ae/ActiveMatrix/ESB/faultault/faultSchema", "Fault");
    private final static QName _GetCommercialInstituteDetailsRequest_QNAME = new QName("http://http://www.rta.ae/EIP/LACommercialInstituteDetailsService/LACommercialInstituteDetailsServiceSchema", "getCommercialInstituteDetailsRequest");
    private final static QName _GetCommercialInstituteDetailsResponse_QNAME = new QName("http://http://www.rta.ae/EIP/LACommercialInstituteDetailsService/LACommercialInstituteDetailsServiceSchema", "getCommercialInstituteDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eip.integrations.shared.definition.commertialinstitutedetails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompanyDetailResponseType }
     * 
     */
    public CompanyDetailResponseType createCompanyDetailResponseType() {
        return new CompanyDetailResponseType();
    }

    /**
     * Create an instance of {@link GetCommercialInstituteDetailsRequestType }
     * 
     */
    public GetCommercialInstituteDetailsRequestType createGetCommercialInstituteDetailsRequestType() {
        return new GetCommercialInstituteDetailsRequestType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link GetCommercialInstituteDetailsResponseType }
     * 
     */
    public GetCommercialInstituteDetailsResponseType createGetCommercialInstituteDetailsResponseType() {
        return new GetCommercialInstituteDetailsResponseType();
    }

    /**
     * Create an instance of {@link CompanyDetailResponseBodyType }
     * 
     */
    public CompanyDetailResponseBodyType createCompanyDetailResponseBodyType() {
        return new CompanyDetailResponseBodyType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link CompanyDetailResponseType.ResponseType }
     * 
     */
    public CompanyDetailResponseType.ResponseType createCompanyDetailResponseTypeResponseType() {
        return new CompanyDetailResponseType.ResponseType();
    }

    /**
     * Create an instance of {@link GetCommercialInstituteDetailsRequestType.Period }
     * 
     */
    public GetCommercialInstituteDetailsRequestType.Period createGetCommercialInstituteDetailsRequestTypePeriod() {
        return new GetCommercialInstituteDetailsRequestType.Period();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.rta.ae/ActiveMatrix/ESB/faultault/faultSchema", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommercialInstituteDetailsRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCommercialInstituteDetailsRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://http://www.rta.ae/EIP/LACommercialInstituteDetailsService/LACommercialInstituteDetailsServiceSchema", name = "getCommercialInstituteDetailsRequest")
    public JAXBElement<GetCommercialInstituteDetailsRequestType> createGetCommercialInstituteDetailsRequest(GetCommercialInstituteDetailsRequestType value) {
        return new JAXBElement<GetCommercialInstituteDetailsRequestType>(_GetCommercialInstituteDetailsRequest_QNAME, GetCommercialInstituteDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommercialInstituteDetailsResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCommercialInstituteDetailsResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://http://www.rta.ae/EIP/LACommercialInstituteDetailsService/LACommercialInstituteDetailsServiceSchema", name = "getCommercialInstituteDetailsResponse")
    public JAXBElement<GetCommercialInstituteDetailsResponseType> createGetCommercialInstituteDetailsResponse(GetCommercialInstituteDetailsResponseType value) {
        return new JAXBElement<GetCommercialInstituteDetailsResponseType>(_GetCommercialInstituteDetailsResponse_QNAME, GetCommercialInstituteDetailsResponseType.class, null, value);
    }

}
