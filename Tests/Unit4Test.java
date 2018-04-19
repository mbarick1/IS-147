// This is Test4 and my name is MBarick Traore

import java.util.Scanner;

public class Unit4Test
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Enter first name :");
   String firstName = input.nextLine();   
   
   System.out.print(" Enter last name :");
   String lastName = input.nextLine();
   
   firstName = firstName.toUpperCase();
   lastName = lastName.toLowerCase();
   
   int number = 10 + (int)(Math.random()* 90) ; 
   
   System.out.println( firstName + " " + lastName + " 's password is: " + "\"" + 
                     firstName.charAt(firstName.length()-1) + number + lastName.substring(0,3)+ "\"" );

   
   
   }
}