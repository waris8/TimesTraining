package com.springcore;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Welcome to Calculator");
		Scanner sc=new Scanner(System.in);
		int a,b;
		int m=1;
	
		while(m==1)
		{
			System.out.println("Enter your choice");
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for Sub");
			System.out.println("Enter 3 for Mul");
			System.out.println("Enter 4 for Div");
			System.out.println("Enter 5 for mod");
			System.out.println("Enter 6 for Exit");
			int choice;
			choice=sc.nextInt();
			
			if(choice ==1)
			{
				System.out.println("Enter two integer");
				a=sc.nextInt();
				 b=sc.nextInt();
				 Operator obj = (Operator) context.getBean("1");
					System.out.println(obj.Operation(a,b));
			}
			else if(choice==2)
			{
				System.out.println("Enter two integer");
				a=sc.nextInt();
				 b=sc.nextInt();
				 Operator obj = (Operator) context.getBean("1");
					System.out.println(obj.Operation(a,b));
			}
			else if(choice==2)
			{
				System.out.println("Enter two integer");
				a=sc.nextInt();
				 b=sc.nextInt();
				 Operator obj = (Operator) context.getBean("2");
					System.out.println(obj.Operation(a,b));
			}
			else if(choice==3)
			{
				System.out.println("Enter two integer");
				a=sc.nextInt();
				 b=sc.nextInt();
				 Operator obj = (Operator) context.getBean("3");
					System.out.println(obj.Operation(a,b));
			}
			else if(choice==4)
			{
				System.out.println("Enter two integer");
				a=sc.nextInt();
				 b=sc.nextInt();
				 Operator obj = (Operator) context.getBean("4");
					System.out.println(obj.Operation(a,b));
			}
			else if(choice==5)
			{
				System.out.println("Enter two integer");
				a=sc.nextInt();
				 b=sc.nextInt();
				 Operator obj = (Operator) context.getBean("5");
					System.out.println(obj.Operation(a,b));
			}
			else if(choice==6)
			{
				System.out.println("Exit Successfully");
				break;
				
			}
			
		}
		
		
		
		context.close();
	}

}
