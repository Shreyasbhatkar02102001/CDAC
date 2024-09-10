package p4;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int dup;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Unsorted : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("Sorted : ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[j] != arr[i]) {
				arr[++j ] = arr[i];
			}
		}

		//arr[j++] =arr[n-1];
		
		System.out.println();
		System.out.println("remove duplicates : ");
		
		for (int i = 0; i <= j; i++) {
			System.out.print(arr[i] + " ");
		
		}
		
	}

}
