import java.util.Scanner;

public class RedoUnit5Test
{
   public static void main (String[] args)
   {
         Scanner input = new Scanner(System.in);
         Scanner scan = new Scanner(System.in);
         String again = "yes";
         
         int value = 0;
         do
         {
            System.out.print("Enter a integer greater than 2 : ");
            value = input.nextInt();
            
               if (value > 3)
               {   
                  int sum = 0; 
                  for( int i = 3; i <= value; i++)
                  {
                     if(i % 2 == 1)
                     {   
                        sum += i; 
                     }   
                  }
                  System.out.println(sum);
               }
               else   
               {
                  System.out.println("You have entered a wrong integer.");
               }    
               
         System.out.print("Would like to go again? yes or no : ");
         again = scan.nextLine();  
         
         }while(again.equalsIgnoreCase("yes"));
   
         System.out.println(" I am glad that you area ok");
   }     
}