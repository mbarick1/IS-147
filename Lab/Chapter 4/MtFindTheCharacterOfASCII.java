//This is Exercise 4.8 for lab and my name is MBarick Traore

import java.util.Scanner;

public class MtFindTheCharacterOfASCII
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Enter ASCII code : an integer from 0 to 127 : ");
   int integer  = input.nextInt();
   
   //cast integer to character 
   char ch = (char)integer;
   
   System.out.println( " The character for ASCII code " + integer + " is " + ch);

   }
}