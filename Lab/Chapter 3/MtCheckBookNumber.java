// This is Exercise 3.9 and my name is Mbarick Traore 

import java.util.Scanner;

public class MtCheckBookNumber
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print( "Enter the first 9 digits of an ISBN as integer: ");
   int nineDigits = input.nextInt();
   
   int digit1 = nineDigits/100000000;
   int digit2 =(nineDigits/10000000)%10;
   int digit3 =(nineDigits/1000000)%10;
   int digit4 =(nineDigits/100000)%10;   
   int digit5 =(nineDigits/10000)%10;
   int digit6 =(nineDigits/1000)%10;
   int digit7 =(nineDigits/100)%10;
   int digit8 =(nineDigits/10)%10;
   int digit9 =(nineDigits/1)%10;
   
   int checkSum = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 +
                     digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9 ) % 11;
                     
   if ( checkSum == 10)
      System.out.println("The ISBN-10 number is : " + digit1 + digit2 +digit3 + digit4 + 
                          digit5 + digit6 + digit7 + digit8 + digit9 + " X " );
   else 
      System.out.println("The ISBN-10 number is : " + digit1 + digit2 +digit3 + digit4 + 
                          digit5 + digit6 + digit7 + digit8 + digit9 + checkSum );   
   
   
   
   
   }
}