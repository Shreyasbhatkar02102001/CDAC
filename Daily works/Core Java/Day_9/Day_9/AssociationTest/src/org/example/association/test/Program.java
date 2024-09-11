package org.example.association.test;

import org.example.association.lib.Address;
import org.example.association.lib.Date;
import org.example.association.lib.Person;

public class Program {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Sandeep");
		
		Date birthDate = person.getBirthDate();
		birthDate.setDay(23);
		birthDate.setMonth(7);
		birthDate.setYear(1983);
		
		Address currentAddress = new Address();
		currentAddress.setCityName("Pune");
		currentAddress.setStateName("Maharashtra");
		currentAddress.setPinCode(12345);
		
		person.setCurrentAddress(currentAddress);
		
		System.out.println( person.toString() );
	}
	public static void main2(String[] args) {
		Address address = new Address();
		address.setCityName("Pune");
		address.setStateName("Maharashtra");
		address.setPinCode(12345);
		
		System.out.println( address.toString());
	}
	public static void main1(String[] args) {
		Date date = new Date();
		System.out.println( date.toString());
	}
}
