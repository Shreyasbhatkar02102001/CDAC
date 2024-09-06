package c_java;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month no : ");
		int m = sc.nextInt();
		int result;
		if (m == 12 || m == 1 || m == 2) {
			result = 1;
		}
		else if (m > 2 && m < 6) {
			result = 2;
		}
		else if (m > 5 && m < 9) {
			result = 3;
		}
		else if (m > 8 && m < 12 ) {
			result = 4;
		}
		else {
			result = 0;
		}
		
		switch (result) {
		
		case 1:
			System.out.println("winter");
			break;
		
		case 2:
			System.out.println("spring");
			break;
		
		case 3:
			System.out.println("summer");
			break;
		
		case 4:
			System.out.println("Autumn");
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}
		
	}

}
