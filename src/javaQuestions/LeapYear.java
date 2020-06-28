package javaQuestions;

public class LeapYear
{
	//to check leap year
	
	public static void main(String[] args) 
	
		{
			//divisible by 4 for all the century years ending with 00;
			//century year is a leap year only when it is perfectly divisible by 400
			
			int year=2000;
			boolean Leap=false;
			
			if(year%4==0)
			{
				if(year%100==0)
				{
					if(year%400==0)
					{
						Leap=true;
						
					}
					else
					{
						Leap=false;
					}
				}
				else
				{
					Leap=true;
				}
			}
			else
			{
				Leap=false;
			}
			
			if(Leap)
			{
				System.out.println(year+" is a leap year");
			}
			else
			{
				System.out.println(year+" is not a leap year");
			}
			
		}
		
		
	

}
