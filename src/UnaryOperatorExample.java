public class UnaryOperatorExample
{  
	public static void main(String args[])
	{  
	int x=10;
	int a=10;  
	int b=10;
	System.out.println(x++);//10 (11)  
	System.out.println(++x);//12  
	System.out.println(x--);//12 (11)  
	System.out.println(x--);//11
	System.out.println(--x);//9 
	
	  
	System.out.println(a++ + ++a);//10+12=22  
	System.out.println(b++ + b++);//10+11=21 

	int e=0;  
	int f=-10;  
	boolean c=true;  
	boolean d=false;  
	System.out.println(~e);//-11 (minus of total positive value which starts from 0)  
	System.out.println(~f);//9 (positive of total minus, positive starts from 0)  
	System.out.println(!c);//false (opposite of boolean value)  
	System.out.println(!d);//true  
	}
}  