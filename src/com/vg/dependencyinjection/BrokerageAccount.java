package com.vg.dependencyinjection;

public   class BrokerageAccount extends Account{

	@Override
	public void accountDescription() {
		System.out.println(" Brokerage account for buying MF/ETFs ");
	}
	
	
}
