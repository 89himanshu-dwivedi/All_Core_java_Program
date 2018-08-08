abstract class A1
{
abstract class A2
{
abstract void m1();
}



class A
{
void m2()
{
System.out.println("lll");
}
}

class C extends A2
{
void m1()
{
System.out.println("m1");
}
}

}

class B extends A1
{
}

class  Inner197
{
public static void main(String kl[])
{

A1.A a=new B().new A();
a.m2();

A1.A2 b=new B().new C();
b.m1();

}
}
