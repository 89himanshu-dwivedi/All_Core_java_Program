@FunctionalInterface
interface Himanshu
{
void getName();
}

class Kumar implements Himanshu
{
public  void getName()
{
System.out.println("himanshu kumar");
}
}
class Anno182
{
public static void main(String kl[])
{
Himanshu u=new Kumar();
u.getName();
}
}