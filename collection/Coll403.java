import java.util.*;


class Coll403
{
public static void main(String kl[])
{
HashMap hs=new HashMap();
hs.put("A","AAA");
hs.put("E","EEE");
hs.put("C","CCC");
hs.put("D","DDD");
hs.put("F","FFF");
hs.put("B","BBB");

System.out.println(hs);
hs.put(null,"AAA");
System.out.println(hs);


Hashtable ht=new Hashtable();
ht.put("A","AAA");
ht.put("E","EEE");
ht.put("C","CCC");
ht.put("D","DDD");
ht.put("F","FFF");
ht.put("B","BBB");
System.out.println(ht);

ht.put(null,null);
System.out.println(ht);


}
}
