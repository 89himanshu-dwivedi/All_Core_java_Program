import java.io.*;
class IOStream222 
{
	public static void main(String[] args)  throws IOException
	{

FileInputStream fis=new FileInputStream("11.jpg");
	int n=fis.available();

	byte []b=new byte[n];
	fis.read(b);

	FileOutputStream f0s=new FileOutputStream("111.jpg");
	

//	byte[] b1=fis.getBytes();
	f0s.write(b);
	//String s1=new String(b);loop gone to infinte loop its not possible but cmd is not response
	//System.out.println(s1);

fis.close();
//fos.close();
	}
}
