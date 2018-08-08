class A
{
/*void m1()
{
System.out.println("himanshu");
}*/
}

class Opps211
{
public static void main(String himanshu[])
{
A a=new A();
//a.m1();
int hashCode=a.hashCode();
System.out.println("Object hashCode is :" +hashCode);
String ref=a.toString();
System.out.println("object reference is :"+ ref);
}
}