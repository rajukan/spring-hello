package com.vg.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext invCtx = new FileSystemXmlApplicationContext( 
				"/META-INF/resources/04-dependency-injection/spring-bootstrap.xml");
		
		 Investor investor = (Investor) invCtx.getBean("institutional");
		 investor.checkAccountType();
		
		 Account ira = (TradionalAccount) invCtx.getBean("ira");
		 ira.accountDescription();

	}
}
