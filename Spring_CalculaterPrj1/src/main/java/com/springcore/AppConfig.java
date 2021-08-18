package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	@Bean("1")
	public Operator getOperatorAdd()
	{
		return new Operator(new Add());
	}
	@Bean("2")
	public Operator getOperatorSub()
	{
		return new Operator(new SUB());
	}
	@Bean("3")
	public Operator getOperatorMul()
	{
		return new Operator(new MUL());
	}
	@Bean("4")
	public Operator getOperatorDIV()
	{
		return new Operator(new DIV());
	}
	@Bean("5")
	public Operator getOperatorMOD()
	{
		return new Operator(new MOD());
	}
	
	
}
