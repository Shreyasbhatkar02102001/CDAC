package p3;
import java.util.Scanner;

public class Factorial {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int n = sc.nextInt(), fact = 1;
		
		for (int i = 1; i <= n; i++) {
			fact *=i;
		}
		
		System.out.print("Fact : "+fact);
				
			

	}

}
