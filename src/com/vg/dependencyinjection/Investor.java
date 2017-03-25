package com.vg.dependencyinjection;

public   class Investor {
	//Investory `Has A` account
	private Account account;
	
	public Investor(Account account) {
		this.account = account;
	}
	
	public void checkAccountType() {
		account.accountDescription();
	}
	
}
