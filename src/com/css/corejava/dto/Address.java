package com.css.corejava.dto;

public class Address {
	private int doorNo;
	private String street;
	private String state;
	private int pincode;
	public Address(int doorNo, String street, String state, int pincode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	

}
