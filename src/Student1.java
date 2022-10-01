//copy constructor
class Student1{  
    int id;  
    String name;  
    Student1(int i,String n){  
    id = i;  
    name = n;  
    }  
      
    Student1(Student1 s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student1 s1 = new Student1(111,"Karan"); 
    Student1 s3=new Student1(143,"Muthulakshmi");
    Student1 s2 = new Student1(s3);  
    s1.display();  
    s2.display();  
   }  
}  
