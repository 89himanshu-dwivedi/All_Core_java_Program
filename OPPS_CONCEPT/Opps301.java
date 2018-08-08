class A300
{
int no;
String name;
public  void setNo(int no)
{
this.no=no;

}

public void setName(String name)
{
this.name=name;
}
public int getNo()
{
return no;
}
public String getName()
{
return name;
}

}



class Opps301
{
public static void main(String kl[])
{
System.out.println("set the value");

A300 a=new A300();
a.setNo(100);
a.setName("himanshu");

System.out.println("pint the student name\n");
System.out.println("number of student "+a.getNo()+"\n");
System.out.println("name of student "+ a.getName());
}
}