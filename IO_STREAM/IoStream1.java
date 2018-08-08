import java.io.*;
class IoStream1
{
public static void main(String args[]) throws Exception
{
String s=args[0];
FileInputStream fis=new FileInputStream(s);
int size=fis.available();
byte b[]=new byte[size];
fis.read(b);

String s1=new String(b);
System.out.println(s1);
fis.close();
}
}