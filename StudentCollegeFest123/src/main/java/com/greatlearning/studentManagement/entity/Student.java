package com.greatlearning.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="Name")
	private String Name;


	@Column(name="Department")
	private String Department;
	
	public Student(String name, String department, String country) {
		super();
		
		this.Name = name; 
		this.Department =department;
		this.country = country;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Department=" + Department + ", country=" + country + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Column(name="Country")
	private String country;

	
	public Student()
	{
		
	}
	
	
}