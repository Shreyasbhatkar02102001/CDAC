package p2;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Int : ");
		int n = sc.nextInt();
		int  count=0, rev=0;
		int t= 0;
		
		while ( n > 0 ) {
			t= n%10;
			rev = rev * 10 + t;
			n= n/ 10;
		}
		
		System.out.println(rev);
	}

}
