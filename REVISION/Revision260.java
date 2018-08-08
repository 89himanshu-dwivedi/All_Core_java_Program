import java.util.*;
class Revision260
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
System.out.println(ar.contains("B"));
System.out.println(ar.contains("X"));
ArrayList ar1=new ArrayList();
ar1.add("A");
ar1.add("B");
ar1.add("C");
ar1.add("D");
System.out.println(ar.containsAll(ar1));
ar1.add("X");
ar1.add("Y");
System.out.println(ar.containsAll(ar1));

ArrayList ar2=new ArrayList();

ar2.add("A");
ar2.add("B");
ar2.add("C");
ar2.add("M");
System.out.println(ar.retainAll(ar2));
System.out.println(ar);
System.out.println(ar2);
Object[] ob=ar1.toArray();
for(Object o:ob)
	System.out.println(o);





}
}



