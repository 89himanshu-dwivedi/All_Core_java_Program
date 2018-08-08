import java.util.*;
class Coll212
{
public static void main(String kl[])
{
TreeSet ts=new TreeSet();

ts.add("E");
ts.add("C");
ts.add("A");
ts.add("D");			
ts.add("E");
ts.add("F");
System.out.println(ts);
System.out.println(ts.ceiling("B"));
System.out.println(ts.higher("B"));
System.out.println(ts.floor("B"));
System.out.println(ts.lower("B"));


System.out.println(ts.descendingSet());
System.out.println(ts);
System.out.println(" \n"+" " +"applyy poll"+ "\n");
ts.pollFirst();
System.out.println(ts);
ts.pollLast();

System.out.println(ts);



}
}

