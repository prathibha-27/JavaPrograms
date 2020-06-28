package javaQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept
{

	public static void main(String[] args)
	{
		List<String> l=new ArrayList<>();
		l.add("i");
		l.add("me");
		l.add("you");
		System.out.println(l);
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		
	}


}
