package p7;

import java.util.Scanner;


class ArrayOps{
	
	private int arr1[];
	public static Scanner sc = new Scanner(System.in);
	
	
	
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
}

public class T7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOps ar = new ArrayOps();
		int choice;
		
		do {
			System.out.println("\n1. Accept the Array");
			System.out.println("2. Create an array ");
			System.out.println("3. Print Array");
			System.out.println("4. Exit");
			System.out.print("Choice : ");
			choice = ArrayOps.sc.nextInt();
			
			switch (choice) {
			
			case 1:
				ar.acceptArray();
				break;
				
//			case 2: 
//				break;
			
			case 2:
				ar.printArray();
				break;
				
			case 3:
				System.out.println("\n**********************************");
				System.out.println("\tProgram End");
				break;
				
			default :
				System.out.println("\n**********************************");
				System.out.println("\tInvalid input");
				break;
			}
		}while (choice != 3);

	}

}
