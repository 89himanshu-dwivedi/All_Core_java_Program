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




class Mul400
{
public static void main(String kl[])
{
MyThread mt=new MyThread();
mt.start();

for(int i=0;i<10;i++)
{
System.out.println("Main Thread"+i);


}
}
}
