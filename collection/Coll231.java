import java.util.*;
/*class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	Employee ee1=(Employee)o1;
	Employee ee2=(Employee)o2;
	int i=ee1.ename.compareTo(ee2.ename);
	
	return -i; 
	}
	
	
	}
	*/
	
	
class Employee implements Comparable
{
String eid;
String ename;
String eaddr;
float esal;

Employee(String eid,String ename,String eaddr,float esal)
{
this.eid=eid;
this.ename=ename;
this.eaddr=eaddr;
this.esal=esal;
}

 

public int compareTo(Object o)
{

Employee ee=(Employee)o;
int val=this.eaddr.compareTo(ee.eaddr);
return +val;
}



public String toString()
{
return "["+eid+"\t" + ename+"\t" + eaddr+"\t" + esal+"]" ;
}
}

class Coll231
{
public static void main(String args[])
{
Employee e1=new Employee("100","himanshu","kanpur",100.0f);
Employee e2=new Employee("201","imanshu","anpur",201.0f);
Employee e3=new Employee("402","manshu","npur",982.0f);
Employee e4=new Employee("303","anshu","pur",723.0f);
Employee e5=new Employee("504","nshu","ur",504.0f);


//MyComparator  a=new MyComparator();
TreeSet t=new TreeSet();
t.add(e1);
t.add(e2);
t.add(e3);
t.add(e4);
t.add(e4);
System.out.println(t);
}
}


