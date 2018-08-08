import java.io.*;
class IOstream211
{
public static void main(String kl[]) throws Exception
{
FileWriter fw=new FileWriter("1.txt");
String s1="himanshu";
char[] ch=s1.toCharArray();
fw.write(ch);
fw.close();
}
}