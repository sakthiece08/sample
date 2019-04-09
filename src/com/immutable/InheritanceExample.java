package com.immutable;

import java.util.List;

public class InheritanceExample extends Person{
	
	private String hackedName;

	public InheritanceExample(String name, Address address, List<String> vehicles) {
		super(name, address, vehicles);
        hackedName=name;
	}
	
	public void hackTheName(String newNameValue) {
		hackedName=newNameValue;
		System.out.println("Immutability is hacked!");
	}
	
	@Override
	public String getName() {
		return hackedName;
	}
	

}
