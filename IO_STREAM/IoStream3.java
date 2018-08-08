import java.io.*;
import java.util.*;
class IoStream3
{
public static void main(String kl[]) throws Exception
{
FileInputStream fis=new FileInputStream("812.jpg");
int size=fis.available();
byte[] b=new byte[size];
fis.read(b);

FileOutputStream fos=new FileOutputStream("C:\\Users\\himanshu\\Desktop\\8120.jpg");
fos.write(b);
fis.close();
fos.close();
}
}
