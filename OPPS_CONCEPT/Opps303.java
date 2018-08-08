class A303
{

A303()
{
this(10);
System.out.println("lelo con");
}

A303(int i)
{
this(202.22f);
System.out.println("int is call");

}

A303(float i)
{
this(255.333);

System.out.println("float is call");

}

A303(double d)
{
System.out.println("double ");
}

}

class Opps303
{
public static void main(String[] kl)
{
A303 a=new A303();

}
}