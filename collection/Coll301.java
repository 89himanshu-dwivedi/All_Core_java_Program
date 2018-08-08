import java.util.*;
class Coll301
{
public static void main(String kl[])
{
   HashMap h=new HashMap();
   h.put("A","AAA");
   h.put("B","BBB");
   h.put("c","CCC");
   h.put("D","DDD");
   h.put("E","EEE");
   System.out.println(h);
  Set s=h.entrySet();
   Iterator it=s.iterator();
   while(it.hasNext())
   {
	   Map.Entry e=(Map.Entry)it.next();
	   System.out.println(e.getKey()+"\t"+e.getValue());

   }
}   
}