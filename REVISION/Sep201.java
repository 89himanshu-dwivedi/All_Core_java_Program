class Sep201
{
public static void main(String klk[])
{
	/*
for(int i=1;i<10;i+=2)
{
for(int k=0;k<(4-i)/2;k++)
{
System.out.print(" ");
}
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println("\n");
}
*/
for (int i = 0; i < 5; i++) 
  System.out.println("      *************".substring(i, 5 + 2*i));
}}