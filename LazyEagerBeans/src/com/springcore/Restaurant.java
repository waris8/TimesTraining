package com.springcore;
public class Restaurant {
   private String welcomeNote;
   public void setWelcomeNote(String welcomeNote) {
     this.welcomeNote = welcomeNote;
   }
   public void greetCustomer() { System.out.println(welcomeNote);}
   public void init() {
      System.out.println("Restaurant Bean is going through init.");
   }
   public void destroy() {System.out.println("Bean will destroy now."); }
   public Restaurant(){
   System.out.println("Restaurant Bean is going to be constructed.");
      }

   }