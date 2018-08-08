class Mul601
{
public static void main(String kl[])
{
	
Thread t=new Thread();
System.out.println(t);

Runnable r1=new Thread();
Thread t1=new Thread(r1);
System.out.println(t1);

Runnable r2=new Thread();
Thread t2=new Thread(r2,"himanshu");
System.out.println(t2);

}
}