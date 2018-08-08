class MyThread extends Thread
{
	Thread t;
public void run()
{
for(int i=0;i<10;i++)
{
try
{
	Thread.sleep(1000);
}
catch(InterruptedException e)
{
	System.out.println(e);
}

	System.out.println("iuser thread class");
}

}
}

class Mul700
{
public static void main(String himanshu[])
{

MyThread t= new MyThread();

t.start();
}
}