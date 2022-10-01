abstract class Person{  
  abstract void eat();  
}  
class TestAnonymousInner
{  
 public static void main(String args[])
 {  
  Person p=new Person(){  
  void eat(){System.out.println("Fruits are good for health");}  
  };  
  p.eat();  
 }  
}  