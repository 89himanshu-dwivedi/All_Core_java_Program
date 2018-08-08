class A500
{
static int i=0;
int j=0;
}


class Coll500
{
public static void main(String kl[])

{
A500 a=new A500();

System.out.println(a.i +","+a.j);
a.i=a.i+1;
a.j=a.j+1;
System.out.println(a.i +","+a.j);

A500 a1=new A500();
System.out.println(a1.i +","+a1.j);
a1.i=a1.i+1;
a1.j=a1.j+1;
System.out.println(a1.i +","+a1.j);



}
}

