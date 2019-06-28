package com.bank.account;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	private static int  numOfAccounts = 0;
	private static double totalAmount = 0;
	public enum checkOrSave {checking,saving};
	
	public BankAccount() {
		numOfAccounts++;
		accountNumber = generateID();		
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
	
	private String generateID() {
		Random rand = new Random();
		String obj = "";
		for (int i =0 ; i < 10 ; i++) {
			obj += rand.nextInt(9);
		}
		return obj;
	}
	
	public void depositMoney(double check, checkOrSave t) {
		deposit(check, t);
		totalAmount += check;
	}
	public String withdrawMoney(double check, checkOrSave t) {
		String retStat = "";
		boolean a = withdraw(check, t);
		if (a == false) {
			retStat = "Transaction incompelete, insufficient funds";
		}
		else {
			retStat = "Transaction successfull";
		}
		return retStat;
	}
	private boolean withdraw(double check, checkOrSave t) {
		boolean withdraw = false;
		switch (t) {
		case checking:
			if (check < checkingBalance)
				withdraw =  false;
				else {
					deposit(-check, t);
					withdraw =  true;
				}
			break;
		case saving:
			if (check < savingsBalance)
				withdraw = false;
			else
			{
				deposit(-check, t);
				withdraw = true;
			}
			break;			
		}
		return withdraw;
	}
	
	private void deposit(double check, checkOrSave s) {
		switch (s){
		case checking:
			checkingBalance += check;
			break;
		case saving:
			savingsBalance += check;	
			break;
		}
	}
	


}
