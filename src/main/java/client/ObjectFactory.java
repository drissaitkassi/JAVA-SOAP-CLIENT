
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _ConvertEuroToDH_QNAME = new QName("http://ws.akdriss.com/", "convertEuroToDH");
    private final static QName _ConvertEuroToDHResponse_QNAME = new QName("http://ws.akdriss.com/", "convertEuroToDHResponse");
    private final static QName _GetAllResponse_QNAME = new QName("http://ws.akdriss.com/", "getAllResponse");
    private final static QName _GetCompte_QNAME = new QName("http://ws.akdriss.com/", "getCompte");
    private final static QName _GetCompteResponse_QNAME = new QName("http://ws.akdriss.com/", "getCompteResponse");
    private final static QName _GetAll_QNAME = new QName("http://ws.akdriss.com/", "getAll");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link ConvertEuroToDH }
     * 
     */
    public ConvertEuroToDH createConvertEuroToDH() {
        return new ConvertEuroToDH();
    }

    /**
     * Create an instance of {@link ConvertEuroToDHResponse }
     * 
     */
    public ConvertEuroToDHResponse createConvertEuroToDHResponse() {
        return new ConvertEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.akdriss.com/", name = "convertEuroToDH")
    public JAXBElement<ConvertEuroToDH> createConvertEuroToDH(ConvertEuroToDH value) {
        return new JAXBElement<ConvertEuroToDH>(_ConvertEuroToDH_QNAME, ConvertEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.akdriss.com/", name = "convertEuroToDHResponse")
    public JAXBElement<ConvertEuroToDHResponse> createConvertEuroToDHResponse(ConvertEuroToDHResponse value) {
        return new JAXBElement<ConvertEuroToDHResponse>(_ConvertEuroToDHResponse_QNAME, ConvertEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.akdriss.com/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.akdriss.com/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.akdriss.com/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.akdriss.com/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

}
