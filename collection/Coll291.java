import java.util.*;

class Coll291
{
public static void main(String kl[])
{
HashMap h=new HashMap();
h.put("a","AAA");
h.put("d","DDD");
h.put("b","BBB");
h.put("c","CC");

System.out.println(h);
LinkedHashMap lh=new LinkedHashMap();
lh.put("d","DDD");
lh.put("b","BBB");
lh.put("a","AAA");
lh.put("c","CC");




System.out.println(lh);

}
}
