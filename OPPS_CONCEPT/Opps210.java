class A
{

void add(int...a)
{
int result=0;
System.out.println("length of the array"+ "\t"+ a.length);
System.out.println("it is present the array list in  form of the list");
for(int i=0;i<a.length;i++)
{
System.out.println("valuue of th "+ i+"  "+a[i]);
System.out.println();
 result=result+a[i];
}
System.out.println();
System.out.println(" result is " +" \t" +result);
System.out.println();
}
}

class Opps210
{
public static void main(String himanshu[])
{
A a=new A();
a.add();
a.add(10);
a.add(10,20);
a.add(10,20,30);
a.add(10,20,30,40);
a.add(10,20,30,40,50);
a.add(10,20,30,40,50,60);
a.add(10,20,30,40,50,60,70);
a.add(10,20,30,40,50,60,70,80);
a.add(10,20,30,40,50,60,70,80,90);
a.add(10,20,30,40,50,60,70,80,90,100);
}
}

