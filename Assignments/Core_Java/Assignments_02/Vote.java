package c_java;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		
		if ( age < 18 ) {
			System.out.println("not eligible for voting");
		}
		else {
			System.out.println("Eligible for voting ");
		}
		
		
	}

}
