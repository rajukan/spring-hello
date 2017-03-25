package com.vg.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class Client {
	
	public void byName() {
		ApplicationContext nmCtx = new FileSystemXmlApplicationContext( 
				"/META-INF/resources/05-autowire/investor_byName.xml");
		
		Investor inv = (Investor) nmCtx.getBean("investor");
		inv.checkAccountBalance();
	}

	public void byType() {
		ApplicationContext nmCtx = new FileSystemXmlApplicationContext( 
				"/META-INF/resources/05-autowire/investor_byType.xml");
		
		Investor inv = (Investor) nmCtx.getBean("investor");
		inv.checkAccountBalance();
	}

	public static void main(String[] args) {

		Client clt = new Client();
		//clt.byName();
		clt.byType();
		
	}
}
