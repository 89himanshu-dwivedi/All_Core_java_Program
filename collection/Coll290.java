import java.util.*;
class   Coll290
{
public static void main(String kl[])
{
HashMap h=new HashMap();
h.put("a","AAA");
h.put("b","BBB");
h.put("c","CC");
h.put("d","DDD");
h.put("a",null);
h.put(new Integer(10),"AAA");
h.put(new Integer(11),null);

System.out.println(h);
HashMap h1=new HashMap();
h1.putAll(h);
System.out.println(h1);

System.out.println(h.get("a"));
System.out.println(h.containsKey("10"));
System.out.println(h.size());
System.out.println(h.isEmpty());
h.clear();
System.out.println(h.isEmpty());

System.out.println(h.values());
System.out.println(h1.values());
}
}