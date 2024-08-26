package Assignment_2;

import java.util.Scanner;

public class Q_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Score : ");
        int score = sc.nextInt();

        if (score >= 90){
            System.out.println("A");
        }
        else if ((80 < score) && (score > 89)){
            System.out.println("B");
        }
        else if ((70 < score) && (score > 79)){
            System.out.println("C");
        }
        else if ((60 < score) && (score > 69)){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }

        sc.close();
    }
}
