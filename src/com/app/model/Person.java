package com.app.model;

public class Person {
	private String name;
	private Long id;
	private String department;
	public Person(String name, Long id, String department){
		this.name = name;
		this.id = id;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return this.name + " "+ this.department + " " + this.id;
	}
}
