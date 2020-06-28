package javaQuestions;

public class LargestNumber {

	
	//to find largest among three numbers
	
	public static void main(String[] args) {
		
		int x=60;
		int y=60;
		int z=30;
		
		if(x>y && x>z)
		{
			System.out.println("x is greatest");
		}
		else if(y>z)
		{
			System.out.println("y is greatest");
		}
		else
		{
			System.out.println("z is greatest");
		}
		
		if(x>=y)
		{
			if(x>=z)
			{
				System.out.println("x is greatest");
			}
			else
			{
				System.out.println("z is greatest");
			}
		}
		else
		{
			if(y>=z)
			{
			System.out.println("y is greatest");
			}
			else
			{
				System.out.println("z is greatest");
			}
	}
}
}