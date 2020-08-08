package com.sri.springcore.springcoreadvanced.sterotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/springcoreadvanced/sterotype/annotation/ConfigFile.xml");
		Instructor instructor = (Instructor) context.getBean("instructor");
		System.out.println(instructor);
	}

}
