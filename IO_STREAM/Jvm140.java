class Student
{

public int getName()
{
return null;
}

public int getRollNo()
{
return 10;
}


}

class Jvm140
{
public static void main(String kl[])
{

//Student s=new Student();
Class c=Class.forName(Student);

//method[] m=c.getDeclredMethods();

for(methods m1:m)
	System.out.println(m1);
}
}
