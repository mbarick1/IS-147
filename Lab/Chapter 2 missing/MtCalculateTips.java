import java.util.Scanner;

import java.text.NumberFormat; 

public class MtCalculateTips
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
  
   System.out.print( " Enter a number for subtotal: ");
   double subtotal = input.nextDouble();
   
   System.out.print( " Enter a number for gratuity Rate: ");
   double gratuityRate = input.nextDouble()/100;
   
   double tip = subtotal * gratuityRate;
   
   double total = subtotal + tip;
   
   System.out.println( " your tip is " + fmt.format(tip)); 
   System.out.println( " Your total is " + fmt.format(total));
                        
   
   }
}
   