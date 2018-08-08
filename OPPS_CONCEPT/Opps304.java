class A304
{

A304()
{
	this.m1();
System.out.println("a con");
}

void m1()
{
	this.m2();
System.out.println("1 a");
}

void m2()
{
System.out.println("a--b");
}

}
class Opps304
{
public static void main(String kl[])
{
A304 a=new A304();
}
}