import java.io.*;
public class IoStream6
{
public static void main(String kl[]) throws Exception
{
FileReader fr=new FileReader("abc.txt");
String data="";
int val=fr.read();
while(val!=-1)
{
data=data+(char)val;
val=fr.read();
}
char[] ch=data.toCharArray();
System.out.println(data);
FileWriter fw=new FileWriter("abc2.txt");
fw.write(ch);
fw.close();
fr.close();
}
}