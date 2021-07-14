package Comparator;

import java.util.*;

public class Emp implements Comparable<Emp> {
	public String name;
	public int age;

	Emp() {
	}

	Emp(String n, int a) {
		name = n;
		age = a;
	}

	// Overriding the compareTo method
	public int compareTo(Emp d) {
		Integer a = this.name.length();
		Integer b = d.name.length();
		return (a.compareTo(b));
	}

	// Overriding the compare method to sort the age
	
}

