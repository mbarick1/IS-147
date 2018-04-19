//This is the histogram project and my name MBarick Traore

import java.util.Scanner;

public class HistogramMt
{
   public static void main(String[] args)
   {
      int box;
      int[] ranges = new int[10]; 
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter some numbers 1-100, or 0 to quit : ");
      int entered = input.nextInt();
      
      while(entered >= 1 && entered <= 100)
      {
        box = (entered - 1)/10;
        ranges[box]++;
      
      entered = input.nextInt(); 
      }
      
      for(box = 0; box < 10; box++)
      {
         System.out.print((10*box + 1)+ "-");
         System.out.print((10*box + 10)+ "\t\t|");
         
         for(int count = 0; count < ranges[box];count++)
         {
            System.out.print("*");
         }
      
      System.out.println();
      }   
   
   }
}