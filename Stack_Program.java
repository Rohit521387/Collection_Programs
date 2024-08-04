package collection;

import java.util.Stack;

public class Stack_Program 
{

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(50);
		s.add(05);
		s.add(70);
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		
		s.push(102);
		System.out.println(s);
		

	}

}
