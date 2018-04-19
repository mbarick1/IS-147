import java.util.Scanner;

public class FindingGreatestCommonDivisor
{
   
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Enter the first integer : ");
   int n1 = input.nextInt();
   System.out.print(" Enter the second integer : ");
   int n2 = input.nextInt();

   int gcd = 1; // initial common divisor/ all numbers are divible by 1.
   
   int k = 2; // Now check if k is a common divisor , starting at 2, 3, 4, ...... 
   
      while( k <= n1 && k <= n2)
      {
          if ( n1 % k == 0 && n2 % k == 0)
          
          gcd = k;
          
          k++;
      }  
   
   System.out.println(" The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd ); 
   
   }
} 