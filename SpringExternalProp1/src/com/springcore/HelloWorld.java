package com.springcore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:application-development.properties")
@PropertySource("classpath:application.properties")
//class path represents the class path of our project,
//which is the src folder in java projects 
//which is the resources folder in maven projects 
//which is the lib folder in web projects 
//Systempath represents the java or operating system path,
//which can be the environments variables in os 
//which can be the java path of our JVM 
//Which can be the properties of our power shell(/linux shell) 
public class HelloWorld {
	
	// @Value("${property1}")   //Output: HelloProperties from application Development
	// @Value("${property4:DefaultProperty}") //Output: DefaultProperty
	 //@Value("${property5}") //Output: ${property5}
	 @Value("${property2:DefaultProperty}") //Output: HelloProperties
	private String message; // property
	public void getMessage() {
		
	System.out.println("Your Message : " + message);
	}
}