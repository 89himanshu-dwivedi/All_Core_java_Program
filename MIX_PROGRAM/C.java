import java.util.*;

 class C
{
    public static void main(String args[])
    {
        LinkedList l=new LinkedList();
l.add("a");
l.add("b");
l.add("c");
l.add("d");
l.add("e");
System.out.println(l);

ListIterator lit=l.listIterator();

System.out.println("fowoooooooooooooooooord");

while(lit.hasNext())
{
System.out.println(lit.nextIndex() +"--->"+lit.next());
}

System.out.println("\n");
System.out.println("back woooooooooord ");

while(lit.hasPrevious())
{
System.out.println(lit.previousIndex()+"====>>"+lit.previous());


}
        
        
  System.out.println(l);      
        
        
    }
    
}
