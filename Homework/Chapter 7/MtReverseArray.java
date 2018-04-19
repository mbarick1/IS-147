//This is Exercise 7.12 and my name is MBarick Traore 

import java.util.Scanner;

public class MtReverseArray
{
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter 10 numbers :"); 
         int[] numbers = new int[10];
         for(int i = 0; i < numbers.length; i++)
         {
            numbers[i] = input.nextInt();
         }
         System.out.println("The reversal of the input is ");
      
         reverse(numbers);
      
         for(int i = 0; i < numbers.length; i++)
         {
            System.out.print(numbers[i] + " ");
         }
      } 
      public static void reverse(int[] list)
      { 
         int temp = 0;
         for(int i = 0 , j = list.length - 1; i < list.length/2; i++, j--)
         {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp; 
         } 
      }   
}