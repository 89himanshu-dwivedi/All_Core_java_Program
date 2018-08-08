import java.util.*;
import java.io.*;

class Coll189
{
public static void main(String kl[]) throws Exception
{
Properties p=new Properties();
FileInputStream fis=new FileInputStream("db.properties");
p.load(fis);

System.out.println("JDBC Parameter");

System.out.println(".......................");

System.out.println(p.getProperty("url"));
System.out.println(p.getProperty("user"));
System.out.println(p.getProperty("pwd"));

}
}
