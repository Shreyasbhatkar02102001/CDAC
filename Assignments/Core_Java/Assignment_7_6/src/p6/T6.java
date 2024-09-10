package p6;

import java.util.Scanner;

//import p6.ArrayOps;

class ArrayOps{
	
	private int arr1[];
//	private int n;
	public static Scanner sc = new Scanner(System.in);
	
//	int range(int n) {
//		return this.n = n;
//	}
	
	void missing() {
		int m = arr1.length+1;
		int total = (m * (m + 1))/2;
		//System.out.print("Missing Elements are : ");
		for (int i = 0; i < arr1.length; i++) {
			total = total - arr1[i];
		}
		System.out.println("Missing Elements are : "+total);
		
	}
	
	public void acceptArray() {
		System.out.print("\nEnter the size of array 1 : ");
		int size_1 = sc.nextInt();
		this.arr1 = new int[size_1];
		for (int i = 0; i < size_1; i++) {
			this.arr1[i] = sc.nextInt();
		}
	}
	
	public void printArray() {
		System.out.println("\nElements of array 1 : ");
		for (int element : this.arr1) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public void getReleased() {
		sc.close();
	}
}

public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOps ar = new ArrayOps();
		int choice;
		
		do {
			System.out.println("\n1. Accept the Array");
			//System.out.println("2. Range ");
			System.out.println("2. Missing");
			System.out.println("3. Print Array");
			System.out.println("4. Exit");
			System.out.print("Choice : ");
			choice = ArrayOps.sc.nextInt();
			
			switch (choice) {
			
			case 1:
				ar.acceptArray();
				break;
				
			//case 2: 
				//System.out.println("Enter the range : ");
				//int n = ArrayOps.sc.nextInt(); 
				//ar.range(ar.arr1.length);
				//break;
			
			case 2:
				ar.missing();
				break;
			
			case 3:
				ar.printArray();
				break;
				
			case 4:
				ar.getReleased();
				System.out.println("\n**********************************");
				System.out.println("\tProgram End");
				break;
				
			default :
				System.out.println("\n**********************************");
				System.out.println("\tInvalid input");
				break;
			}
		}while (choice != 4);

	}

}
