package p8;

public class NPS {
	
	public static void NRC(String s) {
        int n = s.length();
        boolean found = false;

        for (int i = 0; i < n; ++i) {
            found = true;

            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                System.out.println("First non-repeated character : " + s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "stress";
		NRC(s);

	}

}
