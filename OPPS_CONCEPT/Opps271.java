import java.util.*;
class Opps271
{
public static void main(String k[])
{
String s1=new String("himanshu");
String s2=s1.concat("kumar");
String s3=s2.concat("dwivedi");
System.out.println(s1 +"\n"+s2+"\n"+s3+"\n");
StringBuffer sb1=new StringBuffer("himanshu");
StringBuffer sb2=sb1.append("kumar");
StringBuffer sb3=sb2.append("dwivedi");
System.out.println(sb1 +"\n"+sb2+"\n"+sb3+"\n");
}
}