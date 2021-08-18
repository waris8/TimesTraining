package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("Beans.xml");
		Restaurant obj = (Restaurant) context.getBean("idhello");
		obj.serve();
		context.close();
		}
}

