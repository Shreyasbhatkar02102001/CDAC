package p3;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class T3 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbccddeffg";
		
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i); // character is assugned to ch

			if (myMap.containsKey(ch)) {  // checks whether input ch matches the key or not
				myMap.put(ch, myMap.get(ch)+1 );   // if ch matches the key then ... value is incremented by 1 where key exists
			}
			else {
				myMap.put(ch, 1);  // if character doesn't exist then they are added in map with value 1
			}
		}
		
		
		// for loop to display output
		for (Map.Entry<Character, Integer> entrySet : myMap.entrySet()) {
			
			if (entrySet.getValue() == 1) {    // checks which first value is equal to 1
				System.out.println(entrySet.getKey());   // print the key where value is equal to 1
				break;   // to break out of loop
			}
		}

	}

}
