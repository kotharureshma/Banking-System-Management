package com.banking;

public class CurrentAccount extends Account{
	private static final double OVER_DRAFT_LIMIT=-10000.00;

	public CurrentAccount(String accountno, Customer customer, double balance) {
		super(accountno, customer, balance);
	
	}

	@Override
	public void withdraw(double amount) {
		
		if(getBalance() - amount >= OVER_DRAFT_LIMIT) {
		setBalance(getBalance()-amount);
        System.out.println("amount withdrawned successfully...");
		}
		else {
			System.out.println("over draft limit exceeded.....");
		}
		
		}

}