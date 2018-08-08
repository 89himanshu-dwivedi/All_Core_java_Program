import java.util.*;
class  Coll1181
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

System.out.println(v.capacity());

System.out.println(v.firstElement()+"\n"+v.lastElement()+"\n"+v.elementAt(1));
}
}