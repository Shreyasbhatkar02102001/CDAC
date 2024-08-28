package Assignment_2;

import java.util.Scanner;

public class Q_2 {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int dayNumber = choice;

        System.out.println("1: Monday /n 2: Tuesday /n 3: Wednesday /n 4: Thursday /n 5: Friday /n 6: Saturday /n 7: Sunday");

        switch (choice) {
            case 1:switch (dayNumber) {
                case 6:
                    System.out.println("It's a weekend");
                    break;
                case 7:
                    System.out.println("It's a weekend");
                    break;
                default:
                    System.out.println("It's a weekday");
                    break;
            }
            case 2: switch (dayNumber) {
                case 6:
                    System.out.println("It's a weekend");
                    break;
                case 7:
                    System.out.println("It's a weekend");
                    break;
                default:
                    System.out.println("It's a weekday");
                    break;
            }
            case 3: switch (dayNumber) {
                case 6:
                    System.out.println("It's a weekend");
                    break;
                case 7:
                    System.out.println("It's a weekend");
                    break;
                default:
                    System.out.println("It's a weekday");
                    break;
            }
            case 4: switch (dayNumber) {
                case 6:
                    System.out.println("It's a weekend");
                    break;
                case 7:
                    System.out.println("It's a weekend");
                    break;
                default:
                    System.out.println("It's a weekday");
                    break;
            }
            case 5: switch (dayNumber) {
                case 6:
                    System.out.println("It's a weekend");
                    break;
                case 7:
                    System.out.println("It's a weekend");
                    break;
                default:
                    System.out.println("It's a weekday");
                    break;
            }
            case 6: switch (dayNumber) {
                case 6:
                    System.out.println("It's a weekend");
                    break;
                case 7:
                    System.out.println("It's a weekend");
                    break;
                default:
                    System.out.println("It's a weekday");
                    break;
            }
            case 7: switch (dayNumber){
                case 6:
                    System.out.println("It's a weekend");
                    break;
                case 7:
                    System.out.println("It's a weekend");
                    break;
                default:
                    System.out.println("It's a weekday");
                    break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
