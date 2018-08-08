import java.io.*;
public class IoStream4
{
public static void main(String kl[]) throws Exception
{
FileWriter fw=new FileWriter("abc.txt");
String data="himanshu is a power of believe system";
char[] c=data.toCharArray();
fw.write(c);
fw.close();
}
}