import java.util.Scanner;

public class p9 {

    // prime number within a given range
    public static boolean isPrime (int n){

        if (n < 2){
            return true;
        }
        else {
            for ( int i = 2; i < n; i++){
                if ( n % i == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = n+1; i < m; i++) {
            if (isPrime(i) == false){ 
                System.out.println(i);
            }
        }

    }
}
