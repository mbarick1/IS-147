// This is Exercise 9.5 and my name is MBarick Traore

import java.util.*;

public class TestGregorianCalendarMt
{
   public static void main(String[] args)
   {
      GregorianCalendar date = new GregorianCalendar();
      
      System.out.println("The current year, month and day is : " + date.get(GregorianCalendar.YEAR)+  " - " +
      (date.get(GregorianCalendar.MONTH)+ 1) + " - " +  date.get(GregorianCalendar.DAY_OF_MONTH));
      
      date.setTimeInMillis(1234567898765L);
      
      System.out.println("The month, day and year for 123456788765L Millis is : " + date.get(GregorianCalendar.YEAR) + " - " +
      (date.get(GregorianCalendar.MONTH)+ 1 ) + " - " + date.get(GregorianCalendar.DAY_OF_MONTH)); 
   }
}