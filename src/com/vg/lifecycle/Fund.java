package com.vg.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class Fund {
	
	private String fundDescription;
	
	
	public void fundIntro() {
		System.out.println(" Fund init ");
		
	}
	
	public void fundClosure() {
		System.out.println(" Fund closure ");
	}

	public String getFundDescription() {
		return fundDescription;
	}

	public void setFundDescription(String fundDescription) {
		this.fundDescription = fundDescription;
	}
	
}
