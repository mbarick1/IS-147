//This is exercise 8.1 and my name is MBarick Traore

import java.util.Scanner;

public class SumElementByColumn
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);      
      
      System.out.println("Enter a 3 by 4 matrix row by row: ");
      int [][] matrix = new int [3][4];
      for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++)
      {
         
         for(int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++)
         {
            matrix[rowIndex][columnIndex] = input.nextInt();
         }
      }       
      for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++)
      {
         for(int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++)
         {
            System.out.print(matrix[rowIndex][columnIndex] + "\t");
         }      
      System.out.println();
      }   
      
      for(int column = 0; column < matrix[0].length; column++)
      {
         System.out.println("The sum of column " + column + " is " + sumColumn(matrix, column));
      }
   }
   
   public static int sumColumn(int[][] m, int columnIndex)
   {
      int total = 0;
      for(int row = 0; row < m.length; row++)
      {
            total += m[row][columnIndex];
      }
   return total;
   }
}