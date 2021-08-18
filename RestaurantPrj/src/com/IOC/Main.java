package com.IOC;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="";
		IOC_Container is=new IOC_Container();
		is.menu();
		int ch=sc.nextInt();
		Restaurant r=is.getRestaurant(ch);
		r.serve();
	}
}
