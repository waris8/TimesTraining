package functinalInterface;

import java.util.Scanner;

//public class TestMultipleCatchBlock1{  
//	  public static void main(String args[]){  
//	   try{  
//	    int a[]=new int[5];  
//	    a[5]=30/0;  
//	   }  
//	   catch(Exception e){System.out.println("common task completed");}  
//	   catch(ArithmeticException e){
//	       System.out.println("task1 is completed");}  
//	   catch(ArrayIndexOutOfBoundsException e){
//	        System.out.println("task 2 completed");}  
//	   System.out.println("rest of the code...");  
//	 }  
//	} 
//public class TestMultipleCatchBlock{  
//	static int z;
//	  public static void main(String args[]){ 
//		  Scanner sc = new Scanner(System.in);
//		  
//	   try{  
//		   int s = sc.nextInt();
//		   z = 1/s;
//	   }  
//	   catch(ArithmeticException e){
//	            System.out.println("input is 0");    }  
//	 }  
//	} 

//public class Excep{  
//	 public static void main(String args[]){  
//	  try{  
//	     try{  
//	          System.out.println("going to divide");  
//	          int b =39/0;  
//	      }   catch(ArithmeticException e){
//	            System.out.println(e);      }  
//	      try{  
//	          int a[]=new int[5];  
//	          a[5]=4;  
//	      }   catch(ArrayIndexOutOfBoundsException e){
//	          System.out.println(e);  }  
//	      System.out.println("other statement");  
//	   }catch(Exception e){
//	       System.out.println("handled");
//	}  
//	   System.out.println("normal flow..");  
//	 }  
//	} 

//public class Main5 {
//	static void validate(int age) {
//		if (age < 18)
//			throw new ArithmeticException("not valid");
//		else
//			System.out.println("welcome to vote");
//	}
//
//	public static void main(String args[]) {
//		try {
//			validate(13);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("rest of the code...");
//	}
//}

//import java.io.IOException;  
//public class Main5{  
//  void m()throws IOException{  
//    throw new IOException("device error");//checked exception  
//  }  
//  void n()throws IOException{  
//    m();  
//  }  
//  void p(){  
//   try{  
//    n();  
//   }catch(Exception e){System.out.println("exception handled");}  
//  }  
//public static void main(String args[]){  
//   Main5 obj=new Main5();  
//   obj.p();  
//   System.out.println("normal flow...");  
//  }  
//} 

import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
} 

















