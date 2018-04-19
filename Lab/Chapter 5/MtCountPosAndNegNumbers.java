// This Exercise 5.1 for lab and my name is MBarick Traore

import java.util.Scanner;

public class MtCountPosAndNegNumbers
{
   public static void main(String[] args)
   {
      int posNumber = 0, negNumber = 0, sumOfPosNumber = 0, sumOfNegNumber = 0; 
      int enteredNumber, total;
      double average;

      
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter an integer(the input ends if it is a 0) :");
      enteredNumber = input.nextInt();

      while ( enteredNumber != 0)
      {
         if (enteredNumber > 0 )
         {
             posNumber++;
             sumOfPosNumber += enteredNumber; 
         }
         else
         {
             negNumber++;
             sumOfNegNumber += enteredNumber;
         }
         System.out.print("Enter an integer(the input ends if it is a 0) :");
         enteredNumber = input.nextInt();
      }
  
      total = sumOfPosNumber + sumOfNegNumber;
      
      average = (double)total/(posNumber + negNumber);
      
      System.out.println("The number of positive number is " + posNumber);
      System.out.println("The number of negative number is " + negNumber);
      System.out.println("The total is " + total);
      System.out.println("The average is " + average);
   }    
}