class A
{
public void m1()
{
System.out.println("m1-a");
}

public void m2()
{
System.out.println("m2-a");
}

class B extends A
{

int i=0;
//static int j=1;
final static int k=9;

public void m3()
{
System.out.println(i);
//System.out.println(j);
System.out.println(k);

System.out.println("m3-b");

}

public void m4()
{
System.out.println("m4-b"); 

}

}

}


class Inner1
{
public static void main(String kl[])
{
A a=new A();
a.m1();
a.m2();

A.B ab=new A().new B();
ab.m1();
ab.m2();
ab.m3();
ab.m4();

}
}
