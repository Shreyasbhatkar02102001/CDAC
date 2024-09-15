package in.cdac.a4.p4;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;

        // Widening to double
        double d = num;
        System.out.println("Double value: " + d);

        // Widening to float
        float f = num;
        System.out.println("Float value: " + f);

        // Converting to String
        String str = Integer.toString(num);
        System.out.println("String value: " + str);

        // Converting to boolean
        boolean b = (num != 0);
        System.out.println("Boolean value: " + b);
	}

}
