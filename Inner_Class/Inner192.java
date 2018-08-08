class A
{
static int x=90;
class B
{
void m1()
{
System.out.println("m11");
}
}
}
class Inner192
{
public static void main(String[] xl)
{
A.B ab=new A().new  B();
ab.m1();
//System.out.println(x);
A a=new A();
System.out.println(a.x);

}
}
 