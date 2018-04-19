// This is exercise 6.7 homework and my name is MBarick Traore

import java.text.DecimalFormat;

import java.util.Scanner;

public class MtFutureInvestemnt
{  
      public static void main(String[] args)
      { 
         int years = 1;
         Scanner input = new Scanner(System.in);  
         DecimalFormat fmt = new DecimalFormat("0.00");
         
         System.out.print(" Enter an investment amount : ");
         double amount = input.nextDouble();
         System.out.print(" Enter the interest rate : ");
         double interest = input.nextDouble();
         
         System.out.println("Year\t\t\t\tFuture Value");

         for(years = 1; years <= 30; years++)
         {
            System.out.println(years + "\t\t\t\t\t" + fmt.format(futureInvestment(amount, interest, years)));
         }
      }   
     
      public static double futureInvestment(double investmentAmount, double monthlyInterestRat, int years)
      { 
        return investmentAmount * Math.pow((1 + (monthlyInterestRat/1200)), (years*12));    
      }
}


         