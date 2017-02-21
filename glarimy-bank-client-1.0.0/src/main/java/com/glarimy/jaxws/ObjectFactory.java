
package com.glarimy.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.glarimy.jaxws package. 
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

    private final static QName _OpenAccount_QNAME = new QName("http://jaxws.glarimy.com/", "openAccount");
    private final static QName _OpenAccountResponse_QNAME = new QName("http://jaxws.glarimy.com/", "openAccountResponse");
    private final static QName _GetAccountOwner_QNAME = new QName("http://jaxws.glarimy.com/", "getAccountOwner");
    private final static QName _GetAccountOwnerResponse_QNAME = new QName("http://jaxws.glarimy.com/", "getAccountOwnerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.glarimy.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpenAccount }
     * 
     */
    public OpenAccount createOpenAccount() {
        return new OpenAccount();
    }

    /**
     * Create an instance of {@link GetAccountOwner }
     * 
     */
    public GetAccountOwner createGetAccountOwner() {
        return new GetAccountOwner();
    }

    /**
     * Create an instance of {@link GetAccountOwnerResponse }
     * 
     */
    public GetAccountOwnerResponse createGetAccountOwnerResponse() {
        return new GetAccountOwnerResponse();
    }

    /**
     * Create an instance of {@link OpenAccountResponse }
     * 
     */
    public OpenAccountResponse createOpenAccountResponse() {
        return new OpenAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.glarimy.com/", name = "openAccount")
    public JAXBElement<OpenAccount> createOpenAccount(OpenAccount value) {
        return new JAXBElement<OpenAccount>(_OpenAccount_QNAME, OpenAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.glarimy.com/", name = "openAccountResponse")
    public JAXBElement<OpenAccountResponse> createOpenAccountResponse(OpenAccountResponse value) {
        return new JAXBElement<OpenAccountResponse>(_OpenAccountResponse_QNAME, OpenAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountOwner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.glarimy.com/", name = "getAccountOwner")
    public JAXBElement<GetAccountOwner> createGetAccountOwner(GetAccountOwner value) {
        return new JAXBElement<GetAccountOwner>(_GetAccountOwner_QNAME, GetAccountOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountOwnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.glarimy.com/", name = "getAccountOwnerResponse")
    public JAXBElement<GetAccountOwnerResponse> createGetAccountOwnerResponse(GetAccountOwnerResponse value) {
        return new JAXBElement<GetAccountOwnerResponse>(_GetAccountOwnerResponse_QNAME, GetAccountOwnerResponse.class, null, value);
    }

}
