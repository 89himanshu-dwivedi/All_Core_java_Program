import java.io.*;
class IOStream224 
{
	public static void main(String[] args) throws Exception 
	{
	FileWriter fw=new FileWriter("fw.txt");
	String s1="i am very bad guy";
	char[]  c=s1.toCharArray();
	fw.write(c);
	String s=new String(c);
	System.out.println(s1);
	fw.close();
	
	}
}
