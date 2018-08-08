abstract class A
{
abstract void m1();
abstract void m2();
void m3()
{
System.out.println("A m1");
}
}

class Out
{

A a=new A()
{
void m1()
{
System.out.println("m1 out");
}

void m2()
{
System.out.println(" m2 out");
}

void m4()
{
System.out.println("m4 out ");
}
};

}
class Inner210
{
public static void main(String gb[])
{
Out o=new Out();
o.a.m1();
o.a.m2();
o.a.m3();
  //o.a.m4();  error  this not reconixe by the JDK

}
}





