enum Com
{
Atten(60),Max(90),Avg(75);
int rang;
Com(int rang)
{
this.rang=rang;
}

public void Display()
{
System.out.println("hii aktu"+rang);

}
}
class Opps164
{
public static void main(String kl[])
{
System.out.print("detailos\t");
Com.Max.Display();
}
}

