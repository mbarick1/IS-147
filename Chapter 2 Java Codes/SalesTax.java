import java.util.Scanner;

public class SalesTax{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("enter a purshase amount:");
    double purshaseAmount = input.nextDouble();
    
    double tax = purshaseAmount * .06;
    
    System.out.println( " Sales tax is $" + (int)(tax * 100)/100.0);
    
    
    
    
    

   }
}