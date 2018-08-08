import java.util.*;
class  Coll1184
{
public static void main(String kl[])
{
Vector v=new Vector();
v.addElement("a");
v.addElement("b");
v.addElement("c");
v.addElement("d");
v.addElement("e");
v.addElement("f");


System.out.println(v);

Enumeration e=v.elements();

while(e.hasMoreElements())
{

System.out.println(e.nextElement());

}

}
}