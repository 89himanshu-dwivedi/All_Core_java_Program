import java.io.*;
class  IOStream220 
{
	public static void main(String[] args)  throws IOException
	{
	FileOutputStream fis=new FileOutputStream("quotes.txt");

	String s1="every guy want a big job but do      not take any type of  risk in our life...      without  risk and without hardwork donot possible any type of success";
	
	byte[] b=s1.getBytes();
	fis.write(b);

	String s2=new String(b);
	System.out.println(s2);
	fis.close();

	
	
	}
}
