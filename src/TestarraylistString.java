import java.util.*;  

class TestarraylistString
{  
 public static void main(String args[])
 {  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Aruvi");  
  al.add("Ajay"); 
  System.out.println(al.size());
  System.out.println(al.get(3));
  for(String obj:al)  
  {
	  
	  System.out.println(obj);  
  }	       
 }  
}

