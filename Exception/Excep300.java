import java.io.*;
import java.util.*;

class Excep300
{
public static void main(String kl[]) throws IOException
{
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	
	
try(
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
)
{
System.out.println("enter the data");
String s1=br.readLine();
System.out.println(s1);

br1=br;
}
catch(Exception e1)
{
System.out.println(e1);

}

System.out.println("enter the data");
String s2=br1.readLine();
System.out.println(s2);

}
}


