import java.util.*;
class Coll10
{
public static void main(String kl[])
{
TreeMap s=new TreeMap();
s.put("F","AAA");
s.put("A","FFF");
s.put("B","BBB");
s.put("D","DDD");
s.put("E","EEE");
s.put("C","CCC");
System.out.println(s);

System.out.println(" element of tree  ="+s.firstKey());
System.out.println("last element of tree ="+s.lastKey());
System.out.println("if is head value of "+s.headMap("D"));
System.out.println("it is trail value of set"+s.tailMap("D"));

System.out.println("sub map of"+s.subMap("A","D"));

}
}