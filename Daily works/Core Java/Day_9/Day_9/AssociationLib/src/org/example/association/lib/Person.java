package org.example.association.lib;

public class Person {
	private String name;					//Association
	private Date birthDate = new Date( );	//Association( Composition )
	private Address currentAddress;			//Association( Aggregation )
	
	public Person() {	
	
	}
	
	public Person( String name, int day, int month, int year ) {
		this.name = name;
		this.birthDate.setDay(day);
		this.birthDate.setMonth(month);
		this.birthDate.setYear(year);
	}
	
	public Person( String name, String cityName, String stateName, int pinCode ) {
		this.name = name;
		this.currentAddress.setCityName(cityName);
		this.currentAddress.setStateName(stateName);
		this.currentAddress.setPinCode(pinCode);
	}
	public Person( String name, int day, int month, int year, String cityName, String stateName, int pinCode ) {
		this.name = name;
		
		this.birthDate.setDay(day);
		this.birthDate.setMonth(month);
		this.birthDate.setYear(year);
		
		this.currentAddress.setCityName(cityName);
		this.currentAddress.setStateName(stateName);
		this.currentAddress.setPinCode(pinCode);
	}
	
	public Person(String name, Address currentAddress) {
		this.name = name;
		this.currentAddress = currentAddress;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	@Override
	public String toString() {
		return this.name+"	"+this.birthDate.toString()+"	"+this.currentAddress.toString();
	}
}
