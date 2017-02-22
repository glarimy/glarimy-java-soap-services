package com.glarimy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.glarimy.bank.Account;
import com.glarimy.bank.Bank;
import com.glarimy.bank.Customer;
import com.glarimy.bank.Transaction;

@WebService(endpointInterface = "com.glarimy.bank.Bank", name = "BankService", serviceName = "BankService", portName = "BankPort", targetNamespace = "http://www.glarimy.com/bank")
public class GlarimyBank implements Bank {
	private Map<Integer, Account> ledger;

	public GlarimyBank() {
		ledger = new HashMap<>();
	}

	@Override
	public int openAccountFor(Customer customer) {
		Account account = new Account();
		account.setNo(ledger.size() + 1);
		account.setCustomer(customer);
		ledger.put(account.getNo(), account);
		return account.getNo();
	}

	@Override
	public double deposit(int no, double amount) {
		Account account = ledger.get(no);
		account.setBalance(account.getBalance() + amount);
		Transaction tx = new Transaction();
		tx.setType("credit");
		tx.setAmount(amount);
		tx.setBalance(account.getBalance());
		account.getTransaction().add(tx);
		return account.getBalance();
	}

	@Override
	public double withdraw(int no, double amount) {
		Account account = ledger.get(no);
		account.setBalance(account.getBalance() - amount);
		Transaction tx = new Transaction();
		tx.setType("debit");
		tx.setAmount(amount);
		tx.setBalance(account.getBalance());
		account.getTransaction().add(tx);
		return account.getBalance();
	}

	@Override
	public Account find(int no) {
		return ledger.get(no);
	}

	@Override
	public List<Transaction> history(int no) {
		return ledger.get(no).getTransaction();
	}

}
