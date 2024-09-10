package p1;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();

	}

}
