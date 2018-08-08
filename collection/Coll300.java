import java.util.*;
class Coll300
{
public static void main(String kl[])
{

HashMap h=new HashMap();
h.put("a","AAA");
h.put("b","BBB");

h.put("a","AAA");
h.put("b","BBB");
h.put("c","CCC");
h.put("d","DDD");

System.out.println(h);
LinkedHashMap lh=new LinkedHashMap();
lh.put("a","AAA");
lh.put("b","BBB");
lh.put("c","CCC");
lh.put("d","DDD");
lh.put("e","EE");
System.out.println(lh);

}
}
