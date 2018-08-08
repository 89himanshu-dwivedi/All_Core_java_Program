import java.text.*;
import java.util.*;

class Sep241Date
{
public static void main(String kl[])

{
	//Date d=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
String s1="10-04-1999 01:20:39";
try
{
Date d=sdf.parse(s1);
System.out.println(d);
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
