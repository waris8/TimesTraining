package com.springcore;

import org.springframework.stereotype.Component;

public class DIV implements IOP{
	public int Operationab(int a,int b)
	{
		if(b==0)
		{
			return 0;
		}
		else
			
			return a/b;
	}

}
