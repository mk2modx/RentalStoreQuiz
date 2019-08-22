package com.skilldistillery.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Store extends Customer{
	// TODO: each store has an id
	private int id;
	
	// TODO: each store has 0 or more unique Customers
	 List <Customer> customerList;
	
	// TODO: implement the required methods to:
	//       * Add a customer (no duplicates allowed)
	//       * Return the number of customers
	//       * Display all data
	
	public List <Customer> addCustomer(Customer m) {
		List<Customer> customerList = new ArrayList<>();
		 customerList.add(m);
		 
		return customerList;
	}
	
	public int returnCustomerSize () {
		return customerList.size();
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", customer=" + customerList + "]";
	}
	
	
	
}
