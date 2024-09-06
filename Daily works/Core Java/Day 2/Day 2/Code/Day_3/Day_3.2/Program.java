class Program{
    int num1;   //Non Field( also called as instance variable )
    static int num2;   //Static Field(also called as class level variable )

    public static void main(String[] args) {
        //System.out.println(num1);   //Not OK
        //System.out.println(Program.num1);   //Not OK

        Program p = new Program();  //Here p is object reference / reference and new Program() is instance
        System.out.println(p.num1); //OK

        //System.out.println(num2); //OK
        System.out.println(Program.num2); //OK

        /*
            int num3;    //Method Local Variable
            System.out.println(num3);   //error: variable num3 might not have been initialized
        */
        /*
            int num3 = 10; //Initialization
            System.out.println(num3);   //OK
        */

        int num3;
        num3 = 10;  //Assignment
        System.out.println(num3);   //OK
    }
}   