
import java.util.Scanner;
	// sum a series of number
class P_04{

	static int display(int n){
	
		if (n <= 1 ){
			return n;
		}
		
		return  display(n-1) + display(n-2);
	}


	public static void main(String args[]){
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter : ");
	int n = sc.nextInt();
	int count = 0, temp = n;
	
	while (temp < 0){
		temp = n / 10;
		count++
	}
	
	
	}

}









