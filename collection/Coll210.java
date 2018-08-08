import java.util.*;
class Coll210
{
public static void main(String args[])
{
HashSet hs=new HashSet();
hs.add("F");


hs.add("C");
hs.add("A");
hs.add("D");
hs.add("B");
hs.add("E");
System.out.println(hs);
HashSet hs1=new HashSet(hs);
System.out.println(hs1);

hs.add("B");
hs.add(null);
hs.add(null);
hs.add(new Integer(10));
System.out.println(hs);

LinkedHashSet ll=new LinkedHashSet();

ll.add("F");


ll.add("C");
ll.add("A");
ll.add("D");
ll.add("B");
ll.add("E");
System.out.println(ll);




}
}