package collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Behaviour 
{

	public static void main(String[] args) 
	{
          
		 Set  s1  = new TreeSet();
		 //Check indexing
		 s1.add(12);
		 s1.add(6);
		 s1.add(24);
		 s1.add(20);
		 s1.add(33);
		 System.out.println(s1);
		 //Check Duplicate
		 s1.add(6);
		 s1.add(6);
		 System.out.println(s1);
		 //Null Checking
		 s1.add(null);
		 s1.add(null);
		 System.out.println(s1);
		 
	}

}
