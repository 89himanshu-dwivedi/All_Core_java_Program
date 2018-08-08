class A
{
class B
{
void m1(){
System.out.println("m1");
}
}
}

class C
{
class D extends A.B
{
void m2()
{
System.out.println("m2");
}
}
}

class Inner193
{
public static void main(String p[])
{
A.B ab=new A().new B();
ab.m1();
C.D cd=new C().new D();
cd.m2();

//B.D ac=new B().new D();
//c.m1();
//ac.m2();
}
}

