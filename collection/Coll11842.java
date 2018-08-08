import java.util.*;
class  Coll11842
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

ListIterator li=al.listIterator();

while(li.hasNext())
{
System.out.println(li.nextIndex()+"........."+li.next());
}

while(li.hasPrevious())
{
System.out.println(li.previousIndex()+"......."+li.previous());
}

}
}