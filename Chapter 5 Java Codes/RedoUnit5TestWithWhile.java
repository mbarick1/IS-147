import java.util.Scanner;

public class RedoUnit5TestWithWhile
{
public static void main (String[] args)
   {
  		int value; 
		String again = "yes";  
		Scanner scan = new Scanner(System.in);
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a positive integer greater that 2 : ");
		value = input.nextInt();

      
      while(again.equalsIgnoreCase("yes"))
      {
       			
         if (value > 3)
         {
            int sum = 0;
            for( int number = 3 ; number <= value; number += 2 )
            {
               sum += number;
            }
            
            System.out.println ("The sum of the odd integers from 3 to "
                             + value + " is " + sum);
         }
         else 
         {
         System.out.println("\nThe number must be greater that 3. \n");
         }
         
         System.out.print("Do you want to do another ? yes or no :");
         again = scan.nextLine();
       }  
         System.out.print("Thanks for playing.");


   }
}