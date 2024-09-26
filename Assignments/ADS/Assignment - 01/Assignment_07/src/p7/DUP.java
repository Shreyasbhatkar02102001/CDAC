package p7;

public class DUP {
	
	public static void NRC(String s)
    {
        int n = s.length();

        for (int i = 0; i < n; ++i) {
            for (int j = i+1; j < n; ++j) {
                if ( s.charAt(i) == s.charAt(j)) {
                    
                	System.out.print(s.charAt(i)+" ");
                }
            }
        }
    }

	public static void main(String[] args) {
		String s = "programming";
		NRC(s);

	}

}
