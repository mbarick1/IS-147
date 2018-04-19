import java.util.Scanner;

public class MyRectangle
{
   public static void main(String[] args)
   {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(4, 2); 
    
    System.out.println("r1 is " + r1);
    System.out.println("r2 is " + r2);
    
    r1.setWidth(8);
    r1.setHeight(6);
    
    System.out.println("The width of r1 is :" + r1.width);
    System.out.println("The height of r1 is :" + r1.height);
    
    System.out.println("r1 is " + r1);
    System.out.println("r2 is " + r2);
    
      }
}