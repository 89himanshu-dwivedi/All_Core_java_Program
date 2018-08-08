class A
{
A()
{
System.out.printf("hii i am constructor of class");
}
static
{
System.out.println("i am a clas static method or block of a class");
}
}

class Opps100
{
public static void main(String kl[]) throws Exception
{

Class c=Class.forName("A");
Object obj=c.newInstance();

}

}
