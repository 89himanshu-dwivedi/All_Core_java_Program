import java.util.*;
class Mycomparator implements Comparator
{

public int  compare(Object o1,Object o2)
{
StringBuffer s1=(StringBuffer)o1;
StringBuffer s2=(StringBuffer)o2;
int i1=s1.length();
int i2=s2.length();
//int val=s1.addr.compareTo(s2.addr);

int val=0;

if(i1 > i2)
{
 val=-100;
}

else if(i1 < i2)
{
val=+100;
}

else 
{
val=0;
}

return -val;
}
}

class Coll232
{
public static void main(String kl[])
{
StringBuffer s1=new StringBuffer("AAAAAA");
StringBuffer s2=new StringBuffer("BBBBB");
StringBuffer s3=new StringBuffer("DDDD");
StringBuffer s4=new StringBuffer("CCC");
StringBuffer s5=new StringBuffer("EE");
StringBuffer s6=new StringBuffer("F");
StringBuffer s7=new StringBuffer("HO  GYA");

Mycomparator m=new Mycomparator();

TreeSet t=new TreeSet(m);
t.add(s1);
t.add(s2);
t.add(s3);
t.add(s4);
t.add(s5);
t.add(s6);
t.add(s7);

System.out.println(t);
}
}
