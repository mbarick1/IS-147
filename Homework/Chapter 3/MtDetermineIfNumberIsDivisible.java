// This is Exercise 3.26 for homework and my name is MBarick Traore

import java.util.Scanner;

public class MtDetermineIfNumberIsDivisible
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print( " Enter an number : " );
   int number = input.nextInt();
   
   System.out.print( " Is " + number + " divisible by 5 and 6 ?");
   
   if (number % 5 == 0 && number % 6 == 0)
      System.out.println("true");
   else
      System.out.println("false");
   
   System.out.print(" Is " + number + " divible by 5 or 6 ? ");
   
   if (number % 5 == 0 || number % 6 == 0)
      System.out.println("true");      
   else
      System.out.println("false");
   
   System.out.print(" Is " + number + " divible by 5 or 6, but not both ? ");
   
   if (number % 5 == 0 ^ number % 6 == 0) 
      System.out.println("true");
   else
      System.out.println("false");
         
   }
}
  
