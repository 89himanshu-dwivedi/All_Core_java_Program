import java.util.*;
class Project27
{
public static void main(String kl[])
{
final int password=8953;
Scanner sc=new Scanner(System.in);
double tb =1000;
double rb;
double ib;
int    password1;
System.out.println("PLZ CHUTIYA INSERT YOUR CARD "+"\n"+"\n");
System.out.println("enter your password");
password1=sc.nextInt();
if( password == password1)
{
while(true)
{
System.out.println("enter the input ammount");
ib=sc.nextDouble();
System.out.println("choose your account type");
System.out.println("1.saving"+"\n"+"2.current");
int ch;
ch=sc.nextInt();
switch(ch)
{
	case 1:
	if(tb > ib)
{
tb=tb-ib;
}
else
{
System.out.println("not suffient rupye in your account  b,z of "+
"your tatal balance is not suffient "+tb);
}
System.out.println("remainning amount is "+ tb);
break;
case 2:
if(tb > ib)
{
tb=tb-ib;
}
else
{
System.out.println("not suffient rupye in your account  b,z of "+
"your tatal balance is not suffient "+tb);
}
System.out.println("remainning amount is "+ tb);
break ;
default :
System.out.println("do not choose current account");
}
System.out.println("continue the proceess");
String b=sc.next();

if ( b.equalsIgnoreCase("no"))
{
break;
}
}
}
else
{
	System.out.println("password is incorrect");
}

System.out.println("THANKU FOR USING THIS ATM");
}
}