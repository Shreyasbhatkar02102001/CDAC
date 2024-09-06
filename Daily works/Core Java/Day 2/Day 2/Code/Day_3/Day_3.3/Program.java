class Program{
    public static void main(String[] args) {
        //int num1 = new int( 10 );   //Not OK
        int num1 = 10;//OK
        Integer num2 = new Integer( 10 );   //OK

        String s1 = new String("Sandeep");
        //String s1;  //Object reference / reference 
        //new String("Sandeep");    //Instance
        System.out.println(s1);

        String s2 = "Kulange";
        //String s2;    //Object reference / reference 
        //"Kulange";    //String constant / String literal
        System.out.println(s2);
    }
}   