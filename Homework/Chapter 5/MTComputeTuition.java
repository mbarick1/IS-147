// This is Exercise 5.7 for homework and my name is MBarick Traore

public class MTComputeTuition
{
      public static void main(String[] args)
      {
      
         double tuition = 10000;  
         double annualInterestRate = 5 /100.0;
      
         for(int year = 0; year < 10; year++  )
         {
            tuition = tuition * ( 1 + annualInterestRate )  ;  
         }
         
         double fourYearTuition = tuition * 4 ;
         
         System.out.printf("Tuition will be $%.2f in 10 years\n\n",tuition );

         System.out.printf("Total cost of 4 year after 10 years is $%.2f",fourYearTuition);
          
      }
} 