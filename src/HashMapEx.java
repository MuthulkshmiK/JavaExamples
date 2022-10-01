import java.util.HashMap;
import java.util.Map;

public class HashMapEx
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(100,"Aa");
		hm.put(101,"Bb");
		hm.put(102,"Cc");
		hm.put(104, "Dd");
		System.out.println("Mappings of HashMap hm1 are : "+ hm);

		// Iterate the map using
        // for-each loop
		for(Map.Entry<Integer, String>m:hm.entrySet())
		for(Map.Entry<Integer,String> m:hm.entrySet())
		{
			System.out.println("Key"+m.getKey()+"  "+"value  "+m.getValue());
		}	
	
	}

}
