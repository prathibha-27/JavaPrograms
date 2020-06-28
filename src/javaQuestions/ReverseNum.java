package javaQuestions;

public class ReverseNum 
{
	public static void main(String[] args) {
		
		int n=1234;
		int rev=0;
		
		while(n!=0)
		{
			int rem=n%10;//4,3,2,
			rev=rev*10+rem;//4321
			n=n/10;//123,12,1
			
		}
		System.out.println(" rev num "+ rev);
	}

}
