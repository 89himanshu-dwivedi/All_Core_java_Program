class A290
{
	


A290()
{
System.out.println("aaaaa");
}


{
System.out.println("instance blocks");
}

int m2()
{
	System.out.println("m2 A");
	return 1;
}
int i=m2();

}

class Opps292
{
public static void main(String args[])
{
A290 a=new A290();
A290 a1=new A290();
}
}