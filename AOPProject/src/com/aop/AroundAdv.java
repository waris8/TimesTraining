package com.aop;

public class AroundAdv 
{
	public void around()
	{
		System.out.println("Menu");
		concern();
		System.out.println("Bills");
	}
	public void concern()
	{
		Restaurant r=new Restaurant();
		r.serve();
	}
}
