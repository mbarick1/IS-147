// This is Exercise 9.8 and my name is MBarick Traore

// Design Class 

public class FanMt
{
   private final int SLOW = 1;
   private final int MEDIUM = 2;
   private final int FAST = 3;
   
   private int speed;
   private boolean on;
   private double radius;
   private String color;
   
   public FanMt()
   { 
      speed = SLOW;
      on = false;
      radius = 5;
      color = "blue"; 
   }
   
   public int getSpeed()
   {
      return speed; 
   }
   
   public void setSpeed(int speed)
   {
      this.speed = speed;
   }
    
   public boolean isOn()
   {
      return on; 
   }
   
   public void setOn(boolean on)
   {
      this.on = on;
   }
      
   public double getRadius()
   {
      return radius; 
   }
   
   public void setRadius(double radius)
   {
      this.radius = radius;
   }

   public String getColor()
   {
      return color; 
   }

   public void setColor(String color)
   {
      this.color = color;
   }
   
   public String toString()
   {
      if(on == true)
      {
         return ("The fan speed is " + getSpeed() + ", color is " + getColor() + " and radius is " + getRadius());
      }
      else
      {
         return ("The fan is off. It's color is " + getColor() + " and radius is " + getRadius());
      }
   }
}