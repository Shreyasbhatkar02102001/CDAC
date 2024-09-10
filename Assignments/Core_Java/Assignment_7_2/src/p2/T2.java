package p2;

import java.util.Scanner;

public class T2 {
	static int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);
	int acceptRecord() {
		return sc.nextInt();
	}
	
	void printRecord() {
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = new int[5];
		T2 t1 = new T2();
		for (int i = 0; i < 5; i++) {
			arr[i] = t1.acceptRecord();
		}
		
		t1.printRecord();
	}

}
