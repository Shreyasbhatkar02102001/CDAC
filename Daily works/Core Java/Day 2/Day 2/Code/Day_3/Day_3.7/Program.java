class Program{
    //public static int parseInt(String s)throws NumberFormatException: Integer class
    public static void main123(String[] args) {
       String str = new String("123");
       int num1 = Integer.parseInt( str );//UnBoxing
       System.out.println( "Num1    :   "+num1);
    }

    public static void main(String[] args) {
        String str = new String("A1$b2#C3");
        int num1 = Integer.parseInt( str );//UnBoxing: NumberFormatException
        System.out.println( "Num1    :   "+num1);
     }
}   