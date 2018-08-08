interface I
{
class A
{
void m1()
{
System.out.println("m111");
}
}
}
class Inner200
{
public static void main(String p[])
{
I.A a=new  I.A();
a.m1();
}
}