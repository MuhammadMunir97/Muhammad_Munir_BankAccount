package com.bank.account;





public class BankAccount {
	private String accountNumber;
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	private static int  numOfAccounts = 0;
	private static double totalAmount = 0;
		
	public BankAccount() {};
	public BankAccount(generateID accountgen) {
		numOfAccounts++;		
		accountNumber = accountgen.generatingID();
	}
	
	// getters
	public static double getTotalAmount() {
		return totalAmount;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public static int getNumOfAccounts() {
		return numOfAccounts;
	}
	

	public void TransactionChecking(double money, Transaction process) {
		totalAmount -= checkingBalance;
		checkingBalance = process.processingMoney(money, checkingBalance);
		totalAmount += checkingBalance;
	}
	public void TransactionSaving(double money, Transaction process) {
		totalAmount -= savingsBalance;
		savingsBalance = process.processingMoney(money, savingsBalance);
		totalAmount += savingsBalance;
	}
}
