class A extends Thread
{
public void run()
{
System.out.println("i am ready");
}
}
class Mul703
{
public static void main(String k[])
{
A a=new A();

a.setDaemon(true);
a.isDaemon();
a.start();

}
}