
import java.io.*;
import java.util.*;
class Coll400
{
public static void main(String kl[]) throws Exception
{
Properties p=new Properties();
FileInputStream fs=new FileInputStream("h.properties");
p.load(fs);
System.out.println("load the class decs");
System.out.println("class nME\t"+p.getProperty("name"));
System.out.println("class nME\t"+ p.getProperty("addr"));
System.out.println("class nME\t"+ p.getProperty("post"));
System.out.println("class nME\t"+ p.getProperty("pindode"));

System.out.println("retriev the value");

Properties p1=new Properties();


p.setProperty("name","hii");

FileOutputStream fs1=new FileOutputStream("abc.properties");
p1.store(fs1,"lolelo");

}
}