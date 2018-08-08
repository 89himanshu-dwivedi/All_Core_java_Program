import java.io.*;
import java.util.*;

class Sep19
{
public static void main(String himanshu[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1=br.readLine();
int l=s1.length();
for(int i=0;i<l;i++)
{
char c=s1.charAt(i);
int j=(char)c;
System.out.println(j);
}
}
}