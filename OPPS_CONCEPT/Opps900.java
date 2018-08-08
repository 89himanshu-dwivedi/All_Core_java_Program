class A
{
//	static int i=m1();
	
private A()
{
System.out.println("con");
}

void m1()
{
System.out.println("m1 a");
//return 10;
}

 static A AA()
{
	A a=new A();
	//a.m1();
	return a;
//System.out.println("how to use ");
}
}


class Opps900
{
public static void main(String kl[])
{
	
	A a=A.AA();
	
a.m1();
}
}