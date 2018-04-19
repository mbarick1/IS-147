import java.util.Scanner;

public class ComputeAreaWithConsoleInput 
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter a number for redius:");
   double radius = input.nextDouble();
   
   if (radius < 0) 
   {
      System.out.println(" incorrect input");
   }
   else
   {
      double area = radius * radius * 3.14159;
      System.out.println(" Area is " + area);
   
   }   

   }
}