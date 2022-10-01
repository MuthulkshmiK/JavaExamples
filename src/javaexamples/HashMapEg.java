package javaexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapEg
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<Integer> alval=new ArrayList<Integer>();
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("AAA", 11);
		hm.put("BBB", 12);
		hm.put("CCC", 13);
		hm.put("DDD", 14);
		hm.put("EEE", 15);
		hm.put("FFF", 16);
		hm.put("GGG", 17);
		for(Map.Entry<String,Integer> m:hm.entrySet())
		{
			al.add(m.getKey());
			alval.add(m.getValue());			
		}
		System.out.println("key :"+al);
		System.out.println("values :"+alval);
	}
	
}
