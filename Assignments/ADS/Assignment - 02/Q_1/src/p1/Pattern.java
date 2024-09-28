package p1;

import java.util.Scanner;

public class Pattern {
	
	static void p(int n, int cr) {
		if (cr > n) {
			return ;
		}
		
		for (int i = 0; i < cr; i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		p(n, cr+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int n = sc.nextInt();
		int cr = 1;
		
		p(n, cr);

	}

}
