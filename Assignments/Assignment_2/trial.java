import java.util.Scanner;

public class trial{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'u' || c == 'e' || c == 'i' || c == 'o') {
            System.out.println(c + " is a consonant.");
        }
        else{
            System.out.println(c + " is not a consonant.");
        }
        
    }
}