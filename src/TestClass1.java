import java.util.Arrays;

public class TestClass1 
{	
		static void istestanagram(String s1,String s2)
		{
			int count=0;
			boolean status =false;
			System.out.println("Inside istestanagram method");
			String str1=s1.replaceAll("//s", "");
			String str2=s2.replaceAll("//s", "");
			char[] arraystr1=str1.toLowerCase().toCharArray();
			char[] arraystr2=str2.toLowerCase().toCharArray();
			if(arraystr1.length != arraystr2.length)
			{
				status=true;
			}
			Arrays.sort(arraystr1);
			Arrays.sort(arraystr2);
			status=Arrays.equals(arraystr1,arraystr2);
			if(status)
			{
				System.out.println("The given strings are anagrams");
			}	
		}
		
		public static void main(String args[])
		{
			istestanagram("stressed","desserts");	
			istestanagram("peek","keep");
		}
}
