package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	
	private int rollNo;
	
	private double marks;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subject subjects;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNo, double marks, Address address, Subject subjects) {

		System.out.println("in ctor of student");
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.address = address;
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public Address getAddress() {
		return address;
	}

	public Subject getSubjects() {
		return subjects;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}

	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Roll No : " + getRollNo());
		System.out.println("Marks : " + getMarks());
		System.out.println("Address : " + getAddress());
		System.out.println("Subject : " + getSubjects());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", address=" + address + "]";
	}
}
