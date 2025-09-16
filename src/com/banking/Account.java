package com.banking;

public abstract class  Account {
	
	private String accountno;
	private Customer customer;
	private double balance;
	
	public Account(String accountno, Customer customer, double balance) {
		super();
		this.accountno = accountno;
		this.customer = customer;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", customer=" + customer + ", balance=" + balance + "]";
	}

	
	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Amount deposited successfully.....");
	}
	
	public abstract void withdraw(double amount);

}