package com.sri.springcore.springcoreadvanced.sterotype.Injecting.Interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDaoImp2 implements OrderDao{

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside OrderDaoImp12 createOrder");
		
	}
	
	

}
