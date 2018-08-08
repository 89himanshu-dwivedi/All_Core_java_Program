class Excepthrow301
{
public static void main(String kl[])
{
String number=kl[0];
String  name=kl[1];
int  pin=Integer.parseInt(kl[2]);
String  type=kl[3];

System.out.println("print type of the acount");
System.out.println("id"+number);
System.out.println("name"+name);
System.out.println("pin"+pin);
System.out.println("type"+type);

if(pin >= 1000 && pin <= 9999)
{
	System.out.println("valid pin number");
}
else
{
	throw new RuntimeException("invalid pin number");
}
	
	}
}