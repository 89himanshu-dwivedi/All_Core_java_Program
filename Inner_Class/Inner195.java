class A
{

interface I1
{
void m1();
void m2();
 }

interface I2
{
 void m3();
}



class B implements I1
{

public void m1()
{
System.out.println("m1 i b");
}

public void m2()
{
System.out.println("m2 i b");
}

}


class C implements I2
{

//void m1()
//{
//System.out.println("m1 i c");
//}
public void m3()
{
System.out.println("m3 i c");
}

}
}

class Inner195
{
public static void main(String a[])
{

A.I1 ib=new A().new B();
ib.m1();
ib.m2();

System.out.println();
A.I2 ai=new A().new C();
//ai.m1();
ai.m3();

}
} 