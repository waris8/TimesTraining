package com.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DOCTOR")
public class Doctor {
	@Id
	@GeneratedValue
	private int doctorId;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private Set<Patient> patients = new HashSet<Patient>(0);
	
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Set<Patient> students) {
		this.patients = students;
	}
	
}
