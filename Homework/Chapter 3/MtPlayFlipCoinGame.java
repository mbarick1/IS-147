// This is Exercise 3.14 for homework and my name is MBarick Traore

import java.util.Scanner;

public class MtPlayFlipCoinGame
{
   public static void main(String[] args)
   {
   // computer generates head or tail
   int computer = (int)(Math.random()* 2);
   final int HEADS = 0;
   final int TAILS = 1;
   
   Scanner input = new Scanner(System.in);
   System.out.print( " (0-Heads , 1- Tails) User enter a guess: " );
   int user = input.nextInt();
  
   switch (user)
   {
      case HEADS:
      {
         if (computer == HEADS) 
         System.out.println(" You are heads. Computer is heads. You are correct. ");
         else 
         System.out.println(" You are heads. The computer is tails. you are incorrect. ");    
         break;
      }
      case TAILS: 
      {
         if (computer == HEADS)
         System.out.println(" You are tails. Computer is heads. You are incorrect. ");
         else 
         System.out.println(" You are tails. Computer is tails. You are correct. ");
         break;
      }
   
   }   

   }
}