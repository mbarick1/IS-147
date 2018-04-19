//This is Exercise 4.11 for lab and my name is MBarick Traore 

import java.util.Scanner;

public class MtDecimalToHex
{
   public static void main(String[] args)
   {
    Scanner input= new Scanner(System.in);
    
    System.out.print(" Enter a decimal digit from 0 to 15:");
    int decimalDigit = input.nextInt();
    
    String hexString = Integer.toHexString(decimalDigit).toUpperCase();
    
    System.out.println(" The Hex value of " + decimalDigit + " is " + hexString);


   }
}