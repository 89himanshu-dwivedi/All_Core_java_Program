import java.util.*;
class  Coll1182
{
public static void main(String kl[])
{
Stack al=new Stack();

al.push("a");
al.push("b");
al.push("c");
al.push("d");
al.push("e");
al.push("f");

System.out.println(al);

al.pop();

System.out.println(al);

System.out.println(al.peek()+"\n"+al.search("f"));
}

}