import java.lang.reflect.*;
public class  Himanshu1 implements java.io.Serializable,java.lang.Cloneable
{
//String name="DWIVEDI";
}

class Rmi151
{
public static void  main(String[] args) throws Exception
{
Class c1=Class.forName("Himanshu1");
System.out.println(c1.getName());

Himanshu1 h=new Himanshu1();
Class c2=h.getClass();
System.out.println(c2.getName());


Class c3=Himanshu1.class;
System.out.println(c3.getName());



}
}