
package com.glarimy.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GlarimyBankService", targetNamespace = "http://jaxws.glarimy.com/", wsdlLocation = "http://localhost:80/bank?wsdl")
public class GlarimyBankService
    extends Service
{

    private final static URL GLARIMYBANKSERVICE_WSDL_LOCATION;
    private final static WebServiceException GLARIMYBANKSERVICE_EXCEPTION;
    private final static QName GLARIMYBANKSERVICE_QNAME = new QName("http://jaxws.glarimy.com/", "GlarimyBankService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:80/bank?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GLARIMYBANKSERVICE_WSDL_LOCATION = url;
        GLARIMYBANKSERVICE_EXCEPTION = e;
    }

    public GlarimyBankService() {
        super(__getWsdlLocation(), GLARIMYBANKSERVICE_QNAME);
    }

    public GlarimyBankService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GLARIMYBANKSERVICE_QNAME, features);
    }

    public GlarimyBankService(URL wsdlLocation) {
        super(wsdlLocation, GLARIMYBANKSERVICE_QNAME);
    }

    public GlarimyBankService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GLARIMYBANKSERVICE_QNAME, features);
    }

    public GlarimyBankService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GlarimyBankService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Bank
     */
    @WebEndpoint(name = "GlarimyBankPort")
    public Bank getGlarimyBankPort() {
        return super.getPort(new QName("http://jaxws.glarimy.com/", "GlarimyBankPort"), Bank.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Bank
     */
    @WebEndpoint(name = "GlarimyBankPort")
    public Bank getGlarimyBankPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxws.glarimy.com/", "GlarimyBankPort"), Bank.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GLARIMYBANKSERVICE_EXCEPTION!= null) {
            throw GLARIMYBANKSERVICE_EXCEPTION;
        }
        return GLARIMYBANKSERVICE_WSDL_LOCATION;
    }

}
