package com.glarimy.jaxws;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface="com.glarimy.jaxws.Bank")
public class GlarimyBank implements Bank {
	private Map<Integer, String> ledger;

	public GlarimyBank() {
		ledger = new HashMap<>();
	}

	@Override
	public String getAccountOwner(int no) {
		return ledger.get(no);
	}

	@Override
	public int openAccount(String owner) {
		int no = ledger.size() + 1;
		ledger.put(no, owner);
		return no;
	}
}
