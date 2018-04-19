// This is test Unit 5 and my name is Mbarick traore

import java.util.Scanner;

public class Unit5Test
{
public static void main (String[] args)
   {
  		int value; 	//to hold user integer input
		String again = "yes"; //sentinel with initial assignment for repeats 
		Scanner scan = new Scanner(System.in);
      //Begin coding here
	   while(value < 3) 
		{
 		System.out.print(" Enter a positive integer greater that 2 : ");
		//check to see if integer is less than 3
 			if (value < 3)
         {
            //error message prompting for proper input
   	      System.out.print("You entered a wrong number");
            value = scan.nextInt();
         
         //otherwise  inner loop to create sum
         else (if value < ) 
    	   {
			   int sum=0;
			   for (value = 3 ; value > 2 ; value++)
            {   //statement;
               If (value % 2 == 1)
               {
               sum += value; 
               System.out.println ("The sum of the odd integers from 3 to "
                             + value + " is " + sum);
	            }
            }
        
         }	
		 
       
       System.out.println ("Do you want to do another? yes or no ");
		 Scanner over = new Scanner(System.in);
	    //assign the new input to the sentinel;
       
       again = over.nextLine();
       while(again.equals("yes"));
       }
		 if (again.equals("yes")
       {
         System.out.print(" Enter a positive integer greater that 2 : ");
         value = scan.nextInt();
       }
       else
         System.out.print(" Thanks for playing");//thanks
       }
   }
}