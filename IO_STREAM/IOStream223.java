import java.io.*;
import java.util.*;


class IOStream223 
{
	public static void main(String[] args)  throws Exception
	{
	int count=0;
	FileOutputStream fos=new FileOutputStream("a22.txt");
	String s1="himanshu is want to a big salary  job  but himanshu is not put more concept on our mind  but himanshu try to do somthing for in our life";
	byte[] b=s1.getBytes();
	fos.write(b);
	String s2=new String(b);

	StringTokenizer st=new StringTokenizer(s2);
int i=	st.countTokens();
System.out.println(i);
while(st.hasMoreTokens())
		{
String ss=st.nextToken();

if(ss.equals("himanshu"))
			{
	count++;
			}
		/*	else
			{
				//System.out.println("nothing ");
			}
*/
		}

		System.out.println(count);
		
	fos.close();
	}
}
