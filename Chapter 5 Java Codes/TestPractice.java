//Unit 5 test/ last ssemester
/*
I’ve got 99 problems but Java ain’t one of them. You will write a program that asks a user 
how many problems they have
-
In your prompt
instruct them to enter a number between 3 and 99.
(Check to make sure they comply.)
You will then print a line for each of their problems finishing off with a line saying they have no problems.
You will then ask if they have any more problems to start the process again.
Finish your program with a pleasant output line to let the user know he/she is done.
Hints:
You need to account for the difference between 1 “problem” and 2 or more “problems”.
Since you are using inputs of an integer and a string value you may consider either 2
scanner objects or you will have to parse the integer out of a string.
If your outer loop repeats on an input of “yes” or “y” then make sure to use the scannerName.equals 
rather than the == syntax.
*/

import java.util.Scanner;

public class TestPractice
{
      public static void main(String[] args) 
      {  
          Scanner input = new Scanner(System.in);
          Scanner again = new Scanner(System.in);
          String another = "";
          
          int problems = 0;
          do
          {
               System.out.print("How many problems do you have? Enter a number from 3 to 99 : ");
               problems = input.nextInt();
               
                     if(problems >= 3 && problems <= 99)
                     {
                           for(int line = problems; line >= 0; line--)
                           {
                                 if(line == 1)
                                 {
                                       System.out.println("You have " + line + " problem but Java aint one");
                                 }
                                 else
                                 {
                                       if (line == 0)       
                                       {
                                          System.out.println("You have no problem");
                                       }
                                       else
                                       {
                                       System.out.println("You have " + line + " problems but Java aint one");
                                       }
                                 }         
                           }
                     }
                     else
                     {
                        System.out.println("You did not enter a valid number of problems");
                     }                   
                     System.out.print("Would you like to go again? Enter yes or no : ");
                     another = again.nextLine();
          } while(another.equalsIgnoreCase("Yes")|| another.equalsIgnoreCase("Y"));  
          System.out.println("I am glad that you are OK ! ");  
     }
}