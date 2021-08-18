package com.springcore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Operator {
	
	
	 IOP iop;
	
	 public Operator(IOP iop) { 
		 this.iop=iop;
		 // autowired with Qualifier
		}
	 public int Operation(int a,int b) {
		 
		return iop.Operationab(a,b);
		}

}
