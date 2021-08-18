package com.springcore;
import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AroundAdvisor {
	@Around("execution(* com.springcore.Login.greetCustomer(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("please enter username");
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		
		System.out.println("please enter password");
		String z = sc.next();
		joinPoint.proceed(); 
//        System.out.println("welcome " + s);  
    }
}