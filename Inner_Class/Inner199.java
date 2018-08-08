class A
{
 static class B
{
void m1()
{
System.out.println("m1 b");
}
static void m2()
{
System.out.println("stattaa");
}
}
}
class Inner199
{
public static void main(String d[])
{
A.B ab=new A.B();
ab.m1();
ab.m2();
A.B.m2();
}
}