import java.util.Scanner;

/**
 * Positive or Negative number
 */
public class p1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ( n > 0 ) {
            System.out.println("Positive number ");
        }
        else if ( n < 0 ) {
            System.out.println("Negative number");
        }
        else {
            System.out.println("Zero");
        }
    }
    
}