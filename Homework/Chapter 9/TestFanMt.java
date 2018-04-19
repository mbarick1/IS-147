// This is Exercise 9.8 and my name MBarick Traore

// Test program

public class  TestFanMt
{
   public static void main(String[] args)
   {
      FanMt fan1 = new FanMt();
      FanMt fan2 = new FanMt(); 
      
      fan1.setOn(true);
      fan1.setSpeed(3);  
      fan1.setRadius(10);
      fan1.setColor("yellow");
      
      fan2.setOn(false);
      fan2.setSpeed(2);  
      fan2.setRadius(5);
      fan2.setColor("blue");
      
      System.out.println(fan1);
      System.out.println(fan2);
   }
}