import java.util.*;
class  Coll1183
{
public static void main(String kl[])
{
LinkedList al=new LinkedList();

al.addFirst("a");
al.addFirst("b");
al.addFirst("c");
al.addFirst("d");
al.addFirst("e");
al.addLast("f");

System.out.println(al);

System.out.println(al.getFirst()+"\n"+al.getLast()+"\n"+al.removeFirst());

}
}