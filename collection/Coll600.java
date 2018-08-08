import java.util.*;

class Himanshu
{
int id;
String name;
String addr;

Himanshu(int id,String name,String addr)
{
this.id=id;
this.name=name;
this.addr=addr;
}
}

class Info
{
public ArrayList<Himanshu> getHimanshuDetails(ArrayList<Himanshu>al)
{
al.add(new Himanshu(100,"himanshu","kanpur"));
al.add(new Himanshu(102,"himansh","kanpu"));
al.add(new Himanshu(103,"himans","kanpu"));

return al;
}
}

class Coll600
{
public static void main(String kl[])
{
Info i=new Info();

ArrayList<Himanshu> al=new ArrayList<Himanshu>();
al=i.getHimanshuDetails(al);
System.out.println("id\tname\taddr\t");
System.out.println("========");
for(Himanshu h : al)
{
System.out.println(h);
}
}
}


