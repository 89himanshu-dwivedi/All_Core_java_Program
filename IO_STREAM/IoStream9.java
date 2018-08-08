import java.io.*;
public class IoStream9
{
public static void main(String himanshu[]) throws Exception
{
Console e=System.console();
String name=e.readLine("user name");
char[] pass=e.readPassword("user password");
String s=new String(pass);

if(name.equals("himanshu")&&pass.equals("hii"))
{
System.out.println("valid User");
}
else
{
System.out.println("inValid User");
}
}
} 