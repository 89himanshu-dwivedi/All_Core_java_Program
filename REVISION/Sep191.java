import java.io.*;
class Sep191
{
public static void main(String kl[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("emter a string ");
String s=br.readLine();
int l=s.length();
String s1=s.substring(0,2).toUpperCase()+s.substring(2,5).toLowerCase()+s.substring(5).toUpperCase();
System.out.println(s1);
}
}