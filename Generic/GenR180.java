
import java.util.*;
class GenR180
{
public static void main(String kl[])
{
ArrayList a=new ArrayList();

a.add("AAAA");
a.add("BBBB");
a.add("ABB");
a.add("ACCC");
a.add("AABABDAISVREG");
a.add(new Integer(6));

System.out.println(a);
System.out.println(a.get(5));
//String s1=(String)a.get(3);

String s1=(String)a.get(3);
int  s2=(Integer)a.get(5);



System.out.println(s1+"------"+s2);


}
}
