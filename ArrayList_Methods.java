package collection;

import java.util.ArrayList;

public class ArrayList_Methods 
{

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		a1.add("Rohit");
		a1.add("Manish");
		a1.add("Rahul");
		a1.add("Amit");
		a1.add("Saurabh");
		
		System.out.println(a1);
		int Index_of_Amit = a1.indexOf("Amit");
		
		System.out.println(Index_of_Amit);
		System.out.println(a1.get(2));
		a1.set(1, "Ajay");
		System.out.println(a1);

	}

}
