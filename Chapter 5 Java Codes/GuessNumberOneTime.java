import java.util.Scanner;

public class GuessNumberOneTime
{
   public static void main(String[] args)
   {
   int number = (int)(Math.random()*101);
   
   Scanner input = new Scanner(System.in);
   System.out.println("Guess a number between 0 and 100");
   
   int guess = -1;
   while (guess != number)
   {
   System.out.print("\nEnter a guess number : ");
   guess = input.nextInt();
   
   if ( guess == number)
   System.out.print("Your are right ");
   else if (guess > number )
   System.out.print("Your guess is too high ");
   else 
   System.out.print("Your guess is too low ");
   }
   
   
   }
}