package com.app.beans;

public class Student {
	
	private String name;
	
	private int rollNo;
	
	private double marks;
	
	private Address address;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNo, double marks, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter method name");
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		System.out.println("setter method rollno");
		this.rollNo = rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		System.out.println("setter method marks");
		this.marks = marks;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Roll No : " + getRollNo());
		System.out.println("Marks : " + getMarks());
		System.out.println("Address : " + getAddress());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", address=" + address + "]";
	}
}
