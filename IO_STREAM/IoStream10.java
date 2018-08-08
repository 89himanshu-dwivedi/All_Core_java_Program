import java.io.*;

class Employees implements Serializable
{
int eno;
String ename;
float  esal;
String eaddr;

Employees(int eno,String ename,float esal,String eaddr)
{
this.eno=eno;
this.ename=ename;
this.esal=esal;
this.eaddr=eaddr;
}

public void getEmpDetails()
{
System.out.println("Show Employees Details");
System.out.println("---------------------");
System.out.println("Employees eno"+eno);
System.out.println("Employees ename"+ename);
System.out.println("Employees esal"+esal);
System.out.println("Employees eaddr"+eaddr);
}

}

public class IoStream10
{
public static void main(String kl[]) throws Exception
{
FileOutputStream fos=new FileOutputStream("emp.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);

Employees emp1=new Employees(111,"Dubey",800000,"Kanpur Nagar");
System.out.println("employees details before Serializable");
emp1.getEmpDetails();

oos.writeObject(emp1);
System.out.println();

FileInputStream fis=new FileInputStream("emp.txt");
ObjectInputStream ois=new ObjectInputStream(fis);

Employees emp2=(Employees)ois.readObject();
System.out.println("employees details after Deserialization");
emp2.getEmpDetails();

}
}
