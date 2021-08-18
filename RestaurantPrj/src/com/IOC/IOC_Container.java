package com.IOC;

public class IOC_Container 
{
	
		public void menu()
		{
			System.out.println("Enter 1: Tea");
			System.out.println("Enter 2: Coffee");
			System.out.println("Enter 3: Chocolate Drink");
		}
		public Restaurant getRestaurant(int s)
		{
			iHotDrink h;
			if(s==1)
				h=new Tea();
			else if(s==2)
				h=new Coffee();
			else
				h=new Chocolate();
			return new Restaurant(h);
		}
}