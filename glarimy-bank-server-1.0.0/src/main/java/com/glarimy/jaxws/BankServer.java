package com.glarimy.jaxws;

import javax.xml.ws.Endpoint;

public class BankServer {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:80/bank", new GlarimyBank());
	}
}
