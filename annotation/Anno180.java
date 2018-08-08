import java.lang.annotation.*;

import java.util.*;
class Bank
{
	@SuppressWarnings("unchecked")
public ArrayList m1()
{
ArrayList ar=new ArrayList();
ar.add("ramu");
ar.add("shyamu");
return ar;
}
}
class Anno180
{
public static void main(String k[])
{
Bank b=new Bank();
List l=b.m1();
System.out.println(l);
}
}
