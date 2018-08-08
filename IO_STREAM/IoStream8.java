import java.io.*;
import java.util.*;

public class IoStream8
{
public static void main(String kl[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the first value");
String s1=br.readLine();
System.out.println("Enter the second String");
String s2=br.readLine();

System.out.println(s1+"\t\t"+s2+"\t\t\t\t"+(s1+s2));
int n=Integer.parseInt(s1);
int m=Integer.parseInt(s2);

System.out.println(n+"\t\t"+m+"\t\t\t\t"+(n+m));

}
}