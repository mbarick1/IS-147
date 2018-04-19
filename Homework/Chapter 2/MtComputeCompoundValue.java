// This is Exercise 2.13 and my name is MBarick Traore

import java.util.Scanner;

import java.text.NumberFormat;

public class MtComputeCompoundValue
{
   public static void main(String[] args) 
   {
   final double MONTHLY_INTEREST_RATE = 1.00417;
   
   Scanner input = new Scanner(System.in);
   
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   
   System.out.print(" Enter a monthly saving amount: ");
   double amount = input.nextDouble();
   
   double firstMonth = amount * MONTHLY_INTEREST_RATE;
   double secondMonth = (amount + firstMonth) * MONTHLY_INTEREST_RATE;
   double thirdMonth = (amount + secondMonth) * MONTHLY_INTEREST_RATE;
   double fourthMonth =(amount + thirdMonth) * MONTHLY_INTEREST_RATE;
   double fifthMonth = (amount + fourthMonth) * MONTHLY_INTEREST_RATE;
   double sixthMonth = (amount + fifthMonth) * MONTHLY_INTEREST_RATE;
   
   System.out.println(" The account value after the sixth month is " + 
                      fmt.format(sixthMonth));
   
   }
}   
   
   
