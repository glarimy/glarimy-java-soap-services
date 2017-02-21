
package com.glarimy.bank;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.glarimy.bank package. 
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

    private final static QName _Amount_QNAME = new QName("http://www.glarimy.com/bank/", "amount");
    private final static QName _PhoneNumber_QNAME = new QName("http://www.glarimy.com/bank/", "phoneNumber");
    private final static QName _No_QNAME = new QName("http://www.glarimy.com/bank/", "no");
    private final static QName _Balance_QNAME = new QName("http://www.glarimy.com/bank/", "balance");
    private final static QName _Name_QNAME = new QName("http://www.glarimy.com/bank/", "name");
    private final static QName _Type_QNAME = new QName("http://www.glarimy.com/bank/", "type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.glarimy.bank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link OpenAccountFor }
     * 
     */
    public OpenAccountFor createOpenAccountFor() {
        return new OpenAccountFor();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link HistoryResponse }
     * 
     */
    public HistoryResponse createHistoryResponse() {
        return new HistoryResponse();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link History }
     * 
     */
    public History createHistory() {
        return new History();
    }

    /**
     * Create an instance of {@link OpenAccountForResponse }
     * 
     */
    public OpenAccountForResponse createOpenAccountForResponse() {
        return new OpenAccountForResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.glarimy.com/bank/", name = "amount")
    public JAXBElement<String> createAmount(String value) {
        return new JAXBElement<String>(_Amount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.glarimy.com/bank/", name = "phoneNumber")
    public JAXBElement<Long> createPhoneNumber(Long value) {
        return new JAXBElement<Long>(_PhoneNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.glarimy.com/bank/", name = "no")
    public JAXBElement<Integer> createNo(Integer value) {
        return new JAXBElement<Integer>(_No_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.glarimy.com/bank/", name = "balance")
    public JAXBElement<Double> createBalance(Double value) {
        return new JAXBElement<Double>(_Balance_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.glarimy.com/bank/", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.glarimy.com/bank/", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

}
