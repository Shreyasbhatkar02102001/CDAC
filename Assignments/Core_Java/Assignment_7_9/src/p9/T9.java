package p9;

import java.util.Scanner;

class Airplane{
	
	private int arr[][];
	int  r,c;
	
	
	
	public void setArray(int arr[][]) {
		this.arr = arr;
	}
	
	public int[][] getArray(){
		return this.arr;
	}
	
}

class AirplaneOps{
	
	Airplane ar = new Airplane();
	static Scanner sc = new Scanner(System.in);
	
	void bookSeat() {
		int arr[][] = ar.getArray();
		System.out.println("Enter seat no that you want to book");
		System.out.println("Enter value of row : ");
		int m = sc.nextInt();
		System.out.println("Enter value of col : ");
		int n = sc.nextInt();
		if (m < ar.r || n < ar.c) {
			if ( arr[m][n] == 0) {
				arr[m][n] = 1;
				System.out.println("Seat booked successfully");
			}
			else {
				System.out.println("Seat already booked");
			}
		}
		else {
			System.out.println("Invalid seat");
		}
	}
	
	void cancelSeat() {
		int arr[][] = ar.getArray();
		System.out.println("Enter seat no that you want to book");
		System.out.println("Enter value of row : ");
		int m = sc.nextInt();
		System.out.println("Enter value of col : ");
		int n = sc.nextInt();
		if (m < ar.r || n < ar.c) {
			if ( arr[m][n] == 1) {
				arr[m][n] = 0;
				System.out.println("Seat cancelled successfully");
			}
			else {
				System.out.println("Seat is not book");
			}
		}
		else {
			System.out.println("Invalid seat");
		}
	}
	
	void availableSeat() {
		int arr[][] = ar.getArray();
		System.out.println("Enter seat no that you want to book");
		System.out.println("Enter value of row : ");
		int m = sc.nextInt();
		System.out.println("Enter value of col : ");
		int n = sc.nextInt();
		if (m < ar.r || n < ar.c) {
			if ( arr[m][n] == 0) {
				System.out.println("Seat is available.");
			}
			else {
				System.out.println("Seat already booked");
			}
		}
		else {
			System.out.println("Invalid seat");
		}
	}
	
	void acceptArray() {
		System.out.println("Enter value of row : ");
		ar.r = sc.nextInt();
		System.out.println("Enter value of col : ");
		ar.c = sc.nextInt();
		int arr[][] = new int[ar.r][ar.c];
		for (int i = 0; i < ar.r; i++) {
			for (int j = 0; j < ar.c; j++) {
				arr[i][j] = 0;
			}
		}
		ar.setArray(arr);
	}
	
	void printArray() {
		int arr[][] = ar.getArray();
		for (int[] part: arr) {
			for (int element : part) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
}

public class T9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirplaneOps as = new AirplaneOps();
        int choice;

        do {
            System.out.println("\n1. Accept the Array");
            System.out.println("2. Check Availability of seats");
            System.out.println("3. Book a seat");
            System.out.println("4. Cancel a seat");
            System.out.println("5. Print the Array");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = AirplaneOps.sc.nextInt();

            switch (choice) {
                case 1:
                    as.acceptArray(); 
                    break;
                case 2:
                    as.availableSeat();
                    break;
                case 3:
                    as.bookSeat(); 
                    break;
                case 4:
                    as.cancelSeat();
                    break;
                case 5:
                    as.printArray();
                    break;
                case 6:
                	System.out.println("\n*********************************");
                    System.out.println("\n\tProgram End");
                    break;
                default:
                	System.out.println("\n*********************************");
                    System.out.println("\n\tInvalid input");
                    break;
            }
        } while (choice != 6);

	}

}
