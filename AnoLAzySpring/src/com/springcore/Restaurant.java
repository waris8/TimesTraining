package com.springcore;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
@Component("restaurantBean")
@Lazy
public class Restaurant {
	@Lazy
	@Autowired
	iHotDrink ihd;	
	public Restaurant() {
		System.out.println("Restaurant Constructed");
	}
	public void serveCustomer() {
		ihd.prepareHotDrink();
	}
  }