// This is Exercise 5.34 for homework and my name is MBarick Traore

import java.util.Scanner;

public class MtPlaySRPGameUsingLoop
{
   public static void main(String[] args)
   {
      int count = 0;
      while(count <= 2 || count <=-2) 
      {
         final int SCISSOR = 0;
         final int ROCK = 1;
         final int PAPER = 2;  
         
         // Generate a random number
         int computer = (int)(Math.random()* 3); 
      
         // Prompt the user to pick a number
         Scanner input = new Scanner(System.in);
         System.out.print( " ( 0-Scissor, 1-Rock , 2-Paper ) Pick a number : " );
         int user = input.nextInt();
         
         switch (computer) {
            case SCISSOR:
               if (user == SCISSOR) {
                  System.out.println("It is a draw");
               }
               else if (user == ROCK) {
                  System.out.println("You won");
                  count++;
               }
               else if (user == PAPER) {
                  System.out.println("You lost");
                  count--;
               }
               break;
            
            case ROCK:
               if (user == SCISSOR) {
                  System.out.println("You lost");
                  count--;
               }
               else if (user == ROCK) {
                  System.out.println("It is a draw");
               }
               else if (user == PAPER) {
                  System.out.println("You won");
                  count++;
               }
               break;
            
            case PAPER:
               if (user == SCISSOR) {
                  System.out.println("You won");
                  count++;
               }
               else if (user == ROCK) {
                  System.out.println("You lost");
                  count--;
               }
               else if (user == PAPER) {
                  System.out.println("It is a draw");
               }
               break;
         }
      }

      if (count > 2) {
         System.out.println("You won more than two times");
      }
       else {
         System.out.println("The computer won more than two times");
      }
  }

}     
   
      