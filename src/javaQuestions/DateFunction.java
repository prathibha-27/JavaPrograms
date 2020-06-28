package javaQuestions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class DateFunction 
{
	public static void main(String[] args)
	{
		Date date= new Date();
		System.out.println(date);
//		String s=date.toString();
//		String[] s1=s.split("");
//		System.out.println(s1[0]);
		
//		Date date = new Date();
//		SimpleDateFormat day= new SimpleDateFormat("dd");
//		String s=day.format(date);
//		System.out.print(s);
//		SimpleDateFormat month = new SimpleDateFormat("MMMM");
//		String t=month.format(date);
//		System.out.print(t);
//		SimpleDateFormat r=new SimpleDateFormat("YYYY");
//		System.out.print(r.format(date));
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate tom=d.plusDays(1);
		System.out.println(tom);
		LocalDate month=d.plusMonths(1);
		System.out.println(month);
		LocalDate week = d.plusWeeks(2);
		System.out.println(week); 
		
	}

}
