import java.util.*;
import java.text.*;

class Sep244Date
{
public static void main(String anand[])
{
SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
Calendar c=new GregorianCalendar(2013,0,31);
System.out.println(sdf.format(c.getTime()));
}
}