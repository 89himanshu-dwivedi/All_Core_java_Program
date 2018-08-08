class Jvm1181
{
public static void main(String kl[])
{
int count=0;
class c=Class.forName();
method  m=c.getDeclaredMethods();

for(method m1:m)
{
count++;
System.out.println(m1);
}
System.out.println(count);
}
}