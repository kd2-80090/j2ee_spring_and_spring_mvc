package com.app.beans;

public class Student {

	private String name;
	
	private int rollNo;
	
	private double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNo, double marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Roll No : " + getRollNo());
		System.out.println("Marks : " + getMarks());
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
}
