import java.io.*;
class InCount192
{
	public static void main(String[] args) throws Exception
	{
		

	FileInputStream f=new FileInputStream("C:/Users/himanshu/Desktop/nagoorbabu/AA/A1.txt");
	int n=f.available();
	byte[] b=new byte[n];
	f.read(b);

	String s=new String(b);
	System.out.println(s);
	String[]  s1=s.split(" ");

System.out.println("length of the String "+s1.length);
	int total=0;

for(int i=0;i<s1.length;i++)
		{
	if(s1[i].equals("himanshu"))
			{
		total=total+1;
			}
		}

System.out.println("in file file  no of time himanshu\t"+total);
f.close();
	

		
	}
}
