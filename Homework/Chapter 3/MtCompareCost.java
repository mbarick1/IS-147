// This is Exercise 3.33 for homework and my name is MBarick Traore

import java.util.Scanner;

public class MtCompareCost
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);

   System.out.print( " Enter the weight for package 1 : " );
   double weight1 = input.nextDouble();
   System.out.print( " Enter the price for package 1 : " );
   double price1 = input.nextDouble();
   System.out.print( " Enter the weight for package 2 : " );
   double weight2 = input.nextDouble();
   System.out.print( " Enter the price for package 2 : " );
   double price2 = input.nextDouble();
   
   if ( price1 / weight1 < price2 / weight2 )
      System.out.println( "Package 1 has a better price" );
   
   else if ( price1 / weight1 > price2 / weight2)  
      System.out.println( "Package 2 has a better price ");
   
   else
      System.out.println("Neither package is better than the other");
      
      
   }

}
   
   
   
