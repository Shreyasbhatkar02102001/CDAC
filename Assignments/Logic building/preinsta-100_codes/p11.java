import java.util.Scanner;

public class p11 {
    
    /// Reverse of a number

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=0,Reverse=0;

        while (n > 0) {
            r = n % 10;
            Reverse = (Reverse * 10) + r;
            n = n /10;
            

        }
        System.out.println(Reverse);
    }

}
