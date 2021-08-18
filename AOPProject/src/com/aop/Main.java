package com.aop;

public class Main {

	public static void main(String[] args) {
		AOPContainer aop=new AOPContainer();
		ProxyRestaurant r=aop.getRestaurant();
		r.serve();
	}


}
