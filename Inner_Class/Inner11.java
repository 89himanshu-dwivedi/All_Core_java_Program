interface I
{
void m1();

void m2();
}

class A implements I
{
public void m1()
{
System.out.println("m2 i");
}
public void m2()
{
System.out.println("m1 i");
}

}
class Inner1
{
public static void main(String str[])
{
I i=new A();

i.m1();
i.m2();
}
}
