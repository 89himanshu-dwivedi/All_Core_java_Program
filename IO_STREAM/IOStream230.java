import java.io.*;
class IOStream230 
{
	public static void main(String[] args) throws Exception 
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("1");
	
String s1=br.readLine();

		System.out.println("2");
	String s2=br.readLine();

	String s=s1+s2;
	System.out.println(s);



System.out.println("11");
int  i1=br.read();

		System.out.println("22");
	int i2=br.read();

int i=i1+i2;
System.out.println(i);
	}
}
