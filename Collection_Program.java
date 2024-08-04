//Collection Methods
package collection;

import java.util.ArrayList;

public class Collection_Program 
{

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		a1.add("Rohit");
		a1.add("Ajay");
		a1.add("Mayur");
		a1.add("Rohan");
		a1.add(12345);
		a1.add('A');
		a1.add(false);
		a1.add(null);
		a1.add("Rohit");
		System.out.println(a1);
		
		System.out.println("The size of a1 is-->  "+a1.size());
		
		ArrayList a2 = new ArrayList();
		
		a2.addAll(a1);
		a2.add("Ram");
		System.out.println(a2);
		
		
		System.out.println(a1.contains("Rohit"));
		System.out.println(a2.containsAll(a1));
		
		System.out.println(a1.isEmpty());
		
		ArrayList a3 = new ArrayList();
		System.out.println(a3.isEmpty());
		
		ArrayList a4 = new ArrayList();
		
		a4.add("Ramesh");
		a4.add("Anjali");
		a4.add("Priyanka");
		System.out.println("Before removal---> "+a4);
		a4.remove("Anjali");
		System.out.println("After removal ----> "+a4);
		
		a4.removeAll(a4);
		System.out.println("After removing all---> "+a4);
		
		a4.addAll(a1);
		System.out.println(a1);
		a4.add("Mahesh");
		System.out.println(a4);
		a4.removeAll(a1);
		System.out.println(a4);
		
		ArrayList a5 = new ArrayList();
		
		a5.add("1");
		a5.add("2");
		a5.add("3");
		a5.add("4");
		a5.add("5");
		
		System.out.println("Before Clear a5 ---> "+a5);
		a5.clear();
		System.out.println("After clear a5 ---> "+a5);
		
		
	}

}
