class A
{
final int i=0;
class B extends A
{
System.out.println(i);
void m1()
{
System.out.println("kkkkkkkkk");
}
}
}
class Inner3
{
public static void main(String  kl[])
{

A.B a=new A().new B();
ab.m1();
}
}