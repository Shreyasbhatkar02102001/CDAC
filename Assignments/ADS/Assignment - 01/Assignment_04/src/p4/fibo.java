package p4;

public class fibo {

	static int display(int n) {
		
		if (n <= 1) {
			return n;
		}
		return display(n-1) + display(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		for (int i = 0; i <= n; i++) {
			System.out.print(display(i)+" ");
		}

	}

}
