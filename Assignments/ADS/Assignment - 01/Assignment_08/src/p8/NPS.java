package p8;

public class NPS {
	
	public static void NRC(String s)
    {
        int n = s.length();
        char arr[] = new char[100];
        char a[] = new char[100];

        for (int i = 0; i < n; ++i) {
            //boolean found = true;

            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    a[i] = s.charAt(i);
                    break;
                	//found = false;
                    //break;
                }
            }
            //System.out.println(a); 
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programming";
		NRC(s);

	}

}
