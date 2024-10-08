package com.app.beans;

public class Address {
	
	private long houseNo;
	
	private String cityName;
	
	private long pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(long houseNo, String cityName, long pincode) {

		System.out.println("in ctor of address");
		this.houseNo = houseNo;
		this.cityName = cityName;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "#" + houseNo + ", " + cityName + ", Pincode-" + pincode;
	}
}
