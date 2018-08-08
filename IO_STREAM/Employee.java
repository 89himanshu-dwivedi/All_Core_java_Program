import java.io.*;

public class Employee implements Serializable
{
int eno;
String ename;
float  esal;
String eaddr;

Employee(int eno,String ename,float esal,String eaddr)
{
this.eno=eno;
this.ename=ename;
this.esal=esal;
this.eaddr=eaddr;
}

public void getEmpDetails()
{
System.out.println("Show Employee Details");
System.out.println("---------------------");
System.out.println("Employee esal"+eno);
System.out.println("Employee esal"+ename);
System.out.println("Employee esal"+esal);
System.out.println("Employee esal"+eaddr);
}

}
