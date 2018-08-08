interface I
{
void m1();
void m2();
void m3();
}

class A
{

I i=new I()
{

public  void m1()
{
System.out.println("m1 a");
}

public void m2()
{
System.out.println("m2 a");
}

public void m3()
{
System.out.println("m3 a");
}

};
}

class Inner211
{
public static void main(String  kl[])
{
A a=new A();
a.i.m1();
a.i.m2();
a.i.m3();

}
}
