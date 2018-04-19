// This is Exercise 5.21 for lab and my name is MBarick Traore

import java.util.Scanner;
import java.text.NumberFormat;

public class MtCompareLoans {
  // Main method
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);//a scanner for amounts
   Scanner again = new Scanner(System.in);// a scanner for the do again string
   //create objects to format % and $ output later
   NumberFormat percent= NumberFormat.getPercentInstance();
   percent.setMaximumFractionDigits(3);
   NumberFormat dollars= NumberFormat.getCurrencyInstance();
   String another="";// to hold the while condition later
   //create a do loop so the user can redo their loans
   do
   {
   
     // Prompt for and accept the user's loan amount
     System.out.print(" Enter loan amount : ");
     double loanAmount =input.nextDouble();
     // Prompt for and accept the number of years for the loan
     System.out.print(" Enter the number of years : ");
     int numOfYears = input.nextInt();

     // Print the header to include "Interest Rate", "Monthly Payment", "Total Payment"
     // for loop to step through the annualInterestRate from 5.0-8.0 by 1/8
     for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 1/8.0 )
     {
         // Obtain monthly interest rate
         double monthlyInterestRate = annualInterestRate / 1200;
         // Compute mortgage
         double monthlyPayment = loanAmount * monthlyInterestRate /
         (1 - (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
         double totalPayment = monthlyPayment * numOfYears * 12;

     // Display results annualInterestRate %, monthlyPayment $, totalPayment $);
     System.out.printf("%-10.3f$%-10.2f$%-10.2f\n",annualInterestRate, monthlyPayment, totalPayment);
     }//end of for loop
      
       //Prompt for another loan
         System.out.print("\nEnter another loan amount : "); 
         another = again.nextLine();// use the again scanner object to grab the user's nextLine
   }//end of do-while
       while(another.equals("yes"));;// make sure to another.equals not another==
    
  }//end of main method
}//end of class           
                 
      
      
      
          
           
      
                                