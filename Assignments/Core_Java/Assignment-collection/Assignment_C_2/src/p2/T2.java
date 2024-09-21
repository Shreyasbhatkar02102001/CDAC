package p2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	
	int empID;
	String empName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}

	public int compareTo(Employee e) {
		
		if (this.empID == e.empID) {
			return this.empName.compareTo(e.empName);
		}
		return this.empID - e.empID;
	}

	@Override
	public String toString() {
		return "Employee [empID = " + empID + ", empName = " + empName + "]";
	}
}

public class T2 {
	
	static void display(Collection<?> c) {
		
		for (Object ob : c) {
			System.out.println(ob);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> elist = new ArrayList<Employee>();
		
		Employee e1 = new Employee(12,"Viren");
		Employee e2 = new Employee(37,"Suraj");
		Employee e3 = new Employee(8,"Chetan");
		Employee e5 = new Employee(90,"shameek");
		Employee e4 = new Employee(90,"Chaitanya");
		
		elist.add(e1);		
		elist.add(e2);
		elist.add(e3);
		elist.add(e5);
		elist.add(e4);
		
		System.out.println("Before sorting : ");
		
		display(elist);
		
		System.out.println("\nAfter sorting : ");
		Collections.sort(elist);
		display(elist);
	}

}
