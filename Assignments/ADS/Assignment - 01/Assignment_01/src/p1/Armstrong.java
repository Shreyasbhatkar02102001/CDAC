package p1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int n = sc.nextInt();
		int m=n, count=0, t=0, ans=0;
		
		while (m > 0) {
			m = m / 10;
			count++;
		}
		
		m = n;
		
		for (int i = 0; i < count; i++) {
			t = m % 10;
			ans += (int) Math.pow(t, count);
			m =  m / 10;
		}
		
		if ( ans == n ) {
			System.out.println(n + " is a Armstrong number");
		}
		else {
			System.out.println(n + " is not a Armstrong number");
		}

	}

}
