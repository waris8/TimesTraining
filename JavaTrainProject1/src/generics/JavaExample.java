package generics;

import java.util.*;  
public class JavaExample{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Tom");
       //displaying elements
      System.out.println(alist);
      //Adding "Steve" at the fourth position
      alist.add(3, "Steve");
      //displaying elements
      System.out.println(alist);
    //Removing "Steve" and "Angela"
      alist.remove("Steve");
      alist.remove("Angela");
      System.out.println(alist);
      //Removing 3rd element
      alist.remove(2);
      System.out.println(alist);
   }  
}
