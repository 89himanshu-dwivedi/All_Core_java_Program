import java.util.*;

class Enummeration
{
public static void  main(String args[])
{
Vector v=new Vector();
v.add("a");
v.add("b");
v.add("c");
v.add("d");
v.add("e");
System.out.println(v);

Enumeration e=v.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}


}
}