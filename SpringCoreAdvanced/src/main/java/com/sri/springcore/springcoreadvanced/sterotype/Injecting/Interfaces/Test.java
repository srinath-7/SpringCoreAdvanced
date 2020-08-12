package com.sri.springcore.springcoreadvanced.sterotype.Injecting.Interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/springcoreadvanced/sterotype/Injecting/Interfaces/ConfigFile.xml");
		OrderBo imp = (OrderBOImp) context.getBean("bo");
		imp.placeOrder();
	}

}
