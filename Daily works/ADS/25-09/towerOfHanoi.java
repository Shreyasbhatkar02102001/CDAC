
import java.util.Scanner;

public class towerOfHanoi{
	
	static void toh(int n,char s, char inter, char d){
		
		if ( n == 1 ){
			System.out.println("Disk from "+s+" to "+d);
		}
		else{
			toh(n-1, s, d, inter);
			System.out.println("Disk from "+s+" to "+d);
			toh(n-1, inter, s, d);
		}
		
	}

	public static void main(String args[]){
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter : ");
		//int n = sc.nextInt();
		int n = 3;
		
		toh(n, 'A','B','C');
		
	}
}