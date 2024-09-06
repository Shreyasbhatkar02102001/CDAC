/**
 * Author: Sandeep Kulane
 * Date: 5 Sept 2024
 * Objective: To test print/println/printf
 */

 class Program{
    public static void main(String[] args) {
        //print: void
        System.out.print("Hello ");
        System.out.print("World");
        System.out.print("!!\n");

        /* println: void */
        System.out.println("Hello ");
        System.out.println("World");
        System.out.println("!!\n");

        //printf:PrintStream
        System.out.printf("%-30s%-15d%-10.2f\n","Sandeep Kulange",10003778, 45000.50f);
        System.out.printf("%-30s%-15d%-10.2f\n","Mahesh Koli",3779, 125000.50f);

    }
}   