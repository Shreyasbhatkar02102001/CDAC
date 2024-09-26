
import java.util.Scanner;
	// sum a series of number
class P_03{

	static int display(int n){
	
		if (n == 0 ){
			return 1;
		}
		
		return n * display(n-1);
	}


	public static void main(String args[]){
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter : ");
	int n = sc.nextInt();
	
	System.out.print("Factorial : "+display(n));
	
	
	}

}









