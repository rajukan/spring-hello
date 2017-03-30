package com.vg.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext fndCtx = new FileSystemXmlApplicationContext( 
				"/META-INF/resources/03-lifecycle/spring-bootstrap.xml");
		
		 Fund fund = (Fund) fndCtx.getBean("vgFund");
		  System.out.println(fund.getFundDescription());
		  
		
	}
}
