import java.util.*;
import java.text.*;
class Sep242Date
{
public static void main(String kl[])
{
SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
Date d=new Date();
System.out.println(sdf.format(d));
}
}