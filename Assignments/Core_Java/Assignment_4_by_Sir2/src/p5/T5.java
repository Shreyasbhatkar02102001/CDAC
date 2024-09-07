package p5;

import java.util.Scanner;

class TollBoothRevenueManager {
	double carRate;
	double truckRate;
	double motorcycleRate;
	
	int numCar;
	int numTruck;
	int numMoto;
	
	Scanner sc = new Scanner(System.in);
//	void setTollRates() {
//		// TODO Auto-generated constructor stub
//		this.carRate = sc.nextDouble();
//		this.truckRate = sc.nextDouble();
//		this.motorcycleRate = sc.nextDouble();
//	}
	
	
	
	void acceptRecord () {
		this.numCar += sc.nextInt();
		this.numTruck += sc.nextInt();
		this.numMoto += sc.nextInt();
	}
	
	public double getCarRate() {
		return carRate;
	}

	public void setCarRate(double carRate) {
		this.carRate = carRate;
	}

	public double getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(double truckRate) {
		this.truckRate = truckRate;
	}

	public double getMotorcycleRate() {
		return motorcycleRate;
	}

	public void setMotorcycleRate(double motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}

	double calculateRevenue() {
		double totalRevenue = (numCar * carRate) + (numTruck * truckRate) + (numMoto * motorcycleRate);
        return totalRevenue;
	}
	
	public void printRecord() {
        double totalRevenue = calculateRevenue();
        System.out.println("Total Number of Vehicles:");
        System.out.println("Cars: " + numCar);
        System.out.println("Trucks: " + numTruck);
        System.out.println("Motorcycles: " + numMoto);
        System.out.println("Total Revenue Collected: ₹" + totalRevenue);
    }
	
	
}

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TollBoothRevenueManager t1 = new TollBoothRevenueManager();
		t1.acceptRecord();
		//t1.setTollRates();
		t1.printRecord();

	}

}
