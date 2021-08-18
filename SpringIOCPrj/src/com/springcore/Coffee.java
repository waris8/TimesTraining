package com.springcore;
public class Coffee implements IHotDrink{
   @Override
   public void prepareHotDrink() {
      System.out.println("Dear customer, we are preparing coffee for you!!");
   }
}
