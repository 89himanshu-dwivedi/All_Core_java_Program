import java.io.*;
import java.util.*;

public class IoStream7
{
public static void main(String kl[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first ReadeLine Method");
String s1=br.readLine();
System.out.println("Enter Second  Read method");
int c1=br.read();

System.out.println(s1+"\t\t"+c1+"\t"+(char)c1);

//System.out.println("enter one more time readLine");
//String s2=br.readLine();

System.out.println("Addition of String"+s1+c1);
//System.out.println("Addition deff."+s1+(char)c1);
}
}