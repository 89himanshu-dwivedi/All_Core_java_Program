import java.util.*;
class  Coll1180
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

al.add(6,"g");

System.out.println(al);

al.set(0,"z");

System.out.println(al);

System.out.println(al.get(4)+"\n"+al.indexOf("z")+"\n"+al.lastIndexOf("g"));

//System.out.println(al.Capacity());

}
}
