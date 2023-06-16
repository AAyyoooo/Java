
package student;

class stud
{ public int roll;
public String name;
public int m1,m2,m3;
 
public float total()
{ return m1+m2+m3/3;
}
public char grade()
{  if(total()>=40)
return 'A';
else if(total()>=60)
    return 'B';
else 
return 'C';
}
public String details()
{ return "roll.no:"+roll+"\n"+"Name:"+name;
}}
public class Student {

    
    public static void main(String[] args) {
        { stud s=new stud();
    s.roll=9;
    s.name="ayush";
       
    s.m1=8;
        s.m2=80;
        s.m3=90;
      System.out.println(s.total());
      System.out.println(s.grade());         
      System.out.println(s.details());   }}
    
}
