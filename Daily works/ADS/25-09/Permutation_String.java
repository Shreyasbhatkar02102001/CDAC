
import java.util.Scanner;

 class Permutation_String{
	
	static void display(String s, String r){
		
		if (s.length() == 0){
			System.out.println(r+ " ");
			return;
		}
		
	for (int i = 0; i < s.length(); i++){
		
		char ch = s.charAt(i);   // ABC -> A|BC
		String ros = s.substring(0,i)+s.substring(i+1);  // A|BC
		display( ros, r + ch );  //  recursive
	}
		
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		String s = sc.next();
		
		display(s,"");
	}
}