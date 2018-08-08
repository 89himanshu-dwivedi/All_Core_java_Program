import java.util.*;
class Coll211
{
public static void main(String kl[])
{
TreeSet ts=new TreeSet();
ts.add("D");
ts.add("A");
ts.add("M");
ts.add("B");
ts.add("C");
ts.add("F");
ts.add("E");
System.out.println(ts);
//ts.add(null);// error 
//ts.add(new Integer(10));// error
ts.add("B");
System.out.println(ts);

System.out.println(ts.first());

System.out.println(ts.last());

System.out.println(ts.headSet("C"));

System.out.println(ts.tailSet("C"));

System.out.println(ts.subSet("B","E"));
ts.add("AAA");
System.out.println(ts);


}
}
