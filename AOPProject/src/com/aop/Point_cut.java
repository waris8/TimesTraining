package com.aop;

public class Point_cut 
{
	public void joinPoint()
	{
		BeforeAdv b1=new BeforeAdv();
		AroundAdv a1=new AroundAdv();
		AfterAdv a2=new AfterAdv();
		Paypal p1=new Paypal();
		if(b1 instanceof BeforeAdv )
		{
			b1.before();
		}
		if(a1 instanceof AroundAdv )
		{
			a1.around();
		}
		if(p1 instanceof Paypal)
		{
			p1.after();
		}
		if(a2 instanceof AfterAdv )
		{
			a2.after();
		}
		
	}
}