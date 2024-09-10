package p3;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (min > arr[i]){
				min = arr[i];
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		
	}

}
