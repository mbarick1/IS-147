//This is Test 3 and my name is MBarick Traore

import java.util.Scanner;

public class Unit3Test
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   int number = 10 + (int)(Math.random() * 90);
   
   System.out.println("Random number is " + number );
   
   int numberDigit1 = number/10;
   int numberDigit2 = number%10;
   
   System.out.print( "Enter a guess : ");
   int guess = input.nextInt();
   
   int guessDigit1 = guess/10;
   int guessDigit2 = guess%10;
   
   if (number == guess)
      System.out.println(" You win $1000 ");
   else if (numberDigit1 == guessDigit2 && numberDigit2 == guessDigit1)
      System.out.println( " you win $100 ");
   else if (numberDigit1 == guessDigit1 || numberDigit2 == guessDigit2)
      System.out.println(" you win a $1");
   else if (numberDigit1 == guessDigit2 || numberDigit2 == guessDigit1)
      System.out.println(" you win a $1" );    
   else 
      System.out.println(" you win nothing ");
      
   }   
}