import java.util.Scanner;

public class p8 {
    
    // Prime number

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;

        if (n == 0 || n == 1){
            System.out.println("Not a prime number");
        }
        else {
            for (int i = 2; i < (n/2); i++) {
                if ( n % i == 0 ) {
                    flag = 1;
                    System.out.println("not a prime number");
                    break;
                }
            }
        }
        if (flag == 0){
            System.out.println("prime number");
        }
    }
}