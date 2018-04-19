import java.util.Scanner;

public class ComputeAreaWithConstant{
   public static void main(String[] args){
   
   double PI = 3.14159;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print( "Enter number for radius:");
   double radius = input.nextDouble();
   
   double area = radius * radius * PI;
   
   System.out.println(" Area of a circle with radius " + radius + " is " + area);
   
   
   
   }

}