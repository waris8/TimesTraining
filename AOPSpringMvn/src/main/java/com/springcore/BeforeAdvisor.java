package com.springcore;
import java.util.Scanner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class BeforeAdvisor {
    @Before("execution(* com.springcore.Login.greetCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {
    System.out.println("please enter email id before logging in");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    }

}