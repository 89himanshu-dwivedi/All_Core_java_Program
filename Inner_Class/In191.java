import java.io.*;
class In191
{
	public static void main(String[] args) throws Exception
	{
		
FileInputStream f=new FileInputStream("C:/Users/himanshu/Desktop/nagoorbabu/AA/out.txt");

int size=f.available();

byte[] b=new byte[size];
f.read(b);
String s=new String(b);
System.out.println(s);
f.close();

	}
}
