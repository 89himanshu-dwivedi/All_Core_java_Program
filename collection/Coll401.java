import java.util.*;
import java.io.*;

class Coll401
{
public static void main(String kl[]) throws Exception
{
Properties p=new Properties();
FileInputStream fs=new FileInputStream("db.properties");
p.load(fs);
System.out.println("load the class decs");
System.out.println("class nME"+p.getProperty("driver_Class"));
System.out.println("class nME"+ p.getProperty("driver_URL"));
System.out.println("class nME"+ p.getProperty("db_user"));
System.out.println("class nME"+ p.getProperty("db_password"));

}
}