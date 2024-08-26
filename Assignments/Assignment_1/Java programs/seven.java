package Assignment_1;

public class seven {

    //      Write a Java program that finds and prints the largest of three predefined 
// numbers using if-else statements.

    public static void main(String[] args) {
        
        int one = 233;
        int two = 34;
        int three = 45;

        if ((one > two) && (one > three)){
            System.out.println("One is largest");
        }
        else if ((two > one) && (two > three)){
            System.out.println("Two is largest");
        }
        else{
            System.out.println("Three is largest");
        }
    }


}
