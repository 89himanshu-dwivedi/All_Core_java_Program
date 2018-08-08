import java.util.*;
class Str231
{
public static void main(String kl[])
{
String s="himanshu kumar dwivedi  duve";
StringTokenizer s1=new StringTokenizer(s);

System.out.println("number of token is ====>>"+s1.countTokens());

while(s1.hasMoreTokens())
{
System.out.println(s1.nextToken());
}
}
}

