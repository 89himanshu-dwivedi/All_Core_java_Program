import java.util.*;

class Account<A>
{
A acc_no;
public void set(A acc_no)
{
this.acc_no=acc_no;
}
public A get()
{
return acc_no;
}

void Display()
{
System.out.println(acc_no.getClass().getName());
}
}

class Coll602
{
public static void main(String k[])
{
Account<Integer>a=new Account<Integer>();

a.set(101);
System.out.println(a.get());
a.Display();
}
}
