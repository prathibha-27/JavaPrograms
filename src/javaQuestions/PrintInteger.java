package javaQuestions;

import java.util.Scanner;

public class PrintInteger 
{
	// print an integer entered by the user
	
	public static void main(String[] args) 
	{
		Scanner reader= new Scanner(System.in);
		
		System.out.println("please enter the number");
		
		int num=reader.nextInt();
		
		System.out.println("num:" +num);
	}

}
