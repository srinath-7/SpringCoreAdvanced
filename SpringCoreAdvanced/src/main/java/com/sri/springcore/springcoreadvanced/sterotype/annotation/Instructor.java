package com.sri.springcore.springcoreadvanced.sterotype.annotation;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
	
	int id; 
	String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
