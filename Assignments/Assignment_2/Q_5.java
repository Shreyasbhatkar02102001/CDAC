package Assignment_2;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int subMarks[] = new int[3];
		int count = 0;
		
		for (int i = 0; i < 3; i++) {
			subMarks[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			if (subMarks[i] < 40) {
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
