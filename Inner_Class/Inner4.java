class A
{
interface I
{
void m1();
void m2();
void m3();
}

 class C implements I
{

public void m1()
{
System.out.println("ll");
}

public void m2()
{
System.out.println("llkkkkkk");
}

public void m3()
{
System.out.println("jj");
}
}

}

class Inner4
{
public static void main(String kl[])
{
A.C ab=new A().new C();
ab.m1();
ab.m2();
ab.m3();
}
}