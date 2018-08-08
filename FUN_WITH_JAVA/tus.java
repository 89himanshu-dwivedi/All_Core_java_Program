import java.util.*;
class tus
{
public static void main(String[] args)
{
Integer in1=new Integer(10);
Integer in2=new Integer(10);
HashMap h=new HashMap();
h.put(in1,"AAA");
h.put(in2,"BBB");
System.out.println(h);
IdentityHashMap hm=new IdentityHashMap();
hm.put(in1,"AAA");
hm.put(in2,"BBB");
System.out.println(hm);
}
}