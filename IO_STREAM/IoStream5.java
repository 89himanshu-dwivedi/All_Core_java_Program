import java.io.*;
public class IoStream5
{
public static void main(String kl[]) throws Exception
{
FileWriter fw=new FileWriter("abc.txt");
String data="";
int val=fr.read();
while(val!=-1)
{
data=data+(char)val;
val=fr.read();
}
System.out.println(data);
fw.close();
}
}


