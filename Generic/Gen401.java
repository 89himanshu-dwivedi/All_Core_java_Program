import java.util.*;

class Gen401
{
public static void main(String kl[])
{
ArrayList<String> ars=new ArrayList<String>();

ars.add("AA");
ars.add("BB");
ars.add("CCC");
ars.add(new String("himanshu"));
//ars.add(new Integer(10)); error

//ar.add(new Double(100.00));
//ars.add(new StringBuffer("BFBFBF")); error


System.out.println(ars);

String s1=ars.get(1);

System.out.println(ars.get(1));
}
}