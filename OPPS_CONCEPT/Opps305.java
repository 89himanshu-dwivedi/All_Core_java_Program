class A305
{
A305()
{
//this(10);
System.out.println("a con");
}
A305(int i)
{
	//this(10,20);
System.out.println("int a");
}

void m1()
{
//this(10,20); not  allow
System.out.println("method of me");
}
A305(int i,int j)
{
System.out.println("int in double argument");
}
}


class Opps305
{
public static void main(String kl[])

{
A305 a=new  A305();
a.m1();
}
}