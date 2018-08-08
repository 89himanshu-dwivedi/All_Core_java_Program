class Mythread extends Thread 
{
public void run()
{
	for(int i=0;i<10;i++)
	{
		
System.out.println("user");
}
}
}


class Mul701
{
public static void main(String kl[])
{

Mythread t=new Mythread();
t.start();
try
{
t.join();
}
catch(Exception e)
{
	System.out.println(e);
}
for(int i=0;i<10;i++)
{
System.out.println("main");
}
}
}
