class Program{
    public static void main(String[] args) {
        //double num1 = 10.5; //OK
        double num1 = 10.5d; //OK
        System.out.println("Num1    :   "+num1);

        //double num2 = num1; //OK
        int num2 = ( int )num1; //OK: Narrowing
        //int num2 = num1; //Not OK
        System.out.println("Num2    :   "+num2);
    }
}   