import java.io.*;

class IOstream210
{
public static void main(String kl[]) throws Exception
{

FileInputStream fis=new FileInputStream("11.jpg");
int size=fis.available();
byte[] b=new byte[size];
fis.read(b);
FileOutputStream fos=new FileOutputStream("111.jpg");
fos.write(b);
fis.close();
fos.close();
}
}


