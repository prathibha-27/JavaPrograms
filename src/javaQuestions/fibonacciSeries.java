package javaQuestions;

public class fibonacciSeries 
{
	public static void main(String[] args) {
		
		
		int num=10;
		int t1=0;
		int t2=1;
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(t1);//1,1,2
			int sum=t1+t2;//1,2,3,5
			t1=t2;//1,1,2,3
			t2=sum;//1,2,3
			
		}
	}

}
