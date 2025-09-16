package com.banking;

public class SavingsAccount extends Account {
	
	private static final double MINIMUM_BALANCE =1000.00;

	public SavingsAccount(String accountno, Customer customer, double balance) {
		super(accountno, customer, balance);
		
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance() - amount >= MINIMUM_BALANCE) {
			
			setBalance(getBalance()-amount);
             System.out.println("amount withdrawned successfully...");
		}
		else {
			System.out.println("Insufficient funds and cannot perform withdraw");
			}
		
	}

}