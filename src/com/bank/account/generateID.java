package com.bank.account;
import java.util.Random;


public interface generateID {
	String generatingID();
}

class perRequirement implements generateID{
	@Override
	public String generatingID() {
		Random rand = new Random();
		String obj = "";
		for (int i =0 ; i < 10 ; i++) {
			obj += rand.nextInt(9);
		}
		return obj;
	}
}