
import java.text.*;

class Sep24Date
{
public static void main(String kl[])
{
String pattern = "yyyy-MM-dd";
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

String date = simpleDateFormat.format(new Date());
System.out.println(date);
}
}