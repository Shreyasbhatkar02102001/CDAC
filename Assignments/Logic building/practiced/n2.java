import java.util.Scanner;

public class n2{

	public static int factorial(int n){
		
		if (n <= 0){
			return 1;
		}
		
		return (n)*factorial(n-1);
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no : ");
		int n = sc.nextInt();
		
		int k = factorial(n);
		System.out.println("OP : "+k);
		
		
	}
}
