package com.bank.account;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bob = new BankAccount(new perRequirement());
		Transaction deposit = new depositMoney();
		Transaction withdraw = new withdrawMoney();
		
		bob.TransactionChecking(100, deposit);
		bob.TransactionSaving(200, withdraw);
		System.out.println("bob's current checking amount: "+ bob.getCheckingBalance());
		System.out.println(bob.getAccountNumber());
		System.out.println("total amount: " + BankAccount.getTotalAmount());
		System.out.println("total number of accounts: " + BankAccount.getNumOfAccounts());
	}
	
}
