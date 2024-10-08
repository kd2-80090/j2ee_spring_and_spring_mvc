package com.app.beans;

public class Student {
	
	private String name;
	
	private int rollNo;
	
	private String email;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNo, String email) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name : "+ getName());
		System.out.println("Roll No : " + getRollNo());
		System.out.println("Email : "+ getEmail());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", email=" + email + "]";
	}
	
}
