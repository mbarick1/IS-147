// This is Exercise 2.21 and my name is MBarick Traore

import java.util.Scanner;

import java.text.NumberFormat;

public class MtCalculateFutureInvestmentValue 
{
   public static void main(String[] args) 
   {
   Scanner input = new Scanner(System.in);
   
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   
   System.out.print( "Enter a amount for future investment: ");
   double  investmentAmount = input.nextDouble();
   
   System.out.print( "Enter a number for interest rate : ");
   double monthlyInterestRate = input.nextDouble() /1200;
   
   System.out.print( "Enter a number of years: ");
   int numberOfYears = input.nextInt();
   
   double futureInvestmentValue = investmentAmount * Math.pow
   (1 + monthlyInterestRate, numberOfYears *12);
   
   System.out.println( " Future Value is " + fmt.format(futureInvestmentValue) );
   
   }
}