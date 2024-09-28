package p2;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {0, 0, 1, 1, 2, 2, 3, 3};
		int arr1[] = new int[arr.length];
		int j = 0, n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			if (arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		
		for (int i = 0; i < j; i++) {
			System.out.println(arr[i]);
		}
	}

}
