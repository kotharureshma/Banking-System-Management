package com.banking;
import java.util.*;
public class BankingManagementSytem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		BankingService service = new BankingService();
		while(true) {
			System.out.println("********************************");
			System.out.println("***********WELCOME TO***********");
			System.out.println("*********BANKING MANAGEMENT SYSTEM**********");
			System.out.println("***********************************");
			System.out.println("************ 1. Create Customer  ***********");
			System.out.println("************ 2. Create Account   ***********");
			System.out.println("************ 3. Deposit Amount   ***********");
			System.out.println("************ 4. Withdraw Amount  ***********");
			System.out.println("************ 5. Check Balance    ***********");
			System.out.println("************ 6. view Accounts    ***********");
			System.out.println("************ 7. Exit             ***********");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter id:");
				String id=sc.next();
				System.out.println("enter name:");
				String name=sc.next();
				
				service.createCustomer(id,name);
				
				break;
				
			case 2:
				System.out.println("enter account type:(savings/current)");
				String acc_type=sc.next();
				System.out.println("enter account number:");
				String acc_number=sc.next();
				System.out.println("enter customer id:");
				String cust_id=sc.next();
				System.out.println("enter balance:");
				double balance=sc.nextDouble();
				
				service.createAccount(acc_type,acc_number,cust_id,balance);
				break;
				
			case 3:
				System.out.println("enter account number");
				String dep_acc_number=sc.next();
				System.out.println("enter amount to deposit");
				double dep_amount=sc.nextDouble();
				 
				service.depositAmount(dep_acc_number,dep_amount);
				break;
				
			case 4:
				System.out.println("enter account number");
				String wd_acc_number=sc.next();
				System.out.println("enter amount to withdraw");
				double wd_amount=sc.nextDouble();
				
				service.withdrawAmount(wd_acc_number,wd_amount);
				
				break;
				
			case 5:
				System.out.println("enter account number");
				String check_acc_number=sc.next();
				
				service.checkBalance(check_acc_number);
				break;
				
			case 6:
				service.getAccounts();
				break;
				
			case 7:
				System.exit(0);
				break;
				
		    default:
					System.out.println(" Please enter valid option....");
		
			}
		}

	}

}