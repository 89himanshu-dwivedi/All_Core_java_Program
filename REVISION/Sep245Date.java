import java.util.*;
import java.text.*;

class Sep245Date
{
public static void main(String anand[])
{
SimpleDateFormat sdf=new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
Calendar c=new GregorianCalendar(1996,1,7,12,24,56);

int  year            = c.get(Calendar.YEAR);
int  month           = c.get(Calendar.MONTH);
int  dayofmonth      = c.get(Calendar.DAY_OF_MONTH);
int  dayofweek       = c.get(Calendar.DAY_OF_WEEK);
int  weekofyear      = c.get(Calendar.WEEK_OF_YEAR);
int  weekofmonth     = c.get(Calendar.WEEK_OF_MONTH);
int  hour            = c.get(Calendar.HOUR);
int  hourofday       = c.get(Calendar.HOUR_OF_DAY);
int  minute          = c.get(Calendar.MINUTE);
int  second          = c.get(Calendar.SECOND);
int  milisecond      = c.get(Calendar.MILLISECOND);

System.out.println(sdf.format(c.getTime()));

System.out.println("YEAR            "          +year);
System.out.println("MONTH           "          +month);
System.out.println("DAY OF MONTH    "          +dayofmonth);
System.out.println("DAY OF WEEK     "          +dayofweek);
System.out.println("WEEK OF YEAR    "          +weekofyear);
System.out.println("WEEK OF MONTH   "          +weekofmonth);
System.out.println("HOUR            "          +hour);
System.out.println("HOUR OF DAY     "          +hourofday);
System.out.println("MINUTE          "          +minute);
System.out.println("SECOND          "          +second);
System.out.println("MILLI SRECOND   "          +milisecond);

}
}