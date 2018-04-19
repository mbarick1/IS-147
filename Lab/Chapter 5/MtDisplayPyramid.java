// This is Exercise 5.17 for lab and my name is MBarick Traore 

import java.util.Scanner;

public class MtDisplayPyramid 
{
      public static void main(String[] args) 
      {
                        
             // Create a Scanner
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number of lines
            System.out.println("Enter the number of lines form 1-15:\n ");
           
          //Check to see IF the number entered is NOT 1-15
            int numberOfLines = -1;
            while( !(numberOfLines >= 1 && 15 >= numberOfLines)) 
            {
                System.out.print("Enter number of lines: ");
                numberOfLines = input.nextInt();

                if(numberOfLines >= 1 && 15 >= numberOfLines)                
                  System.out.println("Right number of line ");  
                else
                  System.out.print("Wrong number of line ");
            }                
            //Start with an outer for loop for ROWS to step through lines 1 to whatever
            for ( int row = 1; row <= numberOfLines; row++) 
            {
            //then some inner for loops
            /* Print NUMBER_OF_LINES in each row with leading spaces
            Hint for each row there needs to be a column of leading spaces = to the total
            number of lines minus the number of values in that line so if the pyramid has 12
             lines the first line has 11 spaces and then the number 1.*/
               for (int column = 1; column <= ( numberOfLines - row); column++)
               {
               System.out.print("  ");
               /* Print leading numbers for each row:
                each row has to count backwards from its row# to 1*/
               }  
                  for ( int column = row; column >= 1; column--)
                  {
                  //Conditional statemetn to properly space single digit pyramids or 2digit pyramids
                   System.out.print(column + " ");
                  }
                     // Print ending numbers for each row 2, 3, ...
                     for (int column = 2;  column <= row; column++)
                     {   
                        System.out.print(column + " ");
                     }
             
            System.out.println();
            }
           
      }
}