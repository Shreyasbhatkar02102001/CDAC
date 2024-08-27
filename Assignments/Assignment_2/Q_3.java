package Assignment_2;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator : ");
        String s = sc.nextLine();

        System.out.println("Enter the input :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (s) {
            case "+":
                System.out.println(a + b);
                break;
            
            case "-":
                System.out.println(a - b);
                break;

            case "*":
            	System.out.println("*");
            	break;

            case "/":

            if ( b == 0){
                System.out.println("Error: Invalid");
                break;
            }
            else {
                System.out.println(a/b);
                break;
            }
        
            default:
            	System.out.println("Error: Invalid Symbol");
            	break;
        }
	}

}
