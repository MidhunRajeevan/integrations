
package rta.adv.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rta.adv.service package. 
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

    private final static QName _SyncTradeLicense_QNAME = new QName("http://service.adv.rta", "syncTradeLicense");
    private final static QName _SyncTradeLicenseResponse_QNAME = new QName("http://service.adv.rta", "syncTradeLicenseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rta.adv.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SyncTradeLicense }
     * 
     */
    public SyncTradeLicense createSyncTradeLicense() {
        return new SyncTradeLicense();
    }

    /**
     * Create an instance of {@link SyncTradeLicenseResponse }
     * 
     */
    public SyncTradeLicenseResponse createSyncTradeLicenseResponse() {
        return new SyncTradeLicenseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncTradeLicense }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SyncTradeLicense }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.adv.rta", name = "syncTradeLicense")
    public JAXBElement<SyncTradeLicense> createSyncTradeLicense(SyncTradeLicense value) {
        return new JAXBElement<SyncTradeLicense>(_SyncTradeLicense_QNAME, SyncTradeLicense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncTradeLicenseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SyncTradeLicenseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.adv.rta", name = "syncTradeLicenseResponse")
    public JAXBElement<SyncTradeLicenseResponse> createSyncTradeLicenseResponse(SyncTradeLicenseResponse value) {
        return new JAXBElement<SyncTradeLicenseResponse>(_SyncTradeLicenseResponse_QNAME, SyncTradeLicenseResponse.class, null, value);
    }

}
