// This is Exercise 2.3 and My name is MBarick Traore

import java.util.Scanner;

import java.text.DecimalFormat;

public class MtConvertFeetIntoMeters
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   DecimalFormat fmt = new DecimalFormat ("0.###");

   System.out.print(" Enter a value in feet: ");
   double valueInFeet = input.nextDouble();
   
   double valueInMeters = valueInFeet * .305;
      
   System.out.println( fmt.format(valueInFeet) + " feet is " + 
                       fmt.format(valueInMeters) + " meters " ); 
   
   
   
   
   }
}