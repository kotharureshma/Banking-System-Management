package com.banking;

import java.util.Collection;
import java.util.LinkedHashMap;

public class BankingService {
	
	// store id as key 
	LinkedHashMap<String,Customer> customers=new LinkedHashMap<String,Customer>();
	
	//store accountno as key
	LinkedHashMap<String,Account> accounts=new LinkedHashMap<String,Account>();
	
	
//creating customer
	public void createCustomer(String id, String name) {
		if(customers.containsKey(id)) {  //checks if id present in map
			System.out.println("customer id already exists");
		}
		else {
			Customer customer=new Customer(id,name);
			customers.put(id, customer); // addding customer to map
			System.out.println(customer);
			System.out.println("customer created successfully");
		}
		
	}


//creating account for customer
	public void createAccount(String acc_type, String acc_number, String cust_id, double balance) {
		if(customers.containsKey(cust_id)) { //if customer id exist only we can create account
			if(accounts.containsKey(acc_number)) { //checks if acc_number is present in map if present we can create account
				System.out.println("account alreday exists");
			}
			else {
				Customer customer=customers.get(cust_id);
				if(acc_type.equalsIgnoreCase("Savings")) {
					Account account=new SavingsAccount(acc_number,customer,balance);
					accounts.put(acc_number,account);
					System.out.println("saving account created successfully....");
					System.out.println(account);
					
				}
				else if(acc_type.equalsIgnoreCase("Current")) {
					Account account=new CurrentAccount(acc_number,customer,balance);
					accounts.put(acc_number,account);
					System.out.println("current account created successfully....");
					System.out.println(account);
					
				}
				else {
					System.out.println("invalid account type");
				}
			}
			
		}
		else {
			System.out.println("customer id does not exist");
		}
	}
	
	

//deposit amount 
	public void depositAmount(String dep_acc_number, double dep_amount) {
	if(accounts.containsKey(dep_acc_number)) {
	   Account account=accounts.get(dep_acc_number);
	   account.deposit(dep_amount);
	   System.out.println(account);
	}
	else {
		System.out.println("invalid account number");
		
	}
	}


// withdraw amount
	public void withdrawAmount(String wd_acc_number, double wd_amount) {
		if(accounts.containsKey(wd_acc_number)) {
			 Account account=accounts.get(wd_acc_number);
			   account.withdraw(wd_amount);
			   System.out.println(account);
		}
		else {
			System.out.println("invalid account number");
			
		}
		
		
	}

	
	
//checking balance
	public void checkBalance(String check_acc_number) {
		if(accounts.containsKey(check_acc_number)) {
			 Account account=accounts.get(check_acc_number);
			   System.out.println(account.getBalance());
			
			
		}
		else {
			System.out.println("invalid account number");
				
		}
		
	}


	
//viewing accounts
	public void getAccounts() {
		Collection<Account> accs= accounts.values(); //we have objects
		 for(Account acc :accs) {
			 System.out.println(acc);
		 }
	}
	
	
	

}