//This is Exercise 7.23 and my name is MBarick Traore 

import java.util.Scanner;

public class MtLockerPuzzle
{
   public static void main(String[] args)
   {
      // L = locker
      // S = student
      
      boolean[] lockerOpen = new boolean[100];
      for(int S = 1; S <= lockerOpen.length; S++)
      {
         for(int L = S; L <= lockerOpen.length; L += S)
         {
            if(lockerOpen[L-1] == false)
            {
               lockerOpen[L-1] = true;
            }
            else
            {
               lockerOpen[L-1] = false;
            }         
         }
      }
      System.out.println("The open lockers are: ");
      for(int L = 1; L <= lockerOpen.length; L++)
      { 
         if(lockerOpen[L-1] == true)
            
            System.out.print("L" + L + " ");
      }
   }
}