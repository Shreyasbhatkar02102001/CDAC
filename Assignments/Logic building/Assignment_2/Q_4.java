package Assignment_2;

import java.util.Scanner;

public class Q_4 {
	
//	If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
//	If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
//	If the total purchase is less than Rs.500, apply a 5% discount. 
//	Additionally, if the user has a membership card, increase the discount by 5%. 

//	Discounted Price = Original Price × (1 - Discount Percentage/100)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Purchase Amount : ");
		int purchase = sc.nextInt();
		System.out.println("Do you have membership card : if yes then type Y else type N");
		String s = sc.next();
		int dp = 0, dpage = 0;
		
		if (purchase >= 1000) {
			if (s == "Y") {
				dpage = 25;
				dp = purchase * ( 1 - (dpage/100));
				System.out.println("Discounted price : "+ dp);
			}
			else {
				dpage = 20;
				dp = purchase * ( 1 - (dpage/100));
				System.out.println("Discounted price : "+ dp);
			}
		}
		else if (purchase < 1000 ) {
			if (s == "Y") {
				dpage = 15;
				dp = purchase * ( 1 - (dpage/100));
				System.out.println("Discounted price : "+ dp);
			}
			else {
				dpage = 10;
				dp = purchase * ( 1 - (dpage/100));
				System.out.println("Discounted price : "+ dp);
			}
		}
		else {
			if (s == "Y") {
				dpage = 10;
				dp = purchase * ( 1 - (dpage/100));
				System.out.println("Discounted price : "+ dp);
			}
			else {
				dpage = 5;
				dp = purchase * ( 1 - (dpage/100));
				System.out.println("Discounted price : "+ dp);
			}
		}
		sc.close();
		

	}

}
