package com.glarimy.jaxws;

import javax.jws.WebService;

@WebService
public interface Bank {
	public int openAccount(String owner);
	public String getAccountOwner(int no);
}
