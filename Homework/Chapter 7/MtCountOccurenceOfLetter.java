//This is Exercise 7.3 and my name is MBarick Traore

import java.util.Scanner;

public class MtCountOccurenceOfLetter
{
   public static void main(String[] args)
   {       
      Scanner input = new Scanner(System.in); 
      int[] numberList = new int[100];
      
      int index = 0;
      int occurences = 0;
      int enteredNumber = 0;
      do
      {
          System.out.print("Enter the integer between 1 and 100:"); 
          enteredNumber = input.nextInt();
        
          if(enteredNumber >= 1 && enteredNumber <= 100)
          {
            numberList[index] = enteredNumber;
            index++;
          }
      }while(enteredNumber !=0); 
      
      for(int number = 1; number <= 100; number++)
      {
         for(int numberOfOccurence: numberList)     
         {
            if(number == numberOfOccurence)
            {
               occurences++;
            }
         }
         if(occurences == 1)
         {
            System.out.println( number + " occurs " + occurences + " time.");
         }
         else if(occurences > 1)
         {
            System.out.println( number + " occurs " + occurences + " times."); 
         }  
      occurences = 0;  
      }  
    }
} 