import java.io.*;
class  IOStream221 
{
	public static void main(String[] args) throws Exception
	{

	FileInputStream fis=new FileInputStream("quotes.txt");
	int n=fis.available();

	byte []b=new byte[n];
	fis.read(b);

	String s1=new String(b);
	System.out.println(s1);
	fis.close();

	
	
	
	
	}
}
