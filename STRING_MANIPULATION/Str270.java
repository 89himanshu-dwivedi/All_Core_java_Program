import java.util.*;
class A
{
}



class Str270

{
public static void main(String args[])
{
String s1="himanshu kumar dwivedi";
System.out.println("length of s1 is "+s1.length());
String s2=s1.concat("good");
System.out.println("concate the two String is"+ s2);

System.out.println("it is apply the equals  operation in this ");
String se="abc";
String se3="abc";
//String se2=new String("abc");
A a1=new A();
A a2=new A();
int i=10,j=10;

System.out.println(se==se3);
System.out.println(a1== a2);
System.out.println(i==j);

System.out.println(se.equals(se3));
//System.out.println(i.equals(j));

System.out.println("it is apply the Ignore equal case");
String si="abc";
String si1="AbC";
System.out.println(si.equalsIgnoreCase(si1));

System.out.println("it is apply the first lastvbanf contain method in thev strin");
String sfec="Durga Software Solution";

System.out.println(sfec.startsWith("Durga")+"\n"+sfec.endsWith("Solution")+"\n"
+sfec.contains("Software"));
System.out.println(sfec.replace('S','s'));


System.out.println("its is apply the method of finf the value ayt location");
String ic="himanshu kumar dwivedi ku";

System.out.println(ic.charAt(9)+"\n"+ic.indexOf("ku")+"\n"+ic.lastIndexOf("ku"));

System.out.println("apply the trim and split method");
String sst="  himanshu    kumar   ";
System.out.println(sst+"\n"+sst.trim());
String st[]=sst.split("");
for(int mn=0;mn<st.length;mn++)
System.out.println(st[mn]);

System.out.println("it is apply the ignore cases");
String ii="anfddAAmgfdDDDD";
System.out.println(ii.toUpperCase()+"\n"+ii.toLowerCase());

System.out.println("its is String to bytrcode and char array form");
String ac="hima";
byte b[]=ac.getBytes();
for(int nm=0;nm<b.length;nm++)
System.out.print(b[nm]+",");


char[] ch=ac.toCharArray();
for(int k=0;k<ch.length;k++)
System.out.println(ch[k]+",");


System.out.println("it is apply the substring methos inthis area");
String sb="himanhu dwivedi";
System.out.println(sb.substring(5)+"\n"+sb.substring(3,7));

}
}
