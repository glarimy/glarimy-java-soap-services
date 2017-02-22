package com.glarimy.service;

import javax.xml.ws.Endpoint;

/**
 * SAMPLE REQUEST
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
 <S:Body>
  <bank:openAccountFor xmlns:bank="http://www.glarimy.com/bank/">
   <bank:customer>
    <bank:name>Krishna</bank:name>
    <bank:phoneNumber>98989898</bank:phoneNumber>
   </bank:customer>
  </bank:openAccountFor>
 </S:Body>
</S:Envelope>
*/

/**
 * SAMPLE RESPONSE
<?xml version="1.0" ?>
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
  <S:Body>
    <openAccountForResponse xmlns="http://www.glarimy.com/bank/">
      <no>7</no>
    </openAccountForResponse>
  </S:Body>
</S:Envelope>
 */

public class BankServer {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:80/bank", new GlarimyBank());
		System.out.println("GlarimyBank is open for business");
	}
}