package p2;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("String : ");
		String s = sc.nextLine();
		String rev = "";
		boolean a =  false;
		
		for (int i = s.length()-1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		
		if (rev.equals(s)) {
			a = true;
		}
		else {
			a = false;
		}
		
		System.out.println(a);
	}

}
