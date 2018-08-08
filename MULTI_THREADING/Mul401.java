class Thread implements Runnable
{
Runnable r=null;
public Thread()
{
}
public Thread(Runnable r)
{
this.r=r;
}
public void run()
{
}
public void start()
{
	// logical ......
if(r == null )
{
this.run();
}
else
{
r.run();
}
}
}



class MyThread extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("User Thread"+i);
}
}
}





class Mul401
{
public static void main(String kl[])
{
MyThread mt=new MyThread();
//mt.start();
//mt.run();
/*Thread t=new Thread();
t.start();
*/

Thread t=new Thread(mt);
t.start();


for(int i=0;i<10;i++)
{
System.out.println("Main Thread"+i);


}
}
}


