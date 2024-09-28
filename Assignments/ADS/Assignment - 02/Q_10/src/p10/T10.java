package p10;

import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 1, 2, 3, 4, 5};
		int n = sc.nextInt() ;

		for (int i = 0; i < n; i++) {
			int first = arr[0], j;                ///  last element of an array is placed in first variable becoz we cannot store storage first element as it is

			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];                         // next element is store in current element   e.g :   arr[1] = arr[2]

				                             // and then first element value is assigned

			}
			arr[j] = first;   
		}
		
		for(int il=0;il<arr.length; il++) {
			System.out.print(arr[il]+ " ");               // array is printed
		}
	}
}
