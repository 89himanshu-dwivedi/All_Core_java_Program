class Excep301
{
public static void main(String kl[])
{

try
{
int a=90;
int b=0;
float f=a/b;
System.out.println(f);

}
catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e )
{
	e.printStackTrace();
}



}
}