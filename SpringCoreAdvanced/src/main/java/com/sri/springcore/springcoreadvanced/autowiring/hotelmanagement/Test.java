package com.sri.springcore.springcoreadvanced.autowiring.hotelmanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/springcoreadvanced/autowiring/hotelmanagement/ConfigFile.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}

}
