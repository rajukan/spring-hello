package com.vg.autowire.byConstr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class Client {
	

	public void byConstructor() {
		ApplicationContext nmCtx = new FileSystemXmlApplicationContext( 
				"/META-INF/resources/05-autowire/investor_byConstructor.xml");
		
		Investor inv = (Investor) nmCtx.getBean("investor");
		inv.checkAccountBalance();
	}

	public static void main(String[] args) {

		Client clt = new Client();
		clt.byConstructor();
		
	}
}
