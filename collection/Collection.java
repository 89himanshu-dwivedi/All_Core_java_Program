import java.util.*;
class Collection
{
public static void main(String args[])
{

System.out.println("treeset function is used");
TreeSet ts=new TreeSet();
ts.add("A");
ts.add("b");
ts.add("c");
System.out.println(ts);

System.out.println("it is used to method to used in the ");
 
ArrayList al=new ArrayList();

al.add("1");
al.add("2");
al.add("3");
al.add("4");
al.add("5");
System.out.println(al);

ArrayList al1=new ArrayList();

System.out.println(al1.addAll(al));
System.out.println(al1);

ArrayList al2=new ArrayList();
al2.add("1");
al2.add("2");
al2.add("3");


System.out.println("aply contains method");
System.out.println(al.contains("2"));
System.out.println(al.contains(al2));


System.out.println(al.retainAll(al2));


System.out.println("remove method is apply");

System.out.println(al.remove("1"));

System.out.println(al.removeAll(al2));

System.out.println(al2.size());
System.out.println(al2.isEmpty());


Object[] ab=al2.toArray();
for(Object x:ab)
System.out.print(x+"\t");

System.out.println(" \t ");

al2.clear();
System.out.println(al2.isEmpty());


System.out.println("is apply the interface in to the collection======== ");


System.out.println("it is aply the LIST ");

ArrayList z1=new ArrayList();
z1.add("a");
z1.add("b");
z1.add("c");
z1.add("d");
z1.add("e");

System.out.println(z1);
//al.add(5,"f");
System.out.println(z1.add("A"));

System.out.println("aplly SET");
//System.out.println(z1.set(9,"g"));
System.out.println(z1.set(3,"B"));
System.out.println(z1);

System.out.println(z1.get(3));

System.out.println(z1.indexOf("a"));
System.out.println(z1.lastIndexOf("a"));

System.out.println(z1.remove("f"));
System.out.println(z1);
System.out.println(z1.remove(1));

System.out.println(" -------------------------------------------------");


System.out.println("in FIELD IS APPLY THE ARRAY LIST");


ArrayList z2=new ArrayList();

z2.add("aa");
z2.add("bb");
z2.add("cc");
z2.add("dd");
z2.add("ee");

System.out.println(z2);

ArrayList z3=new ArrayList(z2);
System.out.println(z3.size());

System.out.println(z3);
System.out.println(z1.size());

ArrayList z4=new ArrayList(2);
z4.add("aaaaaa");
z4.add("null");
z4.add("null");
z4.add(new Integer(10));
System.out.println(z4);
System.out.println(z4.size());

System.out.println("\n"+"-------------------------------");
System.out.println("IN THIS FIELD APPLY THE VECTOR COLLECTION ");

Vector v=new Vector();
System.out.println(v.capacity());

Vector v1=new Vector(5,5);
System.out.println(v1.capacity());

for(int i=0;i<=4;i++)
v1.add(i);

System.out.println(v1.capacity());

for(int i=0;i<=4;i++)
v1.add(i);
System.out.println(v1.capacity());

Vector v2=new Vector();
v2.add("AAA");
v2.add("BBB");
v2.add("CCC");
v2.add("DDD");
v2.add("EEE");


System.out.println(v2);
v2.addElement("ffff");

System.out.println(v2);
System.out.println(v2.firstElement());
System.out.println(v2.lastElement());
System.out.println(v2.elementAt(3));
System.out.println(v2);
v2.removeElement("DDD");
System.out.println(v2);
v2.removeElementAt(3);
System.out.println(v2);
v2.removeAllElements();
System.out.println(v2);





System.out.println("==============================================");
System.out.println("start liNKRS LIST METHOD IN THIS FIELD  ");


LinkedList y=new LinkedList();
y.add("yyyy");
y.add("wwww");
y.add("xxxx");
y.add("vvvvv");


System.out.println(y);
y.addFirst("aaaa");
System.out.println(y);
y.addLast("bbbb");
System.out.println(y);
System.out.println(y.getLast());
System.out.println(y.getFirst());
System.out.println(y);
y.removeLast();
System.out.println(y);
y.removeFirst();
System.out.println(y);



System.out.println("========================");
System.out.println("start  STACK METHOD IN THIS FIELD");

Stack s=new Stack();
s.push("11");
s.push("22");
s.push("33");
s.push("44");
s.push("55");
System.out.println(s);
System.out.println(s.pop());
System.out.println(s);
System.out.println(s.peek());
System.out.println(s);
System.out.println(s.search("44"));
System.out.println(s);




 

}
}