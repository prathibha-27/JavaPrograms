package javaQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface 
{
	int id;
	String name,author;
	int quantity;
	public ListInterface(int id,String name,String author,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.quantity=quantity;	
	}
	public static void main(String[] args)
	{
		List<ListInterface> l= new ArrayList<>();
		
		ListInterface l1= new ListInterface(1,"two states","bhatt",12);
		ListInterface l2=new ListInterface(2,"half gf","chetan bhagat",20);
		
		l.add(l1);
		l.add(l2);
		 
		Iterator<ListInterface> itr = l.iterator();
		while(itr.hasNext())
		{
			ListInterface s=(ListInterface)itr.next();
			System.out.println(s.id+"," +s.name+","+s.author+","+s.quantity);
		}
		
	}
	
}
