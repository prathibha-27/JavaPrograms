package javaQuestions;

import java.util.Scanner;

public class EvenOrOdd {

	//to check whether the number is even or odd
	
	
	public static void main(String[] args) 
	{
		
		Scanner reader= new Scanner(System.in);
		System.out.println("please enter the num ");
		
		int num=reader.nextInt();
		
		
		if( num % 2 ==0)
		{
			System.out.println( num+ " num is even ");
		}
		else
		{
			System.out.println(num+ " : num is odd");
		}

	}

}
