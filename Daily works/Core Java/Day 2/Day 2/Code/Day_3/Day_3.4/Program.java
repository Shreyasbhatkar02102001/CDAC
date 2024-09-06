class Program{
    public static void main(String[] args) {
        int num1 = 10;
        //System.out.println( num1 );
        System.out.println( "Num1   :   "+num1 );

        //int num2 = num1;    //OK
        //double num2 = ( double )num1; //Widening:OK
        double num2 = num1; //Widening
        System.out.println( "Num2   :   "+num2 );//OK
    }
}   