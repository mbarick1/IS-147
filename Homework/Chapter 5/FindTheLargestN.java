// This is Exercise 5.13 for homework and my name is MBarick Traore

public class FindTheLargestN
{
   public static void main(String[] args)
   {
      int n = 1;
      while(Math.pow(n,3) < 12000)
      {
         n++; 
      }
     
      n -= 1;  
      
      System.out.println(" The largest is " + n );

   
   }
}