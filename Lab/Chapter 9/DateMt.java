//This is Exercise 9.3 and my name is MBarick Traore

import java.util.*;

public class DateMt
{
   public static void main(String[] args)
   {
      Date date = new Date();
  
      long time = 10000;
      for(int count = 0; count < 8; count++)
      {
        time *= 10;
        date.setTime(time);
      System.out.println(date);
      }  
   }
}