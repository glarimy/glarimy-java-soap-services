package com.glarimy.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.glarimy.bank.Account;
import com.glarimy.bank.Customer;
import com.glarimy.rs.GlarimyBank;

@Path("/bank")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BankController {
	public static GlarimyBank bank = new GlarimyBank();

	@Path("/account")
	@PUT
	public Response openAccountFor(Customer customer) {
		int number = bank.openAccountFor(customer);
		return Response.ok().entity(number + "").build();
	}

	@Path("/account/{number}/deposit")
	@POST
	public Response deposit(@PathParam("number") int number, @QueryParam("amount") double amount) {
		double balance = bank.deposit(number, amount);
		return Response.ok().entity(balance + "").build();

	}

	@Path("/account/{number}/withdraw")
	@POST
	public Response withdraw(@PathParam("number") int number, @QueryParam("amount") double amount) {
		double balance = bank.withdraw(number, amount);
		return Response.ok().entity(balance + "").build();

	}

	@Path("/account/{number}")
	@GET
	public Response find(@PathParam("number") int number) {
		Account account = bank.find(number);
		return Response.ok().entity(account).build();
	}

}