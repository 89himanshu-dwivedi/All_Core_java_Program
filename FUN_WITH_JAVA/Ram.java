import java.util.*;
class A
{
int i=10;
void m1()
{
System.out.println("hiiii");
}
class B
{
s
void m2()
{
System.out.println("hello");
}
}
}
class Ram
{
public static void main(String kl[])
{
System.out.println("1");
A a=new A();
a.m1();
//a.m2();

//B  b=new B();
//b.m1();
//b.m2();
 A.B ab=new A().new B();
//ab.m1();
ab.m2();

}
}