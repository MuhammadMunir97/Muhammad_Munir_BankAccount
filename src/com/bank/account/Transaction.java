package com.bank.account;

public interface Transaction {
	double processingMoney(double money, double currentBalance);
}

class depositMoney implements Transaction{
	@Override
	public double processingMoney(double money, double currentBalance) {	
		return (currentBalance += money);
	}
}

class withdrawMoney implements Transaction{

	@Override
	public double processingMoney(double money, double currentBalance) {
		if (money < currentBalance) {
			currentBalance -= money;
			System.out.println("transaction successfull");
		}else {
			System.out.println("transaction is a failure due to low amount");
		}
		return currentBalance;
	}
}