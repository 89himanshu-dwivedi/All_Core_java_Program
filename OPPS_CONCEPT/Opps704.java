class A
{
private A()
{
System.out.println("a con");
}
void m()
{
System.out.println("m1.a");
}

static A hii()
{
A a=new A();
return a;

}
}

class Opps704
{
public static void main(String kl[])
{
A a=A.hii();
a.m();
}
}