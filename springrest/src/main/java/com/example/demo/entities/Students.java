package com.example.demo.entities;

public class Students {
	

	private long rollNo;
	private String firstName;
	private String lastName;
	private int age;
	private int std;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(long rollNo, String firstName, String lastName, int age, int std) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.std = std;
	}
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", std=" + std + "]";
	}
	
	
}
