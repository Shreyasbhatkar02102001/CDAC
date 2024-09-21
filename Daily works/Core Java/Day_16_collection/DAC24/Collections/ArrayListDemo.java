import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{
		//List <---- ArrayList

		//ArrayList <String> strList1 = new ArrayList<String>();
		//List <String> strList1 = new ArrayList<String>();
		//List <String> strList1 = new LinkedList<String>();
		Set <String> strList1 = new HashSet<String>();

		strList1.add("Mohan");
		strList1.add("Geeta");
		strList1.add("Mercy");

		//Print list elements using for each
		System.out.println("strList1 elements:");
		for(String s : strList1)
		{
			System.out.println(s);

		}


	}
}
