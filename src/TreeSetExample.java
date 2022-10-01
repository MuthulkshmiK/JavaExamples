import java.util.*;

class TreeSetExample
{
 public static void main(String args[])
 {
 
  TreeSet<String> al=new TreeSet<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");

  Iterator<String> itr=al.descendingIterator();
  while(itr.hasNext())
  {
   System.out.println(itr.next());
  }
  
  TreeSet<Integer> set=new TreeSet<Integer>();  
  set.add(24);  
  set.add(66);  
  set.add(12);  
  set.add(15);  
  System.out.println("lowest Value: "+set.pollFirst());  
  System.out.println("highest Value: "+set.pollLast());  
 }
}