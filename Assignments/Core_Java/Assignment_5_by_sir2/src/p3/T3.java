package p3;

import java.util.Scanner;

/*
 * 		Design and implement a class named Employee to manage employee data for a company. 
 * 		The class should include fields to keep track of the total number of employees and the total salary expense, 
 * 		as well as individual employee details such as their ID, name, and salary.
		The class should have methods to:
		
			•	Retrieve the total number of employees (getTotalEmployees())
			•	Apply a percentage raise to the salary of all employees (applyRaise(double percentage))
			•	Calculate the total salary expense, including any raises (calculateTotalSalaryExpense())
			•	Update the salary of an individual employee (updateSalary(double newSalary))
			
		Understand the problem statement and use static and non-static fields and methods appropriately. 
		Implement static and non-static initializers, constructors, getter and setter methods, 
		and a toString() method to handle the initialization and representation of employee data.
		Write a menu-driven program in the main method to test the functionalities.

 */

import java.util.Scanner;

class Employee {
	private static int totalEmp;
	private static double totalSalary;
	
	private String  empname;
	private int id;
	private double salary;
	
	static {
		totalEmp = 0;
		totalSalary = 0.0;
	}
	
	Employee(){
		this("",0,0);
	}
	
	Employee(String name, int id, double salary){
		this.empname = name;
		this.id = id;
		this.salary = salary;
		totalEmp++;
		totalSalary += salary;
	}
	
	
	
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setTotalEmp(int no) {
		this.totalEmp = no;
	}

	public static double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	public static int getTotalEmp() {
		return totalEmp;
	}
	
	void applyRaise(double percentage) {
		salary += salary * (percentage/100);
	}
	
	double calculateTotalSalaryExpense() {
		//totalSalary = this.salary * totalEmp;
		return totalSalary;
	}
	
	void updateSalary(double newSalary) {
		this.salary = newSalary;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
}

public class T3 {

	public static void main(String[] args) {
		//Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		//e1.setTotalEmp(sc.nextInt());
		
		Employee e1 = new Employee( "John Doe", 1, 50000);
        Employee e2 = new Employee( "Jane Smith", 2, 60000);
        Employee e3 = new Employee( "Alice Brown", 3, 70000);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Display Employee Details");
            System.out.println("2. Display Total Employees");
            System.out.println("3. Display Total Salary Expense");
            System.out.println("4. Apply Salary Raise");
            System.out.println("5. Update an Employee's Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(e1);
                    System.out.println(e2);
                    System.out.println(e3);
                    break;

                case 2:
                    System.out.println("Total number of employees: " + Employee.getTotalEmp());
                    break;

                case 3:
                    System.out.println("Total salary expense: $" + Employee.getTotalSalary());
                    break;

                case 4:
                    System.out.print("Enter employee ID to apply raise: ");
                    int empId = sc.nextInt();
                    System.out.print("Enter percentage raise: ");
                    double percentage = sc.nextDouble();

                    if (e1.getId() == empId) {
                        e1.applyRaise(percentage);
                        System.out.println("Raise applied to " + e1.getEmpname());
                    } else if (e2.getId() == empId) {
                        e2.applyRaise(percentage);
                        System.out.println("Raise applied to " + e2.getEmpname());
                    } else if (e3.getId() == empId) {
                        e3.applyRaise(percentage);
                        System.out.println("Raise applied to " + e3.getEmpname());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter employee ID to update salary: ");
                    int id = sc.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();

                    if (e1.getId() == id) {
                        e1.setSalary(newSalary);
                        System.out.println("Salary updated for " + e1.getEmpname());
                    } else if (e2.getId() == id) {
                        e2.setSalary(newSalary);
                        System.out.println("Salary updated for " + e2.getEmpname());
                    } else if (e3.getId() == id) {
                        e3.setSalary(newSalary);
                        System.out.println("Salary updated for " + e3.getEmpname());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
	}
}
