public class Rectangle
{
   public double width;
   public double height;
   
   public Rectangle()
   {
      width = 1;
      height = 1;
   }
   
   public Rectangle(double newWidth, double newHeight)
   {
     width =  newWidth ;
     height = newHeight;
   }

   public double getArea()
   {
      return width * height;
   }
   
   public double getPerimeter()
   {
      return 2 * (width + height);
   }
   
   public void setWidth(double newWidth)
   {
      width = newWidth;
   }
   
   public void setHeight(double newHeight)
   {
      height = newHeight; 
   }
   
   public String toString()
   {
      return ("Width: " + width + " Height: " + height + " Perimeter: " + getPerimeter() + " Area: " + getArea());
   }
   
}