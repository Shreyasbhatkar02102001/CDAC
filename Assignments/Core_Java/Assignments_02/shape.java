package c_java;
import java.util.Scanner;
public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Enter the number based on following options\n"
					+ "1. Circle\n"
					+ "2. Square\n"
					+ "3. Rectangle\n"
					+ "4. Triangle\n"
					+ "0. to Exit\n");
			
			n = sc.nextInt();
            switch (n) {
			
			case 1: 
				System.out.print("Enter the radius : ");
				int r = sc.nextInt();
				System.out.println("Area of circle : "+Math.PI*(r*r));
				break;
				
			case 2:
				System.out.print("Enter the side : ");
				int s = sc.nextInt();
				System.out.println("Area of square : "+s*s);
				break;
				
			case 3:
				System.out.print("Enter length and breadth : ");
				int l = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("Area of rectangle : "+ l*b);
				break;
				
			case 4:
				System.out.print("Enter breadth and height : ");
				int br = sc.nextInt();
				int h = sc.nextInt();
				System.out.println("Area of Triangle : "+ ((h*br)/2));
				break;
		
			default:
				System.out.println("Exited");
				break;
			}
			
		   }while (n != 0) ;
		
		
	}

}
