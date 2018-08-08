import java.util.*;
class  Coll1187
{
public static void main(String kl[])
{
TreeSet al=new TreeSet();

al.add("a");
al.add("b");
al.add("c");
al.add("d");
al.add("e");
al.add("f");


System.out.println(al);

System.out.println(al.ceiling("b")+"=="+al.higher("b"));

System.out.println(al.floor("b")+"==="+al.lower("b"));


}
}