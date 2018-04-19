// This is Exercise 3.21 and my name is MBarick Traore

import java.util.Scanner;

public class MtCalculateTheDayOfTheWeek
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
/* h = day of the week
   q = day of the month
   m = month
   j = century
   k = the year of century
*/
   System.out.print(" Enter a year : ");
   int year = input.nextInt();
   int j = year / 100;
   int k = year % 100;
   
   System.out.print(" Enter a month form 1-12 : ");
   int m = input.nextInt();
   if (m == 1|| m == 2)
   {
       m = m + 12;
    year = year - 1;
   }

   
   System.out.print(" Enter a the day of the month from 1-31 :" );
   int q = input.nextInt();
   
   int h = ((q + 26 * (m + 1)/10 + k + k/4 + j/4 + 5 * j) % 7);


   switch (h)
   {
   case 0: System.out.println(" The day of the week is Saturday ");break;
   case 1: System.out.println(" The day of the week is Sunday ");break;
   case 2: System.out.println(" The day of the week is Monday ");break;
   case 3: System.out.println(" The day of the week is Tuesday ");break;
   case 4: System.out.println(" The day of the week is Wednesday ");break;
   case 5: System.out.println(" The day of the week is Thursday ");break;
   case 6: System.out.println(" The day of the week is Friday ");break;
   }
   
   
   
   }
}