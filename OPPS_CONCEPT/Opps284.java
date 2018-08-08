class Opps2840
{
int   i,j;
Opps2840(int i)
{
this.i=i;
//System.out.println(i);
}
Opps2840(int i,int j)
{
this.i=i;
this.j=j;
//System.out.println(i+","+j);

}
void m1()
{
System.out.println(i+","+j);
}
}

class Opps284
{
public static void main(String kl[])
{
Opps2840 a=new Opps2840(1);
a.m1();
Opps2840 a1=new Opps2840(2,3);
a1.m1();

}
}



