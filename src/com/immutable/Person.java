package com.immutable;

import java.util.ArrayList;
import java.util.List;

/*
 * 1) Remove Setter methods for the properties
 * 2) Since setter methods are removed, add no-arg constructor to initialize the class for the user
 * 3) Mark the class as Final so it cannot be extended
 * 4) initializing all non-primitive mutable fields via constructor by performing a deep copy
 * 5) performing cloning of the returned non-primitive mutable object in getter methods
 */

//public final class Person 
public class Person{

	private String name;
	private Address address;
	private List<String> vehicles;

	public Person(String name, Address address, List<String> vehicles) {
		this.name = name;
		//this.address = address;
		this.address = new Address(address.getCountry(), address.getCity());
		//this.vehicles = vehicles;
		this.vehicles = new ArrayList<>(vehicles);
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		//return address;
		return new Address(address.getCountry(), address.getCity());
	}

	public List<String> getVehicles() {
		//return vehicles;
		return new ArrayList<>(vehicles);
	}
	
	public static void main(String[] arg) {
		
		Address address= new Address("Canada", "Quebec");
		
		List<String> vehicles = new ArrayList<>();
		vehicles.add("Car1");
		vehicles.add("Truck1");
		
		Person person= new Person("Nivas", address, vehicles);
		
		// Testing step 4
		System.out.println(person.getAddress().getCountry());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getVehicles().size());
		
		address.setCity("Montreal");
		address.setCountry("USA");
		vehicles.remove(1);
		
		System.out.println("Immutability is hacked");
		System.out.println();
		
		System.out.println(person.getAddress().getCountry());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getVehicles().size());
		
		
		// Testing step 5
		// the above side effects can be caused from the getter methods as well
		System.out.println("Immutability is hacked here as well");
		System.out.println();
		
		
		person.getAddress().setCountry("India");
		person.getAddress().setCity("Mumbai");
		
		person.getVehicles().remove(0);
		
		System.out.println(person.getAddress().getCountry());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getVehicles().size());
		
		
		
	}

}
