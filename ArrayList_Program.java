package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Program 
{

public static void main(String[] args) 
{
		ArrayList a1 = new ArrayList();
		
		a1.add("Rohit");
		a1.add("Ajay");
		a1.add("Mayur");
		a1.add("Aditi");
		a1.add("Rohan");
		
		System.out.println(a1);
		
		System.out.println("...................................");
		
		Iterator i1 = a1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("....................................");
        
		ListIterator  i2  = a1.listIterator();
		
		while (i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("....................................");
		
	
		while (i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
}

}
