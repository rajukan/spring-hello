package com.vg.autowire.byConstr;


public  class Investor {
	
	private Account account;
	private String name;
	
	public void checkAccountBalance() {
		account.checkBalance();
	}
	
	//Constructor Inject here
	
	public Investor(Account account, String name) {
		System.out.println(" inside investor constructor ");
		this.account=account;
		this.name=name;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		System.out.println(" inject account in investor class ");
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(" Setting name in investor ");
		this.name = name;
	}

}
