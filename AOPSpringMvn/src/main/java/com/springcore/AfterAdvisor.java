package com.springcore;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class AfterAdvisor {
	@After("execution(* com.springcore.Login.greetCustomer(..))")
    public void logAfter(JoinPoint joinPoint) {
		System.out.println("please take care as the site is being monitored");   
    }
	@AfterReturning("execution(* com.springcore.Login.greetCustomer(..))")
    public void logAfterReturning(JoinPoint joinPoint) {
		System.out.println("welcome again");   
    }
	@AfterThrowing("execution(* com.springcore.Login.greetCustomer(..))")
    public void logAfterThrowing(JoinPoint joinPoint) {
		System.out.println("please enter correct username and password");  
    }
	}