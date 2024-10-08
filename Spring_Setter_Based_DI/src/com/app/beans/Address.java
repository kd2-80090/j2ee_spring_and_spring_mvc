package com.app.beans;

public class Address {
	
	private long houseNo;
	
	private String cityName;
	
	private long pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(long houseNo, String cityName, long pincode) {
		super();
		this.houseNo = houseNo;
		this.cityName = cityName;
		this.pincode = pincode;
	}

	public void setHouseNo(long houseNo) {
		System.out.println("setter method house");
		this.houseNo = houseNo;
	}

	public void setCityName(String cityName) {
		System.out.println("setter method city");
		this.cityName = cityName;
	}

	public void setPincode(long pincode) {
		System.out.println("setter method pincode");
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "#" + houseNo + ", " + cityName + ", Pincode-" + pincode;
	}
}
