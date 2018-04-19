//This is Exercise 5.49 for lab and my name is MBarick Traore

import java.util.Scanner;

public class MtCountVowelAndConsoment
{
   public static void main(String[] args)
   {
      
      int countCon = 0;
      int countVowel = 0;
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter a string :");
      String enteredString = input.nextLine();
      
       
      
      for(int index = 0; index < enteredString.length(); index++ )
      {
      char temp = enteredString.charAt(index);  
          
          if(temp=='a' || temp=='e' ||temp=='i' || temp=='o' || temp=='u')
            
            countVowel++;
            
          else if (Character.isLetter(temp))
            
            countCon++;
            
      }
      
      System.out.println("Number of consonents is :  "+ countCon);
      System.out.println("Number of vowels is : "+ countVowel);


   }
}
