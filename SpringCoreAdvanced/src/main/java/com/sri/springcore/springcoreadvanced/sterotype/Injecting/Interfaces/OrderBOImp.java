package com.sri.springcore.springcoreadvanced.sterotype.Injecting.Interfaces;

public class OrderBOImp implements OrderBo {
	
	private OrderDao dao;

	
	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside order bO");
		dao.createOrder();

	}
	
	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "OrderBOImp [dao=" + dao + "]";
	}
	
	


}
