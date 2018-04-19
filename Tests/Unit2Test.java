import java.util.Scanner;

import java.text.DecimalFormat;

public class Unit2Test
{
   public static void main(String[] args)
   {
    DecimalFormat fmt = new DecimalFormat("0.##");
    
    Scanner  input = new Scanner(System.in);
    
    System.out.print(" Enter a 3 digits number: ");
    int threeDigitNumber = input.nextInt();
    
    int digit1 = threeDigitNumber / 100;
    int remainingDigit = threeDigitNumber %100;
    
    int digit2 = remainingDigit /10;
        remainingDigit = remainingDigit %10;
    
    int digit3 = remainingDigit;
    
    int sumOfDigits = digit1 + digit2 + digit3 ;
    
    double avgOfDigits = ( digit1 + digit2 + digit3 ) / 3.0;
    
    System.out.println( " Sum of the digits is : " + sumOfDigits ); 
    System.out.println( " average of digits is : " + fmt.format(avgOfDigits));
         
   
    }
}