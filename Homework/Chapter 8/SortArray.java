//This is exercise 8.26 and my name is MBarick Traore

import java.util.Scanner;

public class SortArray
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);      
      
      System.out.print("Enter a 3 by 3 matrix row by row: ");
      int [][] matrix = new int [3][3];
      for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++)
      {
         
         for(int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++)
         {
            matrix[rowIndex][columnIndex] = input.nextInt();
         }
      }  
      System.out.println("My matrix before sort is: ");
      
      for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++)
      {
         for(int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++)
         {
            System.out.print(matrix[rowIndex][columnIndex] + "\t");
         }      
      System.out.println();
      }   
      
      System.out.println("My matrix afetr sort is: ");

      
      for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++)
      {     
            java.util.Arrays.sort(matrix[rowIndex]);     
      }   
      
      for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++)
      {
         for(int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++)
         {
            System.out.print(matrix[rowIndex][columnIndex] + "\t");
         }      
      System.out.println();
      }   

   
   }
} 
    
     
