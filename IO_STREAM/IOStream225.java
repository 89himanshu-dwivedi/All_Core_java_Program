import java.io.*;

class IOStream225 
{
	public static void main(String[] args)  throws Exception
	{

BufferedReader br=new BufferedReader(new InputStreamReader (System in));

System.out.println("entre the fisret datain input file");
String s1=br.readLine();
System.out.println("ente second value of");
String s2=br.read();


		System.out.println(s1 +""+ s2);
	}
}
