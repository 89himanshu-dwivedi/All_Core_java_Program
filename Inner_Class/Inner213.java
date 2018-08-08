interface I
{
void m1();
void m2();
}

class A
{
void memo(I i)
{
i.m1();
i.m2();
}
}
class Inner213
{
public static void main(String kl[])
{
A a=new A();
a.memo(new I()
{

public  void m1()
{
System.out.println("m1 a");
}
 
 public void m2()
{
System.out.println("a m2");
}

public void m3()
{
System.out.println("a m3");
}

});


}

}




