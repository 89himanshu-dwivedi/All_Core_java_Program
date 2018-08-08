class A
{
void r1()
{
for(int i=0;i<10;i++)
{

String s1=Thread.currentThread().getName();
System.out.println(s1);
}
}
}

class My1 extends Thread
{
A a;
My1(A a)
{
this.a=a;
}
public void run()
{
a.r1();
}
}

class My2 extends Thread
{
A a;
My2(A a)
{
this.a=a;
}
public void run()
{
a.r1();
}
}

class My3 extends Thread
{
A a;
My3(A a)
{
this.a=a;
}
public void run()
{
a.r1();
}
}

class My4 extends Thread
{
A a;
My4(A a)
{
this.a=a;
}
public void run()
{
a.r1();
}
}







class Mul702
{
public static void main(String kl[])
{
A a=new A();

My1 m1=new My1(a);

My2 m2=new My2(a);

My3 m3=new My3(a);

My4 m4=new My4(a);


m1.start();

m2.start();

m3.start();

m4.start();

}
}