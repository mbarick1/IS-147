//This is Exercise 9.4 and my name is MBarick Traore

import java.util.*;

public class RandomMt
{
   public static void main(String[] args)
   {
      Random rand = new Random(1000);
      
      for(int i = 0; i < 10; i++)
      {
      System.out.print(rand.nextInt(100) + " ");
      }
   } 
}