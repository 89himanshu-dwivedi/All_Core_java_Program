import java.util.*;
class  Coll11841
{
public static void main(String kl[])
{
ArrayList al=new ArrayList();

al.add("a");
al.add("b");
al.add("c");
al.add("d");
al.add("e");
al.add("f");

System.out.println(al);

Iterator i=al.iterator();

while(i.hasNext())
{

System.out.println(i.next());

}
}
}
