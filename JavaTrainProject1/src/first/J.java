package first;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

class J  {	
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int avg(int a,int b) {
		return (a+b)/2;
	}
	public static void main(String args[])  	{ 
		int a; 
		//declare object of Scanner Class
		Scanner buf=new Scanner(System.in); 
		System.out.print("Enter value of a :"); 
		/*nextInt() method of Scanner class*/
		a=buf.nextInt(); 
		System.out.print("Enter value of b :");
		int b = buf.nextInt();
		System.out.println("Value of avg:" + avg(a,b));
		System.out.println("Value of sum:" + sum(a,b));

	} 
}
