package javaQuestions;

public class VowelOrConsonant {
	
	//to check whether the alphabet is vowel or consonant

	public static void main(String[] args) 
	{
		//vowel a e i o u
		
		char c='e';
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
		{
			System.out.println(c + " : is vowel ");
		}
		else
		{
			System.out.println(c + " : is consonant ");
		}

		
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println(c +" : is vowel");
			break;
			
			default:
			System.out.println(c + " : is consonant");
			break;
			
		}
	}

}
