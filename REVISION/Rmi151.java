public abstract class  Himanshu implements java.io.Serializable,java.lang.Cloneable
{
String name="DWIVEDI";
}

class Rmi151
{
public static void  main(String[] rm) throws Exception
{
Class c1=Class.forName("Himanshu");
System.out.println(c1.getName());

Himanshu h=new Himanshu();
Class c2=h.getClass();
System.out.println(c2.getName());


Class c3=Himanshu.class;
System.out.println(c3.getName());



}
}