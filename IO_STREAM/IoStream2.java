import java.io.*;
import java.util.*;
class IoStream2
{
public static void main(String kl[]) throws Exception
{
FileInputStream fis=new FileInputStream("abc.txt");
int size=fis.available();
byte[] b=new byte[size];
fis.read();
String s1=new String(b);

StringTokenizer st=new StringTokenizer(s1);
int tokens=st.countTokens();
System.out.println("no of word\t"+tokens);

int count=0;
while(st.hasMoreTokens())
{
String token=st.nextToken();
if(token.equals("himanshu"))
count=count+1;
}
System.out.println("no of time reaped himanshu is\t"+count);

fis.close();
}
}
 