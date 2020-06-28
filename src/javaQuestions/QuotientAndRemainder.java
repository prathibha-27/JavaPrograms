package javaQuestions;

public class QuotientAndRemainder {

	//compute Quotient and Remainder
	
	public static void main(String[] args) {
		
		int dividend=30;
		int divisor=5;
		
		int a = 50;
		int b=3;
		
		int quotient=dividend/divisor;
		
		System.out.println("quotient : "+quotient);
		
		int remainder= dividend % divisor;
		
		System.out.println("remainder : "+ remainder);
		
		System.out.println("============");
		
		System.out.println("quotient is : "+(a/b));
		
		System.out.println("remainder is : "+(a%b));
	}

}
