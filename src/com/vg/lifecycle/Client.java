package com.vg.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class Client {
	
	public static void main(String[] args) {
		String  projectPath ="\\/media/gyanu/New Volume/eclipseworkspaces/ws1/spring_hello/META-INF/resources";
		
		ApplicationContext fndCtx = new FileSystemXmlApplicationContext( 
				"/META-INF/resources/03-lifecycle/spring-bootstrap.xml");
		
		 Fund fund = (Fund) fndCtx.getBean("vgFund");
		  System.out.println(fund.getFundDescription());
		  
		
	}
}
