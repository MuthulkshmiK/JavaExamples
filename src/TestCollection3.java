/*class Student{  
  int rollno;  
  String name;  
  //int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}  */


import java.util.*;  

public class TestCollection3
{  
 public static void main(String args[])
 {  
  //Creating user-defined class objects  
  Student s1=new Student(101,"Sonoo");  
  Student s2=new Student(102,"Ravi");  
  Student s3=new Student(103,"Hanumat");  
      
  ArrayList<Student> al=new ArrayList<Student>();//creating arraylist  
  al.add(s1);//adding Student class object  
  al.add(s2);  
  al.add(s3);  
    
  Iterator itr=al.iterator();  
  //traversing elements of ArrayList object  
  while(itr.hasNext())
  {  
    Student st=(Student)itr.next();  
    System.out.println(st.id+" "+st.name);  
  }  
 }  
}  
