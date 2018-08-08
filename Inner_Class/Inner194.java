class A
{

void m1()
{
System.out.println("m1 a");
}

class C
{
void m3()
{
System.out.println("m3  c");
}
}

class B extends A
{
void m2()
{
System.out.println("m2 b");

}

}
}

class Inner194
{
public static void main(String b [])
{
A.B ab=new A().new B();
ab.m1();
ab.m2();
System.out.println();
A.C ac=new A().new C();
//ac.m1();
ac.m3();

}
}

