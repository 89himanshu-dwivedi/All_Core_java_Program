class Mul600
{
public static void main(String kl[])
{
	
Thread t=new Thread();
System.out.println(t);
		

Runnable r =new Thread();
Thread t2=new Thread(r);
System.out.println(t2);


Thread t1=new Thread("himanshu");
System.out.println(t1);



Runnable r2=new Thread();		
Thread t3=new Thread(r2,"himanshu");
System.out.println(t3);


ThreadGroup tt=new ThreadGroup("kumar");
Runnable r4=new Thread();
Thread t4=new Thread(r4,"himanshu");
System.out.println(t4);



ThreadGroup tt1=new ThreadGroup("kumar");
Thread t5=new Thread(tt1,"himanshu");
System.out.println(t5);


ThreadGroup tt2=new ThreadGroup("kumar");
Runnable r5=new Thread();
Thread t6=new Thread(tt2,r5,"himanshu");
System.out.println(t6);




}
}
