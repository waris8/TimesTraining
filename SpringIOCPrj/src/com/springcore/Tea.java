package com.springcore;
public class Tea implements IHotDrink{
   @Override
    public void prepareHotDrink() {
         System.out.println("Dear customer, we are preparing tea for you!!");
    }
}
