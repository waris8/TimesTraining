package com.springcore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyAppConfiguration {
 @Bean(name="idhello")
	public Restaurant getHelloWorld() {
	 Restaurant h = new Restaurant();
	    h.serve();
		return h;
 }
 
}
