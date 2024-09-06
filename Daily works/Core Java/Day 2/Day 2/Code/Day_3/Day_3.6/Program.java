class Program{
    //public static String toString(int i): Integer class
    public static void main(String[] args) {
        int num1 = 10;
        //String strNumber = Integer.toString( num1 );//Boxing
        String strNumber = String.valueOf(num1);    //Boxing
        System.out.println( strNumber );
    }
}   