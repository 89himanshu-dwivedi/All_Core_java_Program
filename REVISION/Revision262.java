import java.util.*;
class Revision262
{
public static void main(String h[])
{
ArrayList ar=new ArrayList();

ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");
ar.add("E");
System.out.println(ar);

ar.add("A");
ar.add("null");
ar.add("null");
ar.add(new Integer(10));
System.out.println(ar);

ar.add(1,"X");
System.out.println(ar);
ar.set(1,"B");
System.out.println(ar);


System.out.println(ar.get(1));

System.out.println(ar.indexOf("null"));
System.out.println(ar.lastIndexOf("null"));






}
}