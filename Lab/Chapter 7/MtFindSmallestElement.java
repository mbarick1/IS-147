//This is Exercise 7.9 and my name is MBarick Traore

import java.util.Scanner;

public class MtFindSmallestElement
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter ten integer numbers:"); 
      int[] numbers = new int[10]; 
      
      for(int i = 0; i < numbers.length; i++)
      {
         numbers[i] = input.nextInt();
      }
      System.out.println("The minimal value is " + min(numbers));
      
   }
   
   public static int min(int[] array)
   {
      int result = array[0];
      for(int i = 0; i < array.length; i++)
      {   
         if(array[i]< result)
         {   
            result = array[i];
         }
      }
   
   return result;
   }   

}  
      
      
      
      
      
