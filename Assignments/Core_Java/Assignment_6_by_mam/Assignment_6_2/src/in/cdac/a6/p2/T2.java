package in.cdac.a6.p2;

/*
 * 2)	Create a base class Vehicle with attributes like make and year. 
 * Provide a constructor in Vehicle to initialize these attributes. 
 * Derive a class Car that has an additional attribute model and write a constructor that initializes make, year, and model. 
 * Write a program to create a Car object and display its details.
 */

class Vehicle {
	private int make;
	private int year;
	
	Vehicle(){
		this(0,0);
	}
	
	Vehicle (int make,int year){
		this.make = make;
		this.year = year;
	}

	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	void display() {
		System.out.println("Make : "+getMake());
		System.out.println("Year : "+getYear());
	}
	
}

class Car extends Vehicle{
	private int model;

	public Car() {
		super();
		this.model = 0;
		// TODO Auto-generated constructor stub
	}

	public Car(int make, int year, int model) {
		super(make, year);
		this.model = model;
		// TODO Auto-generated constructor stub
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	void display() {
		super.display();
		System.out.println("Model : "+getModel());
	}
	
}

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car();
		c1.display();
	}

}
