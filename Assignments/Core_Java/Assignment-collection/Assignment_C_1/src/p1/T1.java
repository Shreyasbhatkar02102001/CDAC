package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class T1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		List<Integer> ar1 = new ArrayList<Integer>();
		System.out.println("Enter Elements : ");
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(20);
		ar1.add(40);
		
		Set<Integer> s1 = new HashSet<Integer>();
		List<Integer> ar2 = new ArrayList<Integer>();
		
		for (Integer i : ar1) {
			if (!s1.add(i)) {
				ar2.add(i);
			}
		}
		
		System.out.println(ar1);
		System.out.print(" Duplicates : ");
		System.out.println(ar2);

	}

}
