import java.util.Scanner;

public class trial1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int rem = n % m;
        int quotient = (n - rem)/ m;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + rem);
    }
}
