import java.util.*;
class Iterator1
{
public static void main(String kl[])
{
ArrayList a=new ArrayList();
a.add("aa");
a.add("bb");
a.add("cc");
a.add("dd");
a.add("ee");

System.out.println(a);

Iterator i=a.iterator();
while(i.hasNext())
{
//System.out.println(i.next());

String s1=(String)i.next();
if(s1.equals("cc"))
{
i.remove();
}
}
System.out.println(a);
}

}