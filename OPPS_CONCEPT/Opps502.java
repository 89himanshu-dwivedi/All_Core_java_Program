class A50
{
int i=90;
static int j=80;

void m1()
{
System.out.println(i);
System.out.println(this.j);

}
}

class Opps502
{
public static void main(String kl[])
{
A50 a=new A50();

a.m1();

System.out.println(a.j+","+A50.j+",,,"+a.i);

A50 al=null;
System.out.println(al.j);

}
}