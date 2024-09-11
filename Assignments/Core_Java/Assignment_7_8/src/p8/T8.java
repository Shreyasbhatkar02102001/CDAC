package p8;

import java.util.Scanner;



class ArraySet{
	
	int arr1[];
	public static Scanner sc = new Scanner(System.in);
	
	
	public void setArray(int[] arr1) {
		this.arr1 = arr1;
	}
	
	public int[] getArray() {
		return this.arr1;
	}
	
}

class ArrayOps {
	
	ArraySet as = new ArraySet();
	public static Scanner sc = new Scanner(System.in);
	
	
	public void acceptArray() {
		System.out.print("\nEnter the size of array 1 : ");
		int size_1 = sc.nextInt();
		int arr1[] = new int[size_1];
		//as.arr1 = new int[size_1];
		for (int i = 0; i < size_1; i++) {
			arr1[i] = sc.nextInt();
		}
		as.setArray(arr1);
	}
	
	public void printArray() {
		int arr1[] = as.getArray();
		System.out.println("\nElements of array 1 : ");
		for (int element : arr1) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
}

public class T8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOps ar = new ArrayOps();
		int choice;
		
		do {
			System.out.println("\n1. Accept the Array");
			System.out.println("2. Print Array");
			System.out.println("3. Exit");
			System.out.print("Choice : ");
			choice = ArraySet.sc.nextInt();
			
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


