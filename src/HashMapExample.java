import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
	public static void main(String args[])
	{
		Map<String,Integer> m =new HashMap<String,Integer>();
		m.put("One",1);
		m.put("Two", 2);
		m.put("Three", 3);
		m.put("Four",4);
		m.put("Five",5);
		
		ArrayList<String> a1= new ArrayList<String>();
		ArrayList<Integer> a2= new ArrayList<Integer>();
			
		for(Map.Entry<String, Integer> hm:m.entrySet())
		{
			a1.add(hm.getKey());
			a2.add(hm.getValue());
		}
		
		System.out.println("Arraylist1  =="+a1);
		System.out.println("Arraylist1  =="+a2);
		
	}

}
