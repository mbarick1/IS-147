import java.util.Scanner;

public class FahrenheitToCelsius
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Enter a degree in in fahrenfeit: ");
   double fahrenheit = input.nextDouble();
   
   double celsius = (5.0/9)*(fahrenheit-32);
   
   System.out.println( fahrenheit + " degree fahrenheit is " + celsius +
                       " degree celsius");
   
   
   
   }
}