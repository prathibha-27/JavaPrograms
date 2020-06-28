package javaQuestions;

public class CountNumDigits 
{
	public static void main(String[] args) 
	{
		
		 int count1=0;
		 long n=123456789;
		 int number=1234;
		 
		while(n!=0)
		{
			n =n/10;
			count1++;
		}
		System.out.println(count1);
		
		// by converting it to String, and calling the length() method. This will return the length of the String representation of our number:
		int length = String.valueOf(number).length();
		System.out.println(length);
	}

}
