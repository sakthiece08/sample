package com.equalsAndHashcode;

import java.util.Objects;

public class Employee {
	
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public boolean equals(Object obj) {
      
		// 1
		if(null == obj)
			return false;
		// 2
		if(this == obj)
			return true;
		// 3 -  to support 4
		if(this.getClass() != obj.getClass())
			return false;
		// 4
		Employee e= (Employee) obj;
				
		return Objects.equals(this.id, e.id);
    }
	
	  public int hashCode() {
		 return Objects.hash(id);
	  }

}
