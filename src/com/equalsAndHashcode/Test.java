package com.equalsAndHashcode;

public class Test {

	public static void main(String[] args) {
		
		Employee emp1= new Employee("John", 100);
		Employee emp2= new Employee("Matt", 101);
		
		// false, both are not the same object in memory
		System.out.println(emp1==emp2);
        // false as well, no equals and Hashcode methods were overwritten. It goes to actual equals() on Objects which doesnt serve our purpose
		System.out.println(emp1.equals(emp2));
		
		// With the default Hashcode(), it always returns same int value hence it causes Collision
		System.out.println(emp1.hashCode() +"  " +emp2.hashCode());
		
	    /* if:
	    	a.equals(b) is true
		   then:
		    a.hashCode() == b.hashCode()
		*/
		// But the above doesnt satisfy here. Also if we oveerride hashcode() to return a constant, the values always store in the same bucket irrespective of the equal() result
		// So inorder to avaoid collison, overwrite hashcode() with the same fields used in the equals()
	}

}
