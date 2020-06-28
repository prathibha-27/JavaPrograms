package javaQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordInString 
{
	
	
	public static void main (String[] args)
	{
		//String[] s= {"hi", "java", "and", "python", "java","python"};
		String s= "hi java and python java python";
		String p=s.toString();
		String[] word=p.split(" ");
	    //System.out.println(word[0]);
		
		Map<String, Integer> map=new HashMap<String,Integer>();
		for(String w:word)
		{
			if(map.containsKey(w))
			{
				map.put(w, map.get(w)+1);
			}
			else 
			{
				map.put(w, 1);
			}
		}
		
		Set<String> h=map.keySet();
		for(String words:h)
		{
			if(map.get(words)>1)
			{
				System.out.println(words+":"+map.get(words));
			}
		}
		
	}
	
	

}
