package p5;

import java.util.Scanner;

class ArrayOps{
	
	private int arr1[];
	private int arr2[];
	public static Scanner sc = new Scanner(System.in);
	
	void interestionCheck() {
		int i = 0, j = 0;
		while (i != arr1.length && j != arr2.length ) {
			if (arr1[i] == arr2[j]) {
				System.out.println("\nCommon elemnet :  "+arr1[i] + " ");
				i++;
				j++;
			}
			else if (arr1[i] > arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		}
		
	}
	
	public void acceptArray() {
		System.out.print("\nEnter the size of array 1 : ");
		int size_1 = sc.nextInt();
		this.arr1 = new int[size_1];
		for (int i = 0; i < size_1; i++) {
			this.arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter the size of array 2 : ");
		int size_2 = sc.nextInt();
		this.arr2 = new int[size_2];
		for (int i = 0; i < size_2; i++) {
			this.arr2[i] = sc.nextInt();
		}
	}
	
	public void printArray() {
		System.out.println("\nElements of array 1 : ");
		for (int element : this.arr1) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("Elements of array 2 : ");
		for (int element : this.arr2) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOps ar = new ArrayOps();
		int choice;
		
		do {
			System.out.println("\n1. Accept the Array");
			System.out.println("2. Intersection print ");
			System.out.println("3. Print Array");
			System.out.println("4. Exit");
			System.out.print("Choice : ");
			choice = ArrayOps.sc.nextInt();
			
			switch (choice) {
			
			case 1:
				ar.acceptArray();
				break;
				
			case 2: 
				ar.interestionCheck();
				break;
			
			case 3:
				ar.printArray();
				break;
				
			case 4:
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
