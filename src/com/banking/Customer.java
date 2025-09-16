package com.banking;

public class Customer {
	private String id;
	private String name;
	
	public Customer() {
		
	}

	public Customer(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
     
	
}
