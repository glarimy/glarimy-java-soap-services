package com.glarimy.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.glarimy.jaxws.Bank;

public class BankClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:80/bank?wsdl");
		QName name = new QName("http://jaxws.glarimy.com/", "GlarimyBankService");
		Bank bank = Service.create(url, name).getPort(Bank.class);
		int no = bank.openAccount("Krishna");
		System.out.println("Created account with no: " + no);
		String owner = bank.getAccountOwner(no);
		System.out.println("Found the owner of the account as " + owner);
	}
}
