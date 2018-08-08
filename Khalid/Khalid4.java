
public class Khalid4 {
public static  void main(String args[]) {
double fahrenheit = 62.5;
/* Convert */
double Celsius = f2c(fahrenheit);
System.out.println(fahrenheit + "=" +Celsius  );
}


static double f2c(double fahr)
{
	return (fahr - 32.0) * 5.0 / 9.0;
}

// double cel=(fahrenheit - 32.0) * 5.0 / 9.0;
//System.out.println(cel);


}
