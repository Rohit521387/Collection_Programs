package collection;

import java.util.ArrayList;
import java.util.List;

public class List_Behaviour 
{

	public static void main(String[] args)
	{
	    
	   List l1 = new ArrayList();
	   //Check indexing
	   l1.add(15);
	   l1.add(10);
	   l1.add(20);
	   l1.add(44);
	   l1.add(50);
	   System.out.println(l1);
	   //Check Duplicate
	   l1.add(10);
	   l1.add(10);
	   System.out.println(l1);
	   //Null values Checking
	   l1.add(null);
	   l1.add(null);
	   System.out.println(l1);
	   
	    
	 }

}
