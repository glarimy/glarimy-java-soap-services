package com.glarimy.client;

import java.net.URL;
import java.util.concurrent.Future;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import com.glarimy.bank.Bank;
import com.glarimy.bank.Customer;

public class BankClient {
	public static void main(String[] args) throws Exception {
		String ns = "http://www.glarimy.com/bank";
		Service service = Service.create(new URL("http://localhost:70/bank?wsdl"), new QName(ns, "BankService"));
		Bank bank = service.getPort(Bank.class);
		Customer customer = new Customer();
		customer.setName("Krishna");
		customer.setPhoneNumber(97314231);
		int number = bank.openAccountFor(customer);
		System.out.println("Account opened with no: " + number);

		Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns, "BankPort"), SOAPMessage.class,
				Service.Mode.MESSAGE);
		MessageFactory factory = ((SOAPBinding) ((BindingProvider) dispatch).getBinding()).getMessageFactory();

		SOAPMessage depositRequest = factory.createMessage();
		SOAPBodyElement depositPayload = depositRequest.getSOAPBody().addBodyElement(new QName(ns, "deposit", "ns"));
		depositPayload.addChildElement(new QName(ns, "no", "ns")).addTextNode(number + "");
		depositPayload.addChildElement(new QName(ns, "amount", "ns")).addTextNode("100");
		SOAPMessage depositResponse = dispatch.invoke(depositRequest);
		SOAPBodyElement bodyElement = (SOAPBodyElement) depositResponse.getSOAPBody()
				.getChildElements(new QName(ns, "depositResponse")).next();
		System.out.println(
				"Balance after depositing 100: " + ((SOAPElement) bodyElement.getChildElements().next()).getValue());

		SOAPMessage withdrawlRequest = factory.createMessage();
		SOAPBodyElement withdrawlPayload = withdrawlRequest.getSOAPBody()
				.addBodyElement(new QName(ns, "deposit", "ns1"));
		withdrawlPayload.addChildElement(new QName(ns, "no", "ns")).addTextNode(number + "");
		withdrawlPayload.addChildElement(new QName(ns, "amount", "ns")).addTextNode("50");
		SOAPMessage withdrawlResponse = dispatch.invoke(withdrawlRequest);
		bodyElement = (SOAPBodyElement) withdrawlResponse.getSOAPBody()
				.getChildElements(new QName(ns, "depositResponse")).next();
		System.out.println(
				"Balance after withdrawing 50: " + ((SOAPElement) bodyElement.getChildElements().next()).getValue());

		SOAPMessage findRequest = factory.createMessage();
		SOAPBodyElement findPayload = findRequest.getSOAPBody().addBodyElement(new QName(ns, "find", "ns"));
		findPayload.addChildElement(new QName(ns, "no", "ns")).addTextNode(number + "");

		Future<?> accountFuture = dispatch.invokeAsync(findRequest, r -> {
			try {
				SOAPBodyElement body = (SOAPBodyElement) r.get().getSOAPBody()
						.getChildElements(new QName(ns, "findResponse")).next();
				System.out.println("Account Found with No: "
						+ ((SOAPElement) ((SOAPElement) body.getChildElements().next()).getChildElements().next())
								.getTextContent());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Future<?> historyFuture = bank.historyAsync(number, r -> {
			try {
				System.out.println("Account History:");
				r.get().getTransaction().stream()
						.forEach(t -> System.out.println("Transaction Amount: " + t.getAmount()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		accountFuture.get();
		historyFuture.get();
	}
}
