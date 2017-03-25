package com.vg.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class Client {
	
	public static void main(String[] args) {
		String  projectPath ="\\/media/gyanu/New Volume/eclipseworkspaces/ws1/spring_hello/META-INF/resources";
		
		ApplicationContext fndCtx = new FileSystemXmlApplicationContext( 
				"/META-INF/resources/02-singleton/fund.xml");
		
		Fund myFund = (Fund) fndCtx.getBean("fund");
		myFund.setFundDescription("High Yield Tresury");
		System.out.println(myFund.getFundDescription());
		
		Fund myFund2 = (Fund) fndCtx.getBean("fund");		
		System.out.println(myFund2.getFundDescription());
		
		
		System.out.println("myfund1 "+ myFund.toString());
		System.out.println("myfund2 "+ myFund2.toString());
		
		
		Fund myFund3 = (Fund) fndCtx.getBean("protoFund");
		myFund3.setFundDescription("500 Index ");
		System.out.println("myfund3 "+ myFund3.toString());
		Fund myFund4 = (Fund) fndCtx.getBean("protoFund");
		System.out.println("myfund4 "+ myFund4.toString());
		
	}
}
