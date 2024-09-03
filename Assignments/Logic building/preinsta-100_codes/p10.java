import java.util.Scanner;

public class p10 {
    
    // Sum of digits of a number

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int digits = sc.nextInt();
       int sum =0 ;

       while ( digits != 0){
        sum += digits % 10;
        digits = digits / 10;
       }

       System.out.println(sum);
        
    }
}
