package com.sri.springcore.springcoreadvanced.sterotype.Injecting.Interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDaoImp implements OrderDao {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside Order Dao createOrder()");

	}

}
