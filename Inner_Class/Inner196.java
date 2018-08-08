class A
{
 abstract class  A1
{
abstract void m1();
abstract void m2();
void m3()

{
System.out.println("A  A1,,,m3");
}
//abstract void m4();
}

abstract class  A2
{ 
abstract void m4();
}

class B extends  A1
{

void m1()
{
System.out.println("m1  a1 b");
}

void m2()
{
System.out.println("m2 a b");
}

}

class C extends A2
{
void m4()
{
System.out.println("C  m4");
}
}

}
 class Inner196
{
public static void main(String[] q)
{
 A.A1 a=new A().new B();
a.m1();
a.m2();
a.m3();


System.out.println();
A.A2 ac=new A().new C();
ac.m4();
}
}