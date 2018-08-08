class A
{

class B
{

void m1()
{
System.out.println("m1a");
}

void m2()
{
System.out.println("m2 ");
}

}

class C extends B
{
void m3()
{
System.out.println("m3");
}

}
}


class Inner191
{
public static void main(String pl[])
{
A.B ab=new A().new B();
ab.m1();
ab.m2();
A.C ac=new A().new C();
ac.m1();
ac.m2();
ac.m3();
}
}
