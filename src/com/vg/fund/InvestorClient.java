package com.vg.fund;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.vg.fund.fundtype.Fund;


public class InvestorClient {
	
	public static void main(String[] args) {
		final String  projectPath ="/media/gyanu/New Volume/eclipseworkspaces/ws1/spring_hello/META-INF/resources";
		BeanFactory ctx = new XmlBeanFactory(new FileSystemResource(
				projectPath + "/01-fund/fund.xml"				));
		
	      Fund f = (Fund) ctx.getBean("fund");
	      f.fundFact();
	}

}
