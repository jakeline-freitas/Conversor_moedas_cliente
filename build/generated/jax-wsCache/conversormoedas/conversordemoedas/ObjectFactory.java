
package conversordemoedas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the conversordemoedas package. 
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

    private final static QName _DolarToReal_QNAME = new QName("http://conversordemoedas/", "dolarToReal");
    private final static QName _DolarToRealResponse_QNAME = new QName("http://conversordemoedas/", "dolarToRealResponse");
    private final static QName _EuriToReal_QNAME = new QName("http://conversordemoedas/", "euriToReal");
    private final static QName _EuriToRealResponse_QNAME = new QName("http://conversordemoedas/", "euriToRealResponse");
    private final static QName _RealToDolar_QNAME = new QName("http://conversordemoedas/", "realToDolar");
    private final static QName _RealToDolarResponse_QNAME = new QName("http://conversordemoedas/", "realToDolarResponse");
    private final static QName _RealToEuro_QNAME = new QName("http://conversordemoedas/", "realToEuro");
    private final static QName _RealToEuroResponse_QNAME = new QName("http://conversordemoedas/", "realToEuroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: conversordemoedas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DolarToReal }
     * 
     */
    public DolarToReal createDolarToReal() {
        return new DolarToReal();
    }

    /**
     * Create an instance of {@link DolarToRealResponse }
     * 
     */
    public DolarToRealResponse createDolarToRealResponse() {
        return new DolarToRealResponse();
    }

    /**
     * Create an instance of {@link EuriToReal }
     * 
     */
    public EuriToReal createEuriToReal() {
        return new EuriToReal();
    }

    /**
     * Create an instance of {@link EuriToRealResponse }
     * 
     */
    public EuriToRealResponse createEuriToRealResponse() {
        return new EuriToRealResponse();
    }

    /**
     * Create an instance of {@link RealToDolar }
     * 
     */
    public RealToDolar createRealToDolar() {
        return new RealToDolar();
    }

    /**
     * Create an instance of {@link RealToDolarResponse }
     * 
     */
    public RealToDolarResponse createRealToDolarResponse() {
        return new RealToDolarResponse();
    }

    /**
     * Create an instance of {@link RealToEuro }
     * 
     */
    public RealToEuro createRealToEuro() {
        return new RealToEuro();
    }

    /**
     * Create an instance of {@link RealToEuroResponse }
     * 
     */
    public RealToEuroResponse createRealToEuroResponse() {
        return new RealToEuroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarToReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversordemoedas/", name = "dolarToReal")
    public JAXBElement<DolarToReal> createDolarToReal(DolarToReal value) {
        return new JAXBElement<DolarToReal>(_DolarToReal_QNAME, DolarToReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarToRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversordemoedas/", name = "dolarToRealResponse")
    public JAXBElement<DolarToRealResponse> createDolarToRealResponse(DolarToRealResponse value) {
        return new JAXBElement<DolarToRealResponse>(_DolarToRealResponse_QNAME, DolarToRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuriToReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversordemoedas/", name = "euriToReal")
    public JAXBElement<EuriToReal> createEuriToReal(EuriToReal value) {
        return new JAXBElement<EuriToReal>(_EuriToReal_QNAME, EuriToReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuriToRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversordemoedas/", name = "euriToRealResponse")
    public JAXBElement<EuriToRealResponse> createEuriToRealResponse(EuriToRealResponse value) {
        return new JAXBElement<EuriToRealResponse>(_EuriToRealResponse_QNAME, EuriToRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToDolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversordemoedas/", name = "realToDolar")
    public JAXBElement<RealToDolar> createRealToDolar(RealToDolar value) {
        return new JAXBElement<RealToDolar>(_RealToDolar_QNAME, RealToDolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToDolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversordemoedas/", name = "realToDolarResponse")
    public JAXBElement<RealToDolarResponse> createRealToDolarResponse(RealToDolarResponse value) {
        return new JAXBElement<RealToDolarResponse>(_RealToDolarResponse_QNAME, RealToDolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversordemoedas/", name = "realToEuro")
    public JAXBElement<RealToEuro> createRealToEuro(RealToEuro value) {
        return new JAXBElement<RealToEuro>(_RealToEuro_QNAME, RealToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversordemoedas/", name = "realToEuroResponse")
    public JAXBElement<RealToEuroResponse> createRealToEuroResponse(RealToEuroResponse value) {
        return new JAXBElement<RealToEuroResponse>(_RealToEuroResponse_QNAME, RealToEuroResponse.class, null, value);
    }

}
