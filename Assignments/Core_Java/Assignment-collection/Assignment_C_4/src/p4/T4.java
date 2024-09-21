package p4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> m1 = new ArrayList<>();
		List<Integer> m2 = new ArrayList<Integer>();
		List<Integer> sortedList = new ArrayList<Integer>();
		
		m1.add(12);
		m1.add(67);
		m1.add(67);
		m1.add(35);
		m1.add(9);
		
		m2.add(89);
		m2.add(64);
		m2.add(84);
		
//		Collections.sort(m1);
//		System.out.println("m1 : "+ m1);
//		Collections.sort(m2);
//		System.out.println("m2 : "+m2);
		
		sortedList.addAll(m1);
		sortedList.addAll(m2);
		
		Collections.sort(sortedList);
		System.out.println("Sorted List : "+ sortedList);
		
		
	}

}
