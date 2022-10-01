class Testarray
{  
	public static void main(String args[])
	{  
  
		int a[]=new int[8];//declaration and instantiation  
		a[0]=12;//initialization  
		a[1]=18;  
		a[2]=33;  
		a[3]=88;  
		a[4]=18;  
		a[5]=99;
		a[6]=18;
		a[7]=100;
				
		 
		System.out.println("Length"+a.length);
		int count=0;
		
		//printing array  
		for (int i = 0; i < a.length; i++)
		 {
		        for (int j = i+1; j < a.length; j++)
		        {
		            if(a[i]==18)
		            {   
		            	int store =a[j];
		            	a[i]=a[j];
		            	a[j]=18;	                
		            }
		           
		        }
		        System.out.println(a[i]);
		        
		    }
		
		
		 
}  }
