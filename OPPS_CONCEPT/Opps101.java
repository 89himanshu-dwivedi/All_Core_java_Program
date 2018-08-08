class A
{
	int i=10;
	
 private A()
{
System.out.println("A=con");
}
void m1()
{
System.out.println("static block is called");
}


 A(int i)
{
	this.i=i;
	
System.out.println("2222A=con"+i);
}
static 
{
System.out.println("static block is called2222");
}


}
class Opps101
{
public static void main(String j[]) throws Exception
{

Class c=Class.forName("A");

Object obj=c.newInstance();




}
}
