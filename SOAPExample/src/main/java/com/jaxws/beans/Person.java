package com.jaxws.beans;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -5577579081118070434L;
	private String name;
	private int age;
	private int id;

	@Override
	public String toString() {
		return id + "::" + name + "::" + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//Generate getter and setters
}