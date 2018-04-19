// This is Exercise 2.23 and my name is MBarick Traore

import java.util.Scanner;

import java.text.NumberFormat;

public class MtCalculateCostOfDriving 
{
   public static void main(String[] args) 
   {
   Scanner input = new Scanner(System.in);
   
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   
   System.out.print(" Enter a distance to drive : ");
   double distance = input.nextDouble();
   
   System.out.print(" Enter a number for miles per gallon : ");
   double milesPerGallon = input.nextDouble();
   
   System.out.print(" Enter a price per gallon : ");
   double pricePerGallon = input.nextDouble();
   
   double costOfDriving = distance / milesPerGallon * pricePerGallon;
   
   System.out.println( " Cost of driving is " + fmt.format(costOfDriving) ); 
   
   }
}   
   
