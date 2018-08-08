import java.util.*;
class Coll230
{
public static void main(String hii[])
{
ArrayList ar=new ArrayList();
ar.add("a");
ar.add("x");
ar.add("b");
ar.add("c");
ar.add("m");
ar.add("d");
ar.add("e");
ar.add("f");
ar.add("a");
ar.add("a");
System.out.println(ar);

TreeSet tr=new TreeSet(ar);
System.out.println(tr);
}
}
