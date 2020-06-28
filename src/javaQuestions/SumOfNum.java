package javaQuestions;

public class SumOfNum
{
	public static void main(String[] args) {
		
		int sum=0;
		int num=4;
		int sum1=0;
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		
		int k=1;
		while(k<=num)
		{
			sum1=sum1+k;
			k++;
		}
		System.out.println(sum1);
	}

}
