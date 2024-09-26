
import java.util.Scanner;
	// sum a series of number
class P_01{

	static int display(int n){
	
		if (n == 0 ){
			return n;
		}
		System.out.print(n + " ");
		return n + display(n-1);
	}


	public static void main(String args[]){
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter : ");
	int n = sc.nextInt();
	
	display(n);
	
	
	}

}









