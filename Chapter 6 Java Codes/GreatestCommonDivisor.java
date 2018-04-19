import java.util.Scanner;

public class GreatestCommonDivisor
{
         public static void main(String[] args)
         {
            Scanner input = new Scanner(System.in);
            
            System.out.print(" Enter the first integer : ");
            int n1 = input.nextInt();
            System.out.print(" Enter the second integer : ");
            int n2 = input.nextInt();
            
            System.out.print(gcd(n1,n2));
         }
         
         public static int gcd(int num1, int num2)
         {
            int gcd = 1;
            for (int k = 1; k <= num1 && k <= num2; k++)
            {     
                 if(num1 % k == 0 && num2 % k == 0)
                 {
                   gcd = k ;  
                 }
            }              
            return gcd;         
         }    
}