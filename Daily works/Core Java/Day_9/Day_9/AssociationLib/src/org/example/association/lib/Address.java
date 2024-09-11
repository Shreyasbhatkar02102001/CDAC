package org.example.association.lib;

public class Address {
	private String cityName;
	private String stateName;
	private int pinCode;
	public Address() {
		this.cityName = "";
		this.stateName = "";
		this.pinCode = 0;
	}
	public Address(String cityName, String stateName, int pinCode) {
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return this.cityName+"	"+this.stateName+"	"+this.pinCode;	
	}
}
