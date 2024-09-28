package p2;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("String : ");
		String s = sc.nextLine();
		
		String r = s.replaceAll("\\s", "");
		System.out.println(r);
	}

}
