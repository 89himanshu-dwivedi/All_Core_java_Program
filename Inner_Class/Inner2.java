import  java.util.*;
class A
{
class B
{
void m1()
{

System.out.println("m1=b");

}
void m2()
{

System.out.println("m1=b");
}

}
class C extends B
{
void m4()
{

System.out.println("loo");

}

void m3()
{

System.out.println("llll");
}


}

}
 class Inner2
{
public static void main (String kl[])
{
A.B ab=new A().new B();
ab.m1();
ab.m2();

A.C ac=new A().new C();
ac.m3();
ac.m4();
ac.m2();
ac.m1();
}
}

