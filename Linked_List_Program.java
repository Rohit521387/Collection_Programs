package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List_Program 
{

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		
		l1.add("Rohit");
		l1.add("Rahul");
		l1.add("Rohan");
		l1.add("Ram");
		l1.add("Rinku");
		
		System.out.println(l1);
		
		l1.addFirst("Renu");
		System.out.println(l1);
		
		l1.addLast("Ramesh");
		System.out.println(l1);
		
		l1.removeFirst();
		System.out.println(l1);
		
		l1.removeLast();
		System.out.println(l1);
		
		l1.pollFirst();
		System.out.println(l1);
		
		l1.pollLast();
		System.out.println(l1);
		
	    Iterator i1	= l1.iterator();
	   
	    while (i1.hasNext())
	    {
		   System.out.println(i1.next());
	    }
		System.out.println("===========================================");
		
	    ListIterator i2	= l1.listIterator();
	    
	    while (i2.hasNext())
	    {
	    	System.out.println(i2.next());
	    }
	    
	    System.out.println("============================================");
	    
	    while (i2.hasPrevious())
	    {
	    	System.out.println(i2.previous());
	    }
	    	
	    
	    		
	 }

}
