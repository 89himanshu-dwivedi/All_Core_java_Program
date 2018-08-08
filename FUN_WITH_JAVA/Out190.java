import java.io.*;
class Out190
{
	public static void main(String[] args)  throws Exception
	{
    FileOutputStream f=new FileOutputStream("C:/Users/himanshu/Desktop/nagoorbabu/AA/out.txt",true);

String s="HIMANSHU KUMAR";

byte[] b=s.getBytes();
f.write(b);
f.close();



}
}
