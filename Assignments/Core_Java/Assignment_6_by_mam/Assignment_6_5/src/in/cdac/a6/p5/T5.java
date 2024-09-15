package in.cdac.a6.p5;

/*
 * 		Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
 * 		Create two subclasses Car and Motorcycle. 
 * 		Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
 */

class Vehicle {
    
    public void startEngine() {
        System.out.println("Vehicle engine is starting");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine is stopping");
    }
}


class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine is starting");
    }
    

    @Override
    public void stopEngine() {
        System.out.println("Car engine is stopping");
    }
}


class Motorcycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is starting");
    }
    

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine is stopping");
    }
}


public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Vehicle myCar = new Car();
	        myCar.startEngine();  
	        myCar.stopEngine(); 
	        
	        
	        
	       
	        Vehicle myMotorcycle = new Motorcycle();
	        myMotorcycle.startEngine(); 
	        myMotorcycle.stopEngine(); 
	}

}
