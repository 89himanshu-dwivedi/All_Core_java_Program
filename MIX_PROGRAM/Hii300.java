import java.util.*;

class Hii300
{
public static void main(String kl[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enetrt the value of n");
int n=sc.nextInt();


if( n >= 18 )
System.out.println("your are valid B'Z\t"+n);
else
throw new RuntimeException("your are not valid :\t"+n);

}
}
