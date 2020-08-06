package com.sri.springcore.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/springcoreadvanced/standalone/collections/ConfigFile.xml");
		ProductsList list = (ProductsList) context.getBean("ProductsList");
		System.out.println(list);
	}

}
