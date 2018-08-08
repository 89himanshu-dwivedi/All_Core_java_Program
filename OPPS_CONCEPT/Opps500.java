class A
{
		A()
	{
		this(10);
		System.out.println("A ");
	}
	

		A(int i)
	{
		System.out.println("A int");
		//return 10;
	}
	
	void m1()
	{
		this(10);
		System.out.println("m1 A");
	
	}
	
	

	
	
}



class Opps500
{
public static void main(String kl[])
{
	A a=new A();
//A a=new A(10);

a.m1();
int c=0;
System.out.println(c);

}
}