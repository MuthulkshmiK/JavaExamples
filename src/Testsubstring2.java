import java.util.*;  
  
public class Testsubstring2  
{    
    /* Driver Code */  
    public static void main(String args[])  
    {    
       String text= new String("Hello, My name is Sachin");  
       System.out.println(text);        
        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split("\\.");  
        System.out.println(Arrays.toString(sentences));          
         
    	StringBuffer sb=new StringBuffer("Hello");  
    	sb.replace(1,2,"Java");  
    	System.out.println(sb);//prints HJavalo  
        	
    }  
}    