package com.bank.account;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bob = new BankAccount();
		System.out.println("bob's account number: "+bob.getAccountNumber());
		System.out.println("bob's current checking amount: "+ bob.getCheckingBalance());
		System.out.println("bob's current saving amount: "+ bob.getSavingsBalance());
		System.out.println(bob.withdrawMoney(500, checkOrSave.checking));
		System.out.println("bob's current checking amount: "+ bob.getCheckingBalance());

	}

}
