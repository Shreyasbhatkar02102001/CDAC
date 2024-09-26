package p10;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int n = sc.nextInt();
		boolean a = false ;
		
		if (( n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)){
			a = true;
		}
		
		System.out.println(a);

	}

}
