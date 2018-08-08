

import java.util.*;

class AA {
    public static void main(String kl[])
    {
        LinkedList l=new LinkedList();
l.add("a");
l.add("b");
l.add("c");
l.add("d");
l.add("e");
System.out.println(l);



ListIterator lit=l.listIterator();


while(lit.hasNext())  
  {
 String s=(String)lit.next();
if(s.equals("d")) 
lit.remove();
if(s.equals("a"))
lit.add("A");

if(s.equals("e")) 
lit.set("E"); 
   }

     
System.out.println(l);        
    }
    
}
