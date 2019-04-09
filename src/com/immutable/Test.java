package com.immutable;

import java.util.Collections;

public class Test {

	public static void main(String[] args) {
	

	      
		InheritanceExample example= new InheritanceExample("Sakthi", new Address("India", "Delhi"), Collections.EMPTY_LIST);
		Person person= (Person) example;
		System.out.println(person.getName());
    	
		
		System.out.println("***");
		
		example.hackTheName("Modified name");
		
		System.out.println(person.getName());
		

	

	}

}
