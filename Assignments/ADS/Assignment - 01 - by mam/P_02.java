
import java.util.Scanner;
	// sum a series of number
class P_02{

	static int display(int n){
	
		if (n == 0 ){
			return n;
		}
		
		return n + display(n-1);
	}


	public static void main(String args[]){
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter : ");
	int n = sc.nextInt();
	
	System.out.print("Sum : "+display(n));
	
	
	}

}









