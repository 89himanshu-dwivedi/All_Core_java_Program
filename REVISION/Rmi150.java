class A
{


}




class Rmi150
{
public static void main(String himanshu[]) throws Exception
{
Class c=Class.forName("A");
System.out.println(c.getName());


A a=new A();
Class c1=a.getClass();
System.out.println(c1.getName());

Class c2=A.class;
System.out.println(c2.getName());


}
}
