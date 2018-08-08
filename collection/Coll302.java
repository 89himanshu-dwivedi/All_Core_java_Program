import java.util.*;
class A301
{
public String toString()
{
return "AA";

}
}

class Coll302
{
public static void main(String kl[])
{
A301 a=new A301();
HashMap h=new HashMap();
h.put(a,"AAA");
//h.put("a","BB");

System.out.println("before the garbag"+h);
a=null;
System.gc();

System.out.println("ater the garbage"+h);


A301 a1=new A301();
WeakHashMap wh=new WeakHashMap();
wh.put(a1,"AAA");
//wh.put("a1","BB");

System.out.println("before the gc in weak"+wh);
a1=null;
System.gc();
System.out.println("after the gc in weak"+wh);


}
}
