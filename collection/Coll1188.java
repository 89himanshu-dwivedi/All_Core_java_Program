import java.util.*;

public class Coll1188
{
public static void main(String kl[])
{
HashMap hs=new HashMap();

hs.put("a","1");
hs.put("f","2");
hs.put("b","3");
hs.put("c","4");
hs.put("d","5");
hs.put("e","6");
hs.put(new Integer(1),"7");
 
System.out.println(hs);

HashMap hm=new HashMap();
hm.putAll(hs);
System.out.println(hm);


}
}