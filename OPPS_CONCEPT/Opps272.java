class A
{
	int   no;        
	 String name;    
	 String address; 
	
 A()
 {
	  no        =10;
	  name    ="sujata";
	 address ="hyd";
	 
 }
 
 void Display()
 {
	 System.out.println(no +"\n"+name+"\n"+"address");
	 
  
}
}
class Opps272
{
public static void main(String kl[])
{
A a=new A();
a.Display();
}
}