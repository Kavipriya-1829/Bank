
package BankApp;

import java.util.Scanner;

public class BankDetails {
	private int accno;
	private String holdername;
	protected int amount=300000;
	private String branch;
	private int depAmount;
	private int Deposit;
	
	Scanner sc=new Scanner(System.in);
	public void AddDetails() {
	System.out.println("enter the account number:");	
	accno=sc.nextInt();
	System.out.println("enter the acount holder name:");
	holdername=sc.next();
	
	System.out.println("enter the brach name :");
	branch=sc.next();
	System.out.println("the account number is : "+accno);
	System.out.println("the account holder name is : "+holdername);
	System.out.println("the amount in your account is :"+amount);
	System.out.println("the branch is :"+branch);
	}
	public void checkbalance() {
		System.out.println("the balance is : "+amount);
	}
	public void deposit() {
		System.out.println("the deposit amount is :");
		depAmount=sc.nextInt();
		Deposit=amount+depAmount;
		System.out.println("the total amount is :"+Deposit);
	}
	public void Withdraw() {
		System.out.println("Enter the withdraw amount :");
		int Withdrawamount = sc.nextInt();
		Withdrawamount=amount-Withdrawamount;
		System.out.println("the amount in your bank is :"+Withdrawamount);
		
	}
	public void exit() {
		System.out.println("exit");
	}
	
	
	
}


package BankApp;

import java.util.Scanner;

public class Deposit extends BankDetails {
	
	
	void show() {
		BankDetails bb=new BankDetails();
		bb.AddDetails();
		System.out.println("Enter your choice :");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			bb.deposit();
			break;
		case 2:
			bb.Withdraw();
			break;
		case 3:
			bb.checkbalance();
			break;
		case 4:
			bb.exit();
			break;
		default:
			System.out.println("server problem");
		}
		
	}
	

}



