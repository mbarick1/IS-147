// This is  Exercise 6.17 for lab and my name is MBarick Traore

import java.util.Scanner;

public class MtDisplayMatrix
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
            
      System.out.print("Enter an integer to dispaly Matrix:");
      int n = input.nextInt();
      
      System.out.print("\n");
      printMatrix(n);
    }
    
    public static void printMatrix(int n)
    {
      for(int i = 1; i <= n; i++ )
      {
         for(int j = 1; j <= n; j++)
         {
            System.out.print((int)(Math.random() * 2) + " ");   
         }
      System.out.println();
      }
    
    }
}