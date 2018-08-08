 class Student

{
int no;
String name;
Student(int n,String m)
{
no=n;
name=m;
}

public void getDisplay()
{
System.out.println("no of student"+     no);
System.out.println("na of student  "+   name);

}
}
class Opps28
{
public static void main(String kl[])
{
Student s=new Student(10,"himanshus");
s.getDisplay();

}
}