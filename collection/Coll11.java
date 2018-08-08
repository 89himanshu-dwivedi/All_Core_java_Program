import java.util.*;

class Coll11
{
public static void main(String kl[])
{
TreeMap s=new TreeMap();
s.put("F","AAA");
s.put("A","FFF");
s.put("B","BBB");
s.put("D","DDD");
s.put("E","EEE");
s.put("C","CCC");
System.out.println(s);

System.out.println("value of the decendind order of this map"+s.descendingMap());



System.out.println("cieling function is apply"+s.ceilingKey("D"));
System.out.println("higherv value odf "+s.higherKey("D"));
System.out.println(s.floorKey("D"));
System.out.println(s.lowerKey("D"));TreeMap s=new TreeMap();

}
}