package javaQuestions;

public class charIsAlphaOrNot 
{
	public static void main(String[] args) {
		
		char c='@';
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
			System.out.println(c+" is alpha");
		}
		else
		{
			System.out.println(c+" not an alpha");
		}
	}

}
