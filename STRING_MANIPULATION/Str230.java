class Str230
{
public static void main(String kl[])
{
String s1=new String();
String s2=new String("String constructor");
System.out.println("s1 is "+s1);
System.out.println();
System.out.println("s2 is "+s2);

System.out.print("byte code procees is ====>>");

byte b[]={65,66,67,68,69,70};
String s3=new String(b);
System.out.println("\t"+s3);

System.out.println();

String s4=new String(b,2,4);
System.out.print("byte code in a limit is ===>>");
System.out.println(s4);

System.out.println();

System.out.println("apply  the char valuu");
char c[]={'h','i','m','a','n','s','h','u'};
String s5=new String(c);
System.out.println("char in string form is ===>>"+s5);

System.out.println();

String s6=new String(c,2,6);
System.out.println("char is string present in limit ==>"+s6);


}
}


