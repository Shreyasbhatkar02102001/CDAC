package p5;

public class Gcd {
	
	static int gcd(int a, int b) {
		
		int n = Math.max(a, b);
		int ans=0, max = Integer.MIN_VALUE;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n  % i == 0) {
				max = i;
			}
		}
		return  max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 54;
		int b = 24;
		
		System.out.println(gcd(a,b));;

	}

}
