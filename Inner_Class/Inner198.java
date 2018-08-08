abstract class A1
{

interface I1
{
void m1();
void m2();
}

 class A implements I1
{

public void m1()
{
System.out.println("m1 in I1");
}

public void m2()
{
System.out.println("m2 in I1");
}
}

}

class B extends A1
{
}

class Inner198
{
public static void main(String f[])
{
A1.I1 ai=new B().new A();
ai.m1();
ai.m2();
}
}