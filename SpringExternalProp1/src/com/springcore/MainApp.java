package com.springcore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springcore");
		context.refresh();
		HelloWorld obj = (HelloWorld) context.getBean(HelloWorld.class);
		obj.getMessage();
		context.close();
	}
}