import java.util.*;
import java.io.*;

class Coll118810
{
public static void main(String kl[]) throws Exception
{
Properties p=new Properties();
p.setProperty("name","himanshu");
FileOutputStream fos=new FileOutputStream("db.properties");
p.store(fos,"details");

}
}
