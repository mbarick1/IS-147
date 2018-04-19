import java.util.Scanner;

public class ComputeAndInterpretBMI
{
   public static void main(String[] args)
   {   
   Scanner input = new Scanner(System.in); 
   
   final double KILOGRAMS_PER_POUND = 0.45359237;
   final double METERS_PER_INCH = 0.0254;
   
   System.out.print( " Enter a weight in pounds : " );
   double weight = input.nextDouble();
   
   double weightInKilograms = weight * KILOGRAMS_PER_POUND;
   
   System.out.print( " Enter a height in inches ");
   double height = input.nextDouble();
   
   double heightInMeters = height * METERS_PER_INCH;
   
   double bmi = weightInKilograms / (heightInMeters * heightInMeters);
   
   System.out.println("BMI is " + bmi);
   
   if ( bmi < 18.5 )
   System.out.println("underweight");
   
   else if ( bmi < 25.0 )
   System.out.println("Normal");
   
   else if (bmi < 30 )
   System.out.println("overweight" );
   
   else
   System.out.println("Obese");
   
   
    
   
   }
}
