package javaQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LargestFibonacci 
{
	public static void main(String[] args)
	{
		int num1=0;
		int num2=1;
		int num3=0;
		
		//System.out.print(num1+ " "+ num2);
		List<Integer> l=new ArrayList<>();
		l.add(num1);
		l.add(num2);
		for(int i=0;i<=10;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			l.add(num3);
		
		}
		System.out.println(l);
		
		int largest=l.get(0);
		int smallest=l.get(0);
		for(int i=1;i<l.size();i++)
		{
			if(l.get(i)>largest)
			{
				largest=l.get(i);
			}
			else if(l.get(i)<smallest)
			{
				smallest=l.get(i);
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		
	}

}
